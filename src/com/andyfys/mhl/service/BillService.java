package com.andyfys.mhl.service;

import com.andyfys.mhl.dao.BillDAO;
import com.andyfys.mhl.domain.Bill;


import java.util.List;
import java.util.UUID;

/**
 * @author Andyfys
 * @version 1.0
 */
public class BillService {

    private BillDAO billDAO = new BillDAO();
    private MenuService menuService = new MenuService();
    private DiningTableService diningTableService = new DiningTableService();

    /**
     * 用来创建一个订单，并且在下单后，改变餐桌状态
     */
    public boolean createBill(int menuId, int nums, int diningTableId) {
        String billId = UUID.randomUUID().toString();
        // id自增长 menuId nums diningTableId
        int i = billDAO.queryCommDml("insert into bill values (null,?,?,?,?,?,now(),'未结账')",
                billId, menuId, nums, menuService.getMenuById(menuId).getPrice() * nums, diningTableId);
        if (i <= 0) {
            return false;
        }
        return diningTableService.setDiningTableState(diningTableId, "就餐中");
    }

    /**
     * 返回账单信息
     */
    public List<Bill> getBills() {
        String sql = "select * from bill";
        return billDAO.queryMultiRow(sql, Bill.class);
    }

    /**
     * 去查看bill表中是否存在所查桌号有未结账的账单
     */
    public boolean isUnPaled(int diningTableId) {
        String sql = "select * from bill where diningTableId = ? and state = '未结账' limit 0,1";
        Bill bill = billDAO.querySingleRow(sql, Bill.class, diningTableId);
        if(bill == null){
            return false;
        }
        return true;
    }
    /**
     * 修改bill表的state
     * 修改diningTable的state，以及恢复orderName 和 orderId
     */
    public boolean invoicingBill(int diningTableId,String state){
        //
        String sql = "update bill set state = ? where diningTableId = ?";
        int i = billDAO.queryCommDml(sql, state,diningTableId);
        if (i <= 0){
            return false;
        }
        //修改diningTable表至初始状态
        return diningTableService.setInitTable(diningTableId);
    }
}

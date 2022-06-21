package com.andyfys.mhl.service;

import com.andyfys.mhl.dao.DiningTableDAO;
import com.andyfys.mhl.domain.DiningTable;

import java.util.List;

/**
 * @author Andyfys
 * @version 1.0
 * 对餐桌表进行相关操作
 */
public class DiningTableService {
    private DiningTableDAO diningTableDAO = new DiningTableDAO();


    /**
     * 完成对表的id，state的获取
     * @return
     */
    public List<DiningTable> getDiningTableState(){
        String sql = "select id,state from diningTable";
         return diningTableDAO.queryMultiRow(sql, DiningTable.class);
    }

    /**
     * 从表取出想取得对应的表对象
     * @param id
     * @return 若返回为空，则表示没有查询的桌对象
     */
    public DiningTable getDiningTable(String id){
        String sql = "select * from diningTable where id = ?";
        return diningTableDAO.querySingleRow(sql,DiningTable.class,id);
    }

    /**
     * 进行餐桌的预定
     * @param id
     * @param orderName
     * @param orderTel
     * @return
     */
    public boolean orderTable(String id, String orderName, String orderTel){
        String sql = "update diningTable set state = '已经预定', orderName = ?,orderTel = ? where id = ?";
        int i = diningTableDAO.queryCommDml(sql, orderName, orderTel, id);
        return i > 0;
    }
    /**
     * 以id为依据来对相关餐桌的状态进行设定
     */
    public boolean setDiningTableState(int id,String state){
        String sql = "update diningTable set state = ? where id = ?";
        int i = diningTableDAO.queryCommDml(sql, state, id);
        return i > 0;
    }
    /**
     * 恢复表至初始状态，根据传进来的id
     */
    public  boolean setInitTable(int diningTableId){
        String sql = "update diningTable set state = '空', orderName = '',orderTel = '' where id = ?";
        int i = diningTableDAO.queryCommDml(sql,diningTableId);
        return i > 0;
    }
}

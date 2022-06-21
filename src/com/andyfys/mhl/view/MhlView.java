package com.andyfys.mhl.view;

import com.andyfys.mhl.domain.Bill;
import com.andyfys.mhl.domain.DiningTable;
import com.andyfys.mhl.domain.Employee;
import com.andyfys.mhl.domain.Menu;
import com.andyfys.mhl.service.BillService;
import com.andyfys.mhl.service.DiningTableService;
import com.andyfys.mhl.service.EmployeeService;
import com.andyfys.mhl.service.MenuService;
import com.andyfys.mhl.utils.Utility;

import java.util.List;

/**
 * mhl视图
 *
 * @author Andyfys
 * @version 1.0
 * 满汉楼主界面
 * @date 2022/06/19
 */
public class MhlView {

    private boolean loop = true;
    private String key = "";
    private EmployeeService employeeService = new EmployeeService();
    private DiningTableService diningTableService = new DiningTableService();
    private MenuService menuService = new MenuService();
    private BillService billService = new BillService();


    public static void main(String[] args) {
        new MhlView().mainMenu();
    }


    public void payBills() {
        System.out.println("=================结账服务================");
        System.out.println("请选择要结账的餐桌编号(-1退出): ");
        //先去对输入的数进行检测，再去检查桌子号，再去检查这个桌子是否有需要结账的账单
        int diningTableId = Utility.readInt();
        if (diningTableId == -1) {
            System.out.println("=================退出结账服务================");
            return;
        }
        DiningTable diningTable = diningTableService.getDiningTable(Integer.toString(diningTableId));
        if (diningTable == null) {
            System.out.println("=================所输入的桌位不存在================");
            return;
        }
        if (!billService.isUnPaled(diningTableId)) {
            System.out.println("=================所输入的桌位不存在未结账的账单================");
            return;
        }
        System.out.println("结账的方式(现金/支付宝/微信)回车表示退出: ");
        String payMod = Utility.readString(30, "");
        if (payMod == "") {
            System.out.println("=================退出结账服务================");
            return;
        }
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            if (billService.invoicingBill(diningTableId, payMod)) {
                System.out.println("=================结账成功================");
            } else {
                System.out.println("=================结账失败================");
                return;
            }

        } else {
            System.out.println("=================退出结账服务================");
        }

    }


    public void checkBills() {
        System.out.println("\n编号\t\t菜品号\t\t菜品量\t\t金额\t\t桌号\t\t日期\t\t\t\t\t\t\t状态");
        List<Bill> bills = billService.getBills();
        for (Bill bill : bills) {
            System.out.println(bill);
        }
        System.out.println("=================显示完毕================");

    }


    public void orderMenu() {
        //用来创建订单并且对相关数据进行校验
        System.out.println("=================点餐服务================");
        //
        System.out.print("请选择点餐的桌号(-1退出): ");
        String orderTableId = Utility.readString(30);
        if ("-1".equals(orderTableId)) {
            System.out.println("=================退出点餐服务================");
            return;
        }
        DiningTable diningTable = diningTableService.getDiningTable(orderTableId);
        if (diningTable == null) {
            System.out.println("=================桌号不存在================");
            return;
        }
        int tableIdOrder = Integer.parseInt(orderTableId);
        //
        System.out.print("请选择要菜品编号(-1退出): ");
        int orderMenuId = Utility.readInt();
        if (orderMenuId == -1) {
            System.out.println("=================退出点餐服务================");
            return;
        }
        Menu menuById = menuService.getMenuById(orderMenuId);
        if (menuById == null) {
            System.out.println("=================桌号不存在================");
            return;
        }
        //
        System.out.print("请选择要菜品数量(-1退出): ");
        int orderMenuNums = Utility.readInt();
        if (orderMenuNums == -1) {
            System.out.println("=================退出点餐服务================");
            return;
        }
        boolean bill = billService.createBill(orderMenuId, orderMenuNums, tableIdOrder);
        if (bill) {
            System.out.println("=================点餐成功================");
        } else {
            System.out.println("=================点餐失败================");
        }
    }


    /**
     * 显示菜品
     */
    public void showMenu() {
        System.out.println("菜品编号\t\t菜品名\t\t类别\t\t价格");
        List<Menu> menus = menuService.menuList();
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }


    /**
     * 预定餐桌
     */
    public void orderTable() {
        System.out.println("=================预定餐桌================");
        System.out.print("请选择要预定餐桌编号(-1退出):");
        String tableNum = Utility.readString(30);
        if (("-1".equals(tableNum))) {
            System.out.println("=================退出餐桌预定================");
            return;
        } else {
            char c = Utility.readConfirmSelection();
            if (c == 'N') {
                System.out.println("=================退出餐桌预定================");
                return;
            }
            DiningTable diningTable = diningTableService.getDiningTable(tableNum);
            if (diningTable == null) {
                System.out.println("=================预定餐桌不存在================");
                return;
            }
            if ("空".equals(diningTable.getState())) {
                System.out.print("预定人名字:");
                String userName = Utility.readString(20);
                System.out.print("预定人电话:");
                String userTel = Utility.readString(20);
                boolean b = diningTableService.orderTable(tableNum, userName, userTel);
                if (b) {
                    System.out.println("=================预定成功================");
                } else {
                    System.out.println("=================预定餐桌失败================");
                    return;
                }
            } else {
                System.out.println("=================预定餐桌不可预定================");
            }
        }

    }

    /**
     * 显示餐桌状态
     */
    public void showDiningTableState() {
        System.out.println("\n餐桌编号\t\t餐桌状态");
        List<DiningTable> diningTableState = diningTableService.getDiningTableState();
        for (DiningTable diningTable : diningTableState) {
            System.out.println(diningTable);
        }
        System.out.println("=================显示完毕================");
    }

    /**
     * 负责主界面的显示
     */
    public void mainMenu() {
        while (loop) {
            System.out.println("=================满汉楼================");
            System.out.println("1 登录满汉楼");
            System.out.println("2 退出满汉楼");
            System.out.print("请输入你的选择: ");
            key = Utility.readString(1);
            switch (key) {
                case "1":
                    System.out.print("请输入员工号: ");
                    String id = Utility.readString(40);
                    System.out.print("请输入密 码: ");
                    String pwd = Utility.readString(40);
                    //括号内写死，为了模拟登陆环境
                    Employee employee = employeeService.employeeLogin(id, pwd);
                    if (employee != null) {
                        System.out.println("登录成功");
                        //若登陆成功则显示二级菜单
                        while (loop) {
                            System.out.println("=================满汉楼二级菜单[欢迎员工: " + employee.getName() + "]================");
                            System.out.println("1 显示餐桌状态");
                            System.out.println("2 预定餐桌");
                            System.out.println("3 显示所有菜品");
                            System.out.println("4 点餐服务");
                            System.out.println("5 查看账单");
                            System.out.println("6 结账");
                            System.out.println("9 退出满汉楼");
                            System.out.print("请输入你的选择: ");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    showDiningTableState();
                                    break;
                                case "2":
                                    orderTable();
                                    break;
                                case "3":
                                    showMenu();
                                    break;
                                case "4":
                                    orderMenu();
                                    break;
                                case "5":
                                    checkBills();
                                    break;
                                case "6":
                                    payBills();
                                    break;
                                case "9":
                                    loop = false;
                                    break;
                                default:
                                    System.out.println("输入不合法，请检查输入");
                            }
                        }
                    } else {
                        System.out.println("登录失败，请检查账户名或密码");
                    }
                    break;
                case "2":
                    loop = false;
                    break;
                default:
                    System.out.println("输入不合法，请重新输入");
            }
        }
        System.out.println("退出满汉楼系统");
    }
}

package com.andyfys.mhl.service;

import com.andyfys.mhl.dao.MenuDAO;
import com.andyfys.mhl.domain.Menu;

import java.util.List;

/**
 * @author Andyfys
 * @version 1.0
 */
public class MenuService {
    private MenuDAO menuDAO = new MenuDAO();



    public List<Menu> menuList(){
        String sql = "select * from menu";
        return menuDAO.queryMultiRow(sql,Menu.class);
    }
    /**
     * 根据id来获取对应的menu对象
     */
     public Menu getMenuById(int id){
        String sql = "select * from menu where id = ?";
         return menuDAO.querySingleRow(sql, Menu.class, id);
     }
}

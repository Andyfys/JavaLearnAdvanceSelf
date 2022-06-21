package com.andyfys.mhl.service;

import com.andyfys.mhl.dao.EmployeeDAO;
import com.andyfys.mhl.domain.Employee;

/**
 * @author Andyfys
 * @version 1.0
 * 用于编写sql执行类相关的逻辑操作
 */
public class EmployeeService {
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    /**
     * 用于验证员工登录
     *
     * @param empId
     * @param pwd
     * @return
     */
    public Employee employeeLogin(String empId, String pwd) {
        String sql = "select * from employee where empId = ? and pwd = md5(?)";
        return employeeDAO.querySingleRow(sql, Employee.class, empId, pwd);

    }


}

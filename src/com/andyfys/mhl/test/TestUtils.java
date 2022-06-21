package com.andyfys.mhl.test;

import com.andyfys.mhl.utils.JDBCUtils4Druid;
import com.andyfys.mhl.utils.Utility;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

/**
 * @author Andyfys
 * @version 1.0
 */
public class TestUtils {
    public static void main(String[] args) {
        System.out.print("请输入一个数字:");
        int i = Utility.readInt();
        System.out.println("i = " + i);


    }
    @Test
    public void testConnection(){
        Connection connection = JDBCUtils4Druid.getConnection();
        System.out.println(connection);


    }
}

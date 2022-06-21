package com.andyfys.mhl.dao;

import com.andyfys.mhl.utils.JDBCUtils4Druid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Andyfys
 * @version 1.0
 * 整合所有DAO下的共有方法，为所有DAO类的集体父类
 */
public class BasicDAO<T> {
    /**
     * 需要通过这个属性来为不同情况下获取不同的方法
     */
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * dml
     */

    public int queryCommDml(String sql, Object... perimeter) {
        Connection connection = null;
        try {
            connection = JDBCUtils4Druid.getConnection();
            return queryRunner.update(connection, sql, perimeter);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils4Druid.close(null, null, connection);
        }
    }

    /**
     * 多行多列
     */
    public List<T> queryMultiRow(String sql, Class<T> tClass, Object... perimeter) {
        Connection connection = null;
        try {
            connection = JDBCUtils4Druid.getConnection();
            return queryRunner.query(connection, sql, new BeanListHandler<T>(tClass), perimeter);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils4Druid.close(null, null, connection);
        }
    }

//    public List<T> queryMulti(String sql, Class<T> clazz, Object... parameters) {
//        Connection connection = null;
//        try {
//            connection = JDBCUtils4Druid.getConnection();
//            return queryRunner.query(connection, sql, new BeanListHandler<T>(clazz), parameters);
//        } catch (SQLException e) {
//            throw new RuntimeException(e); //将编译异常->运行异常 ,抛出 第 1165页
//            //韩顺平循序渐进学 Java 零基础
//        } finally {
//            JDBCUtils4Druid.close(null, null, connection);
//        }
//    }

    /**
     * 单行
     */

    public T querySingleRow(String sql, Class<T> tClass, Object... perimeter) {
        Connection connection = null;
        try {
            connection = JDBCUtils4Druid.getConnection();
            return queryRunner.query(connection, sql, new BeanHandler<T>(tClass), perimeter);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils4Druid.close(null, null, connection);
        }
    }

    /**
     * 单行单列
     */
    public Object queryScalar(String sql, Object... perimeter) {
        Connection connection = null;
        try {
            connection = JDBCUtils4Druid.getConnection();
            return queryRunner.query(connection, sql, new ScalarHandler<T>(), perimeter);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils4Druid.close(null, null, connection);
        }
    }


}

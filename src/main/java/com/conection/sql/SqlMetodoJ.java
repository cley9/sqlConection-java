/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conection.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author cley
 */
public class SqlMetodoJ {

    public Connection sqlServer(String dbName, String username, String password, String hostname) throws ClassNotFoundException {
        SqlClass getCon = new SqlClass(dbName, username, password, hostname);
        String port = "1433";
        String jdbcUrl = "jdbc:sqlserver://" + getCon.getHostname() + ":" + port + ";databaseName=" + getCon.getDbName() + ";user=" + getCon.getUsername() + ";password=" + getCon.getPassword();
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(jdbcUrl);
            Class.forName(driver);
            System.out.println("Successful connection");
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
        return conn;
    }

    public Connection sqlMysql(String dbName, String username, String password, String hostname) throws ClassNotFoundException {
        SqlClass getCon = new SqlClass(dbName, username, password, hostname);
        String port = "3306";
        String jdbcUrl = "jdbc:mysql://" + getCon.getHostname() + ":" + port + "/" + getCon.getDbName() + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        Connection conn = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Successful connection");
            return conn;
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
        return conn;

    }
}

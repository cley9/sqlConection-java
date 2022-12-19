package com.conection.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cley
 */
public class SqlClass {
  public String dbName = "";
  public String username = "";
  public String password = "";
  public String hostname = "";

    public SqlClass(String dbName, String username, String password, String hostname) {
        this.dbName=dbName;
        this.username=username;
        this.password=password;
        this.hostname=hostname;
    }

  
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

  
   
  
       
}

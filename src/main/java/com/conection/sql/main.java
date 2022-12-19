/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conection.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cley
 */
public class main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Statement st = null;
        ResultSet rs = null;
        SqlMetodoJ me = new SqlMetodoJ();
        Connection co = me.sqlMysql("dbaregistro", "cley", "cley", "localhost");
        //---statement sql 
        st = co.createStatement();
        String sql="insert registro(DNI,Nombre,Apellido,Nacionalidad)values(1234567,'carlos','Torres','Peru')";
            st.executeUpdate(sql);
/*        rs = st.executeQuery("SELECT * FROM registro");
        while (rs.next()) {
            int id = rs.getInt(1);
            String nombre = rs.getString(2);
            System.out.println("id - " + id + " nombre " + nombre);
        }
*/
    }
}

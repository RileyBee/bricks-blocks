/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author riley
 */
public class DBConnection {
    private static final String DRIVER="org.apache.derby.jdbc.EmbeddedDriver";
    private static final String JDBC_URL="jdbc:derby:brickexample;create=true";
    
    Connection conn;
    
        public DBConnection() {
            try {
                this.conn = DriverManager.getConnection(JDBC_URL);
                if  (this.conn != null) {
                    System.out.println("Connected to Database");
                 }
          }   catch (SQLException ex) {
                   Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
          }         
     }
        
public void createTable()  {
        try {
            conn.createStatement().execute("Create Table MatTable(material varchar (25), unit_cost INT, length INT, height INT, volume INT, mat_flag char(1)");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}     
 
public void insertIntoTable(String material, int unit_cost, int length, int height, int volume, char mat_flag) {
        try {
              conn.createStatement().execute("INSERT INTO MatTable Values('"+material+"', "+unit_cost+", "+length+", "+height+", "+volume+", '"+mat_flag+"' )");
                } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    
}
       
}

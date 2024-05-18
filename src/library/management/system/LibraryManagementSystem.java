/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author shrut
 */
public class LibraryManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        // TODO code application logic here
        Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","shruthi");
                System.out.println(con);
            } catch (SQLException ex) {
                Logger.getLogger(LibraryManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(LibraryManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

        

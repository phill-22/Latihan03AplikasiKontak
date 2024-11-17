
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS ROG
 */
public class koneksi {
        private static final String URL = "jdbc:sqlite:kontak.db";
        
        public static Connection konek(){
            try {
                return DriverManager.getConnection(URL);
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        public static void tutup(Connection conn){
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Estas son constantes, van fuera de los métodos [cite: 74, 75]
    private static final String URL = "jdbc:mariadb://localhost:3306/inventario";
    private static final String USER = "root";
    private static final String PASS = ""; 

    public static Connection getConexion() throws SQLException {
        // El return debe ser una sola instrucción [cite: 78, 82]
        return DriverManager.getConnection(URL, USER, PASS);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import model.Producto; // Importación corregida
import java.sql.*;

public class ProductoDAO {
    public boolean actualizar(Producto producto) {
        String sql = "UPDATE producto SET nombre=?, descripcion=?, precio=?, cantidad=?, categoria_id=? WHERE id=?";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getCantidad());
            ps.setInt(5, producto.getCategoriaId());
            ps.setInt(6, producto.getId()); // El ID es el sexto parámetro [cite: 124]

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
            return false;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db; // O el nombre exacto de tu carpeta de paquetes

import model.Categoria; // Asegúrate que coincida con tu paquete de modelo
import java.sql.*;

public class CategoriaDAO {

    public boolean actualizar(Categoria categoria) {
        // El orden de los '?' define el índice (1, 2, 3, 4) [cite: 100, 110]
        String sql = "UPDATE categoria SET nombre=?, descripcion=?, activa=? WHERE id=?";
        
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            // Llenamos los huecos según el taller [cite: 101, 102, 103, 104]
            ps.setString(1, categoria.getNombre());
            ps.setString(2, categoria.getDescripcion());
            ps.setBoolean(3, categoria.isActiva());
            ps.setInt(4, categoria.getId()); // El id es el cuarto parámetro [cite: 110]

            // Retorna un int; si es > 0, funcionó [cite: 111]
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.out.println("Error en la base de datos: " + e.getMessage());
            return false;
        }
    }
}

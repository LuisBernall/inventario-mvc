/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.udistrital.multinivel.inventario.mvc; // Este nombre debe ser exacto a la carpeta

import controller.InventarioController;
import db.CategoriaDAO;
import db.ProductoDAO;
import view.InventarioView;

public class InventarioMvc {
    public static void main(String[] args) {
        InventarioView vista = new InventarioView();
        CategoriaDAO cDao = new CategoriaDAO();
        ProductoDAO pDao = new ProductoDAO();
        
        InventarioController control = new InventarioController(vista, cDao, pDao);
        control.iniciar();
    }
}

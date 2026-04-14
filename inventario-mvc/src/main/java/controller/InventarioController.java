/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import db.CategoriaDAO;
import db.ProductoDAO;
import view.InventarioView;
import model.Producto;

public class InventarioController {
    private InventarioView view;
    private CategoriaDAO catDAO;
    private ProductoDAO prodDAO;

    public InventarioController(InventarioView view, CategoriaDAO catDAO, ProductoDAO prodDAO) {
        this.view = view;
        this.catDAO = catDAO;
        this.prodDAO = prodDAO;
    }

    public void iniciar() {
        int op;
        do {
            op = view.mostrarMenu();
            if (op == 2) actualizarProductoPrueba();
        } while (op != 0);
    }

    private void actualizarProductoPrueba() {
        Producto p = new Producto();
        p.setId(1);
        p.setNombre("Producto Editado");
        if (prodDAO.actualizar(p)) {
            view.mostrarMensaje("Producto actualizado correctamente.");
        }
    }
}

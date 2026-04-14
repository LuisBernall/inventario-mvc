/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Categoria;
import java.util.List; // ¡Esta línea es la que te faltaba!
import java.util.Scanner;

public class InventarioView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n1. Listar Categorías\n2. Actualizar Producto\n0. Salir");
        System.out.print("Seleccione: ");
        return Integer.parseInt(sc.nextLine());
    }

    public void mostrarMensaje(String m) { System.out.println(m); }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bblioteca1;

/**
 *
 * @author mauro
 */

import java.util.ArrayList; // Importante para que funcione la lista
import java.util.List;

public class Biblioteca {
    // Definimos una lista que solo guarda objetos de tipo 'ArticulosBiblioteca'
   private List<ArticulosBiblioteca> listaArticulos;
   
   // Constructor: Inicializamos la lista vacía
    public Biblioteca() {
        this.listaArticulos = new ArrayList<>();
    }
    
    // 1. Agregar material
    public void agregarMaterial(ArticulosBiblioteca m) {
        listaArticulos.add(m);
        System.out.println("✅ Artículo agregado al inventario.");
    }
    
    // 2. Listar todos los materiales
    public void listarMateriales() {
        System.out.println("\n--- 📚 INVENTARIO DE LA BIBLIOTECA ---");
        if (listaArticulos.isEmpty()) {
            System.out.println("La biblioteca está vacía por ahora.");
        } else {
            for (ArticulosBiblioteca m : listaArticulos) {
                System.out.println(m.toString());
            }
        }
    }
    
    // 3. Buscar por título (devuelve el objeto o null si no existe)
    public ArticulosBiblioteca buscarPorTitulo(String titulo) {
        for (ArticulosBiblioteca m : listaArticulos) {
            // Comparamos el nombre ignorando mayúsculas/minúsculas
            if (m.getNombre().equalsIgnoreCase(titulo)) {
                return m;
            }
        }
        return null;
    }
    
    public void prestarMaterial(String titulo) {
        ArticulosBiblioteca m = buscarPorTitulo(titulo);
        if (m != null) {
            m.prestar(); // Llama al método prestar del objeto encontrado
        } else {
            System.out.println("❌ Error: No se encontró ningún artículo con ese nombre.");
        }
    }
    
    public void devolverMaterial(String titulo) {
        ArticulosBiblioteca m = buscarPorTitulo(titulo);
        if (m != null) {
            m.devolver();
        } else {
            System.out.println("❌ Error: No se encontró ningún artículo con ese nombre.");
        }
    }
   
}

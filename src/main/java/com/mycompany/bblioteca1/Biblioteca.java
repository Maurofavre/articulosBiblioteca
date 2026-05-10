/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bblioteca1;

/**
 *
 * @author mauro
 */

import java.util.ArrayList; 
import java.util.List;

public class Biblioteca {
   
   private List<ArticulosBiblioteca> listaArticulos;
   
   // Constructor
    public Biblioteca() {
        this.listaArticulos = new ArrayList<>();
    }
    
    
    public void agregarMaterial(ArticulosBiblioteca nuevo) {
        listaArticulos.add(nuevo);
        System.out.println("Artículo agregado");
    }
    
  
    public void listarMateriales() {
       
        if (listaArticulos.isEmpty()) {
            System.out.println("Biblioteca vacia");
        } 
        else 
        {
            for (ArticulosBiblioteca articulos : listaArticulos) {
                System.out.println(articulos.toString());
            }
        }
    }
    
   
    public ArticulosBiblioteca buscarPorTitulo(String titulo) {
        for (ArticulosBiblioteca articuloBuscado : listaArticulos) {
        
            if (articuloBuscado.getNombre().equalsIgnoreCase(titulo)) {
                return articuloBuscado;
            }
        }
        return null;
    }
    
    public void prestarMaterial(String titulo) {
        ArticulosBiblioteca nuevoArt = buscarPorTitulo(titulo);
        if (nuevoArt != null) {
            nuevoArt.prestar(); 
        } else {
            System.out.println("Articulo no encotrado");
        }
    }
    
    public void devolverMaterial(String titulo) {
        ArticulosBiblioteca nuevoArtDevuelto = buscarPorTitulo(titulo);
        if (nuevoArtDevuelto != null) {
            nuevoArtDevuelto.devolver();
        } else {
            System.out.println(" Articulo no encontrado");
        }
    }
   
}

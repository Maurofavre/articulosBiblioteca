/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bblioteca1;

/**
 *
 * @author mauro
 */
public class Articulo extends ArticulosBiblioteca {
    
    private String autor;

    public Articulo(String nombre, int año, String autor) {
        super(nombre, año); 
        this.autor = autor;
    }
    
    @Override
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println(" El artículo " + getNombre() + " ha sido prestado");
        } else {
            System.out.println( getNombre() + " ya está prestado");
        }
    }

    @Override
    public void devolver() {
       
        
        if (!disponible) {
      
            disponible = true;
            System.out.println(" Has devuelto el articulo" + getNombre());
        } else {
            System.out.println("Artículo ya estaba disponible");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Autor: " + autor;
    }
} 
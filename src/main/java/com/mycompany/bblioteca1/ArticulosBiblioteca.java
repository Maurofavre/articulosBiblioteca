/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bblioteca1;

/**
 *
 * @author mauro
 */
public abstract class ArticulosBiblioteca implements Acciones{
  
    private String nombre;
    private int año;
    protected boolean disponible;
    
    
    public ArticulosBiblioteca(String nombre, int año) {
        this.nombre = nombre;
        this.año = año;
        this.disponible = true; 
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

    public boolean Disponible() {
        return disponible;
    }

    @Override
    public String toString() {
        String estado = disponible ? "Si esta disponible" : "No se encuentra Disponible";
        return "Nombre: " + nombre + "Año: " + año + "Disponibilidad: " + estado;
    }
    
}

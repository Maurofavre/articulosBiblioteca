/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bblioteca1;

/**
 *
 * @author mauro
 */
public abstract class ArticulosBiblioteca implements Prestable{
   //creamos los articulos
    
    private String nombre;
    private int año;
    protected boolean disponible;
    
    //constructor
    public ArticulosBiblioteca(String nombre, int año) {
        this.nombre = nombre;
        this.año = año;
        this.disponible = true; // Por defecto, al crear algo nuevo, está disponible
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
        String estado = disponible ? "No se encuentra Disponible" : "Si esta disponible";
        return "Nombre: " + nombre + "Año: " + año + "Disponibilidad: " + estado;
    }
    
}

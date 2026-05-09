/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bblioteca1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. Instanciamos el gestor y el Scanner
        Biblioteca miBiblioteca = new Biblioteca();
        Scanner leer = new Scanner(System.in);
        int opcion;

        // 2. Bucle principal
        do {
            System.out.println("Bienvenido, ¿Que desea hacer?");
            System.out.println("1) Agregar libro");
            System.out.println("2) Listar materiales");
            System.out.println("3) Buscar por título");
            System.out.println("4) Prestar material");
            System.out.println("5) Devolver material");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opción: ");

            // Leemos la opción (y manejamos el enter sobrante)
            try {
                opcion = Integer.parseInt(leer.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0; // Si el usuario ingresa letras, ponemos 0 para que sea inválido
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese título: ");
                    String titulo = leer.nextLine();
                    System.out.print("Ingrese año: ");
                    int anio = Integer.parseInt(leer.nextLine());
                    System.out.print("Ingrese autor: ");
                    String autor = leer.nextLine();
                    
                    Articulo nuevo = new Articulo(titulo, anio, autor);
                    miBiblioteca.agregarMaterial(nuevo);
                    break;

                case 2:
                    miBiblioteca.listarMateriales();
                    break;

                case 3:
                    System.out.print("Ingrese el título a buscar: ");
                    String busqueda = leer.nextLine();
                    ArticulosBiblioteca encontrado = miBiblioteca.buscarPorTitulo(busqueda);
                    if (encontrado != null) {
                        System.out.println("🔍 Encontrado: " + encontrado);
                    } else {
                        System.out.println("❌ No se encontró ningún material con ese título.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el título del material a PRESTAR: ");
                    String tPrestar = leer.nextLine();
                    miBiblioteca.prestarMaterial(tPrestar);
                    break;

                case 5:
                    System.out.print("Ingrese el título del material a DEVOLVER: ");
                    String tDevolver = leer.nextLine();
                    miBiblioteca.devolverMaterial(tDevolver);
                    break;

                case 6:
                    System.out.println("👋 Saliendo del sistema. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("⚠️ Opción inválida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 6);
        
        leer.close(); // Cerramos el scanner al terminar
    }
}
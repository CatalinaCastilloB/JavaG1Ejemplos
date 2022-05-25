package com.generation.dia20220525;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);// ingreso por consola;
        // Solicitar edad
        //("Ingrese su edad:");
        int edad = sc.nextInt();

        // Constantes

        //valores
        int valorTicket = 3500;


        //validar descuentos por edad

        //variables
        int cotaMinima = 15;
        int cotaMaxima = 60;
        float descuentoMenor = (float) 0.6;
        float descuentoMayor = (float) 0.55;


        if (edad <= cotaMinima) {
            //Ticket con 55% descuento
            float valor = valorTicket * (1 - descuentoMenor);
            System.out.println("El precio del ticket es de: " + valor);
        } else if (edad > 60) {
            float valor = valorTicket * (1 - descuentoMayor);
            System.out.println("El precio del ticket es de: " + valor);

            //Ticket con 60% descuento
        } else {
            // Ticket normal
            float valor = valorTicket;
            System.out.println("El precio del ticket es de: " + valor);
        }

    }

}

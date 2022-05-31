package com.generation.dia20220531;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //la clase Cliente necesita 4 variables
        Cliente cliente = new Cliente();
        Cliente ejCliente = new Cliente();

        //ejemplo estatico
        cliente.setId(12345);
        cliente.setNombre("Fabiola");
        cliente.setCorreo("fabiola@hola.cl");
        cliente.setRut("123456789-0");

        //ejemplo dinamico


        System.out.println("Ingrese nombre de cliente:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese correo");
        String correo = sc.nextLine();
        System.out.println("Ingrese rut");
        String rutStr = sc.nextLine();
        System.out.println("Ingrese id");
        String idStr = sc.nextLine();

        try {
            Integer id = Integer.parseInt(idStr);
            ejCliente.setId(id);
        } catch (Exception prueba) {
            System.out.println("No ingreso numero id correctamente");
            System.out.println("probando cosas: " + prueba);
        }


        // este
        /*try {
            Integer rut = Integer.parseInt(rutStr);
            ejCliente.setRut(rut);
        }catch (Exception e){ el exception captura cualquier error, esta es excepcion generica

        }*/


        //setea los datos
        ejCliente.setRut(rutStr);
        ejCliente.setNombre(nombre);
        ejCliente.setCorreo(correo);
        //ejCliente.setId(id);

        System.out.println(ejCliente.toString());


        /*The following are a few built-in classes used to handle unchecked exceptions in java.

                ArithmeticException
                NullPointerException  = al tratar de trabajar un null con algo , ej null + 1 no se puede
                NumberFormatException
                ArrayIndexOutOfBoundsException
                StringIndexOutOfBoundsException*/

        /* estas son excepciones internas de java, pero como puede ser un error de ingreso de dato
        aprovecho esta exception para regresar un mensaje personificado al usuario, por un error tipo "ingreso",
        y no de formato o pointer etc.
        */

    }
}

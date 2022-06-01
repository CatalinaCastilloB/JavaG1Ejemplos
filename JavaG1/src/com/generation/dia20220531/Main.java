package com.generation.dia20220531;

import com.generation.dia20220531.manager.ClienteManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        int index = 0;
        //la clase Cliente necesita 4 variables
        Cliente cliente = new Cliente();


        List<Cliente> listaClientes = new ArrayList<Cliente>();

        //ejemplo estatico
        cliente.setId(12345);
        cliente.setNombre("Fabiola");
        cliente.setCorreo("fabiola@hola.cl");
        cliente.setRut("123456789-0");

        //ejemplo dinamico

        do {
            Cliente ejCliente = new Cliente();

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
            } catch (NullPointerException e) {
                System.out.println("error al trabajar con null");
            } catch (Exception prueba) { //excepcion generico
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
            listaClientes.add(index,ejCliente);
            index++;

        /*The following are a few built-in classes used to handle unchecked exceptions in java.

                ArithmeticException  = ej division por cero 100/0
                NullPointerException  = al tratar de trabajar un null con algo , ej null + 1 no se puede
                NumberFormatException
                ArrayIndexOutOfBoundsException
                StringIndexOutOfBoundsException*/

        /* estas son excepciones internas de java, pero como puede ser un error de ingreso de dato
        aprovecho esta exception para regresar un mensaje personificado al usuario, por un error tipo "ingreso",
        y no de formato o pointer etc.
        */

        /* algunas empresas tienen una clase de errores con todas las excepciones
        y los errores especificos, y corren todos los datos por esta clase, valiudando
        los datos
         */
            do {
                System.out.println("Desea seguir ingresando clientes? [1] si, [0] no");
                opcion = sc.nextInt();

            }while(opcion > 1 || opcion < 0);
            sc.nextLine();
        }while(opcion !=0);



        ClienteManager cm = new ClienteManager();

        cm.recorreArregloCliente(listaClientes);





    }
}

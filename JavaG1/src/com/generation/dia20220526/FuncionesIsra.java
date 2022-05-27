package com.generation.dia20220526;
import java.util.Scanner;
public class FuncionesIsra {

    public static void main(String[] args) {
        //Funciones o metodos
        //4 tipo de funciones
        // las funciones de tipo void, no retornan, solo ejecutan codigo
        // nombre_funcion se escribe con minuscula la primera letra
        //no se puede crear un metodo dentro de otro metodo, pero si se puede llamar

        saludo();
        calculoSumaPares(true, 2,"2", 434l, "sumar");
        int edad = obtenerEdad();
        System.out.println(edad);

    }

    //accesador tipo_de_retorno nombre_funcion(parametro a recibir)
    public static void calculoSumaPares(boolean verdad, int numero1, String numero2, Long numero3, String accion) {

        System.out.println(numero1 + numero3 + Integer.parseInt(numero2) );
    }

    public static void saludo() {
        //solicitar el ingreso de datos
        System.out.println("Bueno dias");
    }

    //funciones que retornan un tipo de datos
    public static Integer obtenerEdad() {
        Scanner edad1 = new Scanner(System.in);
       // Integer edad = Integer.parseInt(edad1);

        //return edad;//retornar el contenido de la variable
        return 18;
    }

    public Boolean validarMayorEdad(Integer edad) {

        if(edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        }else {
            System.out.println("Es menor de edad");
            return false;
        }


        //return true; //false
    }

}

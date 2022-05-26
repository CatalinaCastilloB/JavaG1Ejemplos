package com.generation.dia20220526;

public class FuncionesIsra {

    public static void main(String[] args) {
        //Funciones o metodos
        //4 tipo de funciones
        // las funciones de tipo void, no retornan, solo ejecutan codigo
        // nombre_funcion se escribe con minuscula la primera letra
        //no se puede crear un metodo dentro de otro metodo, pero si se puede llamar

        saludo();

    }

    //accesador tipo_de_retorno nombre_funcion(parametro a recibir)
    public void calculoSumaPares(boolean verdad,int numero1, String numero2, Long numero3, String accion) {

        System.out.println(numero1 + numero3 + numero2 );
    }

    public static void saludo() {
        //solicitar el ingreso de datos
        System.out.println("Bueno dias");
    }

    //funciones que retornan un tipo de datos
    public Integer obtenerEdad() {

        Integer edad = 18;

        return 18;//retornar el contenido de la variable

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

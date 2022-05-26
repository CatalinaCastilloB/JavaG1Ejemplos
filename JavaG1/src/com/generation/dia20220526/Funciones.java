package com.generation.dia20220526;

public class Funciones {
    public static void main(String[] args) {
        //refactorizacion: mejorar o aclara codigo hecho previamente


    }

    //funciones, son 4 tipos, fuera de main, pues esta ya es una funcion

    //accesador (public private ...)
    //public: se puede llamar de cualquier parte


    //static : no cambia el metodo
    // void: es un tipo de retorno!, hay 2 tipos de funciones que tienen retorno, las otras dos, no tienen retorno
    //estructura de las funxiones: accesador tipo_de_retorno nombre_funcion(parametros)

    //funciones de tipo void no retornan
    //el nombre de la funcion siempre se escribe con minuscula la ´primera letra

    public void calculoSumasPares(int num1, String num2){
        //la DEFINICION DE LOS PARAMETROS VA ENTRE () AL DEFINIR LA FUNCION

    }


    public void calculoSumasImpares(){
        //solicitar ingreso de datos
    }

    //retorna un tipo de dato
    public Integer miEdad(){
        Integer edad = 23;
        return edad;
    }

    //argumentos
    public Boolean validarEdad(Integer edad ){
        if(edad>= 18){
            return true;
        }else{
            return false;
        }
    }

}

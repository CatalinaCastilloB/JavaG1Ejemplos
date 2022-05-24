package com.generation.dia20220523;

import java.security.spec.RSAOtherPrimeInfo;

/**
 * Estudio de variables
 *
 **/
public class Main {
    public static void main(String[] args){
        //Variables
        // Se define el tipo de dato al cual pertenece la variable
        //Tipo_de_dato nombre_variable = asignacion;
        String nombre = "Sebastian \n es muy lindo";
        //el nombre de variable string no exite (minuscula)
        //Se tiende a poner una mayuscula al inicio de nueva palabra, el inicio es con minuscula

        //16bytes
        System.out.println(nombre);
        char letra = 'a'; //el char pide comilla simple, no doble, a diferencia de String

        //variables primitivas
        int NumeroInt = 2147483647; //numero entero
        System.out.println(NumeroInt);

        //8bytes
        byte NumeroByte = 127;
        System.out.println(NumeroByte);

        //16bytes
        short NumeroShort = 439;
        System.out.println(NumeroShort);

        //64bytes
        long NumeroLong = 2^63;
        System.out.println(NumeroLong);

        //int y long son datos primitivos, short y long no se utilizan por que el int los contiene

        //variables primitivas mas grandes, double y float

        //variable booleana (verdadero o falso), tambien son vaariables primitivas
        boolean acepta = true;
        boolean NoAcepta = false;

        //genero, color de cabello y comprometivo
        char Genero = 'f';
        String Pelo = "castaño";
        boolean comprometido = true;


        /*Población Edad Nombre Ocupación Género */
        String Poblacion = "La viñita";
        byte edad = 26;
        String Nombre = "catalina";
        String Ocupacion = "estudiante";
        char genero = 'f';

        //variables de tipo objeto: String
        System.out.println(Ocupacion.charAt(2));
        Ocupacion.concat(" y lo sabes");

        String curso = "G1";

        //LOS STRING SE COMPARAN CON EQUALS
        if(curso.equalsIgnoreCase("g1")) {
            System.out.println("Son iguales");
        }

        if(curso.toLowerCase().equals("g1")) {
            System.out.println("iguales");
        }
        if(curso.equals("g1".toUpperCase())) {
            System.out.println("2 iguales");
        }

        String curso2 = "";
        String curso3 = null;
        if(null == curso3) {
            System.out.println("aaahhh");
        }

        /*if(curso3.isEmpty()){
            System.out.println("esta vacio");
        } no se puede hacer*/

        if(curso2.isBlank()){
            System.out.println("tiene espacios");
        }


        // float y double
        //cast es convertir un tipo de dato a otro tipo dato
        double altura = 1.58;
        float altura2 = 1.58f;
        float altura3 = (float) 1.58; // este es el cast
        System.out.println(altura);
        System.out.println(altura2);
        System.out.println(altura3);

        System.out.println(Float.parseFloat("1.58")); //existen todos los parse para convertir un string a un tipo de numero.

        Float peso = 234.23f;//este es un float de objeto
        System.out.println(peso);

        //Parse: convertir un string a numero
        System.out.println(Integer.parseInt("727"));
        System.out.println(Double.parseDouble("84734678346"));

        //ejercicio
        int num1 = 123;
        String palabraInt = Integer.toString(num1);
        double dobleInt   = (double) num1;
        Double objDoble   = Double.valueOf(num1);
        Integer objInt    = Integer.valueOf(num1);
        Double objDoble1   = Double.parseDouble(palabraInt);
        Integer objInt1    = Integer.parseInt(palabraInt);

        System.out.println(num1);
        System.out.println(palabraInt);
        System.out.println(dobleInt);
        System.out.println(objDoble); //por que lo acepta? se supone que solo usa double y str
        System.out.println(objInt);
        System.out.println(objDoble1);
        System.out.println(objInt1);

        //conversion de datos
        //automatica
        //byte>short>int>long>float>double
        int num4 = 18;
        float num4f = num4;
        System.out.println(num4f + " " + num4);

        //manual
        //double>float>long...
        double peso3  = 45.5;
        //no importa si es objeto o primitiva, si se trata de guardar un double en float (por ejemplo) debo castear --> float ahjh = (float) 2323.23;
        //entre objetos NO se puede hacer float jhasjh = (float) 43.3; si todos son primitivos se puede.
        Double peso2 = 75.9;
        Float peso2F =  Float.valueOf(peso2.toString());
        Float peso3F = peso2.floatValue();
        System.out.println(peso2F);

        //de float a int se pierden los desimales
        //de Float a Integer se pierden los desimales

        //OPERADORES
        //+-/* : operadores
        //== != >= <= > < : comparaciones

        //para el if, el if dice if( 5 == 3+2) dice que es redundante, una buena practica es solo usar variables




    }
}

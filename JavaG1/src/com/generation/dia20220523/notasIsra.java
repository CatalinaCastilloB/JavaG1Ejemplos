package com.generation.dia20220523;

public class notasIsra {

    public static void main(String[] args) {
        //int cantidadNotas = 12;
        //arreglo notas
        Integer[] notas = {20,50,-67,99,10,0,88,77,58,709,33,50};

        int sumaNotas = 0;//20
        int errorNotas = 0;

        //como recorrer el arreglo de notas
        for (int i = 0; i < notas.length; i++) {//i=0
            sumaNotas = sumaNotas + notas[i];
            if (notas[i] < 0 || notas[i] > 100) {
                System.out.println("error, la nota " + (i + 1) + " tiene un valor de " + notas[i] + " que esta fuera de rango");
                errorNotas = errorNotas +1;
            }


        }

        //System.out.println("suma de notas: " + sumaNotas);

        //promedio-> suma todas las notas / cantidad de notas;
        float promedio = sumaNotas / notas.length;
        //float promedio = 49;
        /* TODO validar el orden >= */
        //101

        if(promedio >= 50 && promedio <= 100 && errorNotas == 0) {
            System.out.println("Alumno aprobado con una nota de " + promedio);
        } else if (promedio >= 0 && promedio < 50 && errorNotas == 0) {
            System.out.println("alumno reprobado con una nota de " + promedio);
        }
        else {
            System.out.println("Error en el calculo de promedio, revisar notas");
        }

    }
}

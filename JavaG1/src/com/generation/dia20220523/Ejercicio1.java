package com.generation.dia20220523;

    public class Ejercicio1 {

        public static void main(String[] args) {


            //AREA TRIANGULO = (b * h) / 2
            double alturaTriangulo = 2.2;
            double baseTriangulo = 3.3;

            double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

            System.out.println("*************");
            System.out.println("Tomando los valores de un Triangulo con altura: " + alturaTriangulo + " [m] y con una base: " + baseTriangulo + "[m]");
            System.out.println("Area Triangulo:");
            System.out.println(areaTriangulo + "[m2]");
            System.out.println("*************");


            //PERIMETRO CIRCULO = 2pi * r
            double PI = 3.14;
            double radio = 6;

            double perimetroCirculo = 2 * PI * radio;

            System.out.println("*************");
            System.out.println("Tomando los valores del circulo de radio: " + perimetroCirculo + "[cm]" );
            System.out.println("Perimetro Circulo:");
            System.out.println(perimetroCirculo + "[cm]");
            System.out.println("*************");
        }

    }



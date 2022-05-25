package com.generation.dia20220525;
import java.util.Scanner;
public class bucleDoWhile {
    public static void main(String[] args) {
        // DoWhile
        // a lo menos se ejecutara una vez
        int termino = 9;
        do {

            System.out.println("el valor de termino en dowhile es " + termino);
            termino++;
        } while (termino < 10);

        System.out.println("***************");

        while (termino <= 10) {
            System.out.println("el valor de termino en while es " + termino);
            termino++;
        }
        System.out.println("***********fin*******");






        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
            opcion = sc.nextInt();

        }while(opcion < 0 || opcion > 4);

    }
}

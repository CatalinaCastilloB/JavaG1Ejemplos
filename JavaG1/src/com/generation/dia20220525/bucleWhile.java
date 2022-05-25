package com.generation.dia20220525;
import java.util.Scanner;
public class bucleWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// ingreso por consola;
        //while valida si la condicion sea verdadera
        System.out.println("1 suma \n2 resta \n3 multiplicacion \n4 division");
        int condicion = sc.nextInt();// capturando el ingreso por consola
        while(condicion < 1 || condicion > 4) {
            System.out.println("1 suma \n2 resta \n3 multiplicacion \n4 division");
            condicion = sc.nextInt();
        }


        switch (condicion) {
            case 1:
                System.out.println("funcionaaaa");
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("vuelva pronto");
                break;
        }
    }
}

package com.generation.dia20220525;
import java.util.Scanner;
public class condicionalJava {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);// ingreso por consola;
    System.out.println("1 suma \n2 resta \n3 multiplicacion \n4 division");
    int key = sc.nextInt();

    switch (key) {
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
            System.out.println("1 suma \n 2 resta 'n 3 multiplicacion \n 4 division");
            break;
    }


}
}

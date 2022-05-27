package com.generation.dia20220526;

import java.util.Arrays;

public class ColeccionArray {
    public static void main(String[] args) {
        //Arrays estaticos, no se puede hacer cambio, solo se puede cambiar el valor de un elemento
        String[] colores = {"red","blue","yellow","orange","black"};
        Integer[] numerosPares= {2,4,6,8,10,12};
        int[] primerosNumeros = {1,2,3,4,5,6,7,8,9,9,0};
        System.out.println(colores[2]);
        System.out.println(numerosPares[0]);
        System.out.println(primerosNumeros[2]);



        numerosPares[0] =1000;
        System.out.println(numerosPares[0]);

        for (int i = 0; i<colores.length;i++){
            System.out.println(colores[i]);
        }
        for (int i = 0; i<colores.length;i++){
            System.out.print(colores[i]);
        }

        //foreach
        for(int elemento : numerosPares){
            System.out.println(elemento);
        }

        for (String color: colores
             ) {
            System.out.println(color);
        }
        System.out.println("\n" +colores);
        System.out.println(colores.toString());
        System.out.println(Arrays.toString(colores));

        //numerosPares[6]=10; no se puede asignar o sobreescribir en posiciones del arreglo que no existan

    }
}

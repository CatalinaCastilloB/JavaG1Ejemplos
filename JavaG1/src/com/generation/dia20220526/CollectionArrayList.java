package com.generation.dia20220526;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionArrayList {
    public static void main(String[] args) {
        //arraylist, definienmdo de tipo objeto (dinamico)
        //instancia de clase
        ArrayList<String> colores = new ArrayList<String>(); //inicializando
        ArrayList<Integer> numerosPares =new ArrayList<Integer>();
        colores.add("rojo");//se agrega elemento a la lista
        colores.add(1,"azul");
        colores.add("blanco");

        //si ya existe desplaza los valores, no se pierde nada
        colores.add(1,"verde");

        System.out.println(colores);//este tipo de array permite imprimir el contenido
        System.out.println(colores.get(2));//asi se imprime uno en especifico
        System.out.println(colores.size());//es para dinamicos
        colores.set(1,"negro");//asi se modifica un valor
        System.out.println(colores);
        colores.remove(0);//quita elemento por el indice
        colores.remove("negro");//quita elemento por elemento
        System.out.println(colores);
        colores.clear();//quita todos los elementos
        System.out.println(colores);


        for (int i = 0; i < 10; i++) {
            colores.add("rojo");
        }
        colores.set(0,"negro");
        colores.set(2,"negro");
        System.out.println(colores);
        colores.remove("rojo");
        System.out.println(colores);
        colores.remove("rojo");
        System.out.println(colores);

        for (String color: colores
        ) {
            System.out.println(color);
        }

        Collections.sort(colores);//ordenar el arreglo de forma ascendente, queda permanentemente ordenado de aqui en adelante
        System.out.println(colores);
        numerosPares.add(14);
        numerosPares.add(2);
        numerosPares.add(8);
        numerosPares.add(6);
        numerosPares.add(10);
        numerosPares.add(20);
        System.out.print(numerosPares + " ");
        Collections.sort(numerosPares);
        System.out.println();
        System.out.println(numerosPares);
        Collections.reverse(numerosPares);//no ordena desendentemente, solo da vuelta el arreglo
        System.out.println(numerosPares);
    }
}

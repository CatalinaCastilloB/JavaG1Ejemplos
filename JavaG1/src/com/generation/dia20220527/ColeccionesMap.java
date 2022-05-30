package com.generation.dia20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {
    public static void main(String[] args) {
    //collecciones MAPS
    //Pares: clave <-> valor
    //EStructurA
        /*HashMap<K, V>
        HashMap<K, V> map = new HashMap<K, V>();
        K, KAY, CLAVE ; v value o valor
        */


        //otra forma de escribirlo
        //HashMap<String,String> objHushMap = new HashMap(); //en <> especifica el tipo de objeto, siempre son objetos
        HashMap objHushMap = new HashMap();
        objHushMap.put("Nombre", "Catalina");
        objHushMap.put("ApellidoP", "Castillo");
        objHushMap.put("ApellidoM","Belmar");
        objHushMap.put("edad", "26");

        System.out.println("Elementos del mapa");
        System.out.println(objHushMap);
        //objHushMap.forEach();

        //en hushmap no se trabaja con las posiciones

        System.out.println(objHushMap.get("Nombre"));

        objHushMap.remove("edad");
        System.out.println(objHushMap);

        System.out.println(objHushMap.keySet());
        System.out.println(objHushMap.values());

        //el hushmaps es lo mas parecido a una api

        ArrayList<String> vocales = new ArrayList<String>();
        vocales.add("a");
        vocales.add("e");
        vocales.add("i");
        vocales.add("o");
        vocales.add("u");

        objHushMap.put("vocales",vocales);
        System.out.println(objHushMap);

        System.out.println(objHushMap.get("vocales"));

        for (Object llave: objHushMap.keySet()){ // no es costumbre utilizar object, solo cuando no sepa de que tipo es se usa object
            System.out.println("Clave: " + llave +" el valor es: " +objHushMap.get(llave));
        }



    }
}

package com.generation.dia20220526;

public class CalcuMath {
    public static void main(String[] args) {
        //Math

        //elevar o pontencia
        double numeroElevado = Math.pow((double) 23, (double) 345);
        System.out.println(numeroElevado);

        //Redondear al entero mayor
        double enteroMayor = Math.ceil((double) 3452345);
        System.out.println(enteroMayor);


        //Redondear entero menor
        double enteroMenor = Math.floor((double) 856874);
        System.out.println(enteroMenor);

        //entero redondeado
        double enteroRedondeado = Math.round((double) 567465736);
        System.out.println(enteroRedondeado);

        double azar = Math.random(); //genera numeros >= 0.0 y  <1.0
        System.out.println(azar);

        //crear numero al azar entre 0 y 20
        double azar2 = Math.random()*20;
        System.out.println(azar2);


        //Math.random() * (max - min) + min;
        //numeros aleatorios entre 2 y 8
        double num28 = (Math.random() * (8-2)) + 2;
        System.out.println(num28);


        double num00 = (Math.random() * (8- -3)) -3;
        System.out.println(num00);

    }
}

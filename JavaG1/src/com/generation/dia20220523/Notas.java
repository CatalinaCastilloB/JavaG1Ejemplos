package com.generation.dia20220523;

import java.util.Arrays;

public class Notas {

    public  static void main(String[] args){
        /* double[] notes = new double[5];
        notes[0] = 5;
        notes[1] = 7;
        notes[2] = 9;
        notes[3] = 73;
        notes[4] = 99;*/
        //double[] notes=new double[] {1,2,99,99,99,99};
        //double total = 0;
        Integer[] notes={20,50,67,99,10,0,88,77,58,79,33,50};
        /*for(int i = 0; i< notes.length ; i++ ){
            total = total + notes[i];
        }*/
        // TODO
        double total = Arrays.stream(notes).mapToDouble(note -> note).sum(); //traspasa de int a double

        double promedio = total/(notes.length);

        if(promedio> 49.5){
            System.out.println("aprueba");
        }else{
            System.out.println("no aprueba");
        }


    }
}

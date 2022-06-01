package com.generation.dia20220601;

import com.generation.dia20220601.Modelos.Gato;
import com.generation.dia20220601.Modelos.Mascota;
import com.generation.dia20220601.Modelos.Mishi;
import com.generation.dia20220601.Modelos.Perro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //en main solo instancias y llamadas
        Mascota mascota = new Mascota();

        Perro perro = new Perro();
        Gato gato = new Gato();

        gato.setNombre("juantito");
        System.out.println(gato.toString());

        Mishi mishi = new Mishi(true);
        System.out.println(mishi.toString());


        //polimorfismo
        List<Mascota> listaMasc = new ArrayList<Mascota>();
        Mascota regalon = new Mascota("blanco", "gran pirineo", "grande","frondoso", "falcon", "si",  "macho", 40);
        listaMasc.add(regalon);

        Mascota negra = new Gato();
        negra.setColor("blaco y negro");
        negra.setSexo("femenino");
        listaMasc.add(negra);

        Mascota chocolo = new Perro();
        chocolo.setNombre("chocolo");
        chocolo.setColor("cafe");
        listaMasc.add(chocolo);


        //Mascota cosa = new Gato();
        //si se quiere llamar hacerRuido, llama a la mas cercana
        regalon.hacerRuido();
        chocolo.hacerRuido();
        negra.hacerRuido();
        System.out.println("******");
        //recorrer el arreglo
        for (Mascota mascota2 : listaMasc) {
            mascota2.hacerRuido();
        }

        Perro pichintun = (Perro) regalon;
        Perro peluson = (Perro) chocolo;

        pichintun.hacerRuido();
        //en las lineas 53 y 54 son las que transforman el objeto de regalon y chocolo
        //polimorfismo y transformar es diferente

        listaMasc.add(pichintun); //se puede agregar pichintun que es tipo perro, pero como viene de la clase mascota, sirve




    }
}

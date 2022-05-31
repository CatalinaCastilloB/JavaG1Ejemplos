package com.generation.dia20220530;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> listaGrupo2 = new ArrayList<Alumno>(); //al llevar list<> bla= new arraylist(): amplia las posibilidades de arraylist (se utiliza mucho list)
        //instancia de una clase: se invoca
        Alumno alumno = new Alumno(); //def clase = prop? instancia con constructor vacio
        //al usar asd() , los parentesis, llamo al constructor vacio
        Alumno alumno2 = new Alumno("cata","castillo", 26, "G1");
        alumno.setNombre("juanita");
        System.out.println(alumno.getNombre());
        System.out.println(alumno2.getNombre());


        Alumno gene = new Alumno ("Genesis","Quezada",27,"G1");
        Alumno gabo = new Alumno("Gabriel", "Guzman", 29, "G1");
        Alumno cata = new Alumno("Catalina", "Castillo", 26, "G1");
        Alumno carlos = new Alumno("Carlos", "Iturra", 26, "G1");
        Alumno nico = new Alumno("Nicolas", "Neira", 27, "G1");

        listaGrupo2.add(gene);
        listaGrupo2.add(gabo);
        listaGrupo2.add(cata);
        listaGrupo2.add(carlos);
        listaGrupo2.add(nico);


        System.out.println("*********************************");
        System.out.println("Nombre completo: " + gene.getNombre() + " " +gene.getApellido() + " Edad: " + gene.getEdad() + " curso " + gene.getCurso());
        System.out.println("Nombre completo: " + gabo.getNombre() + " " + gabo.getApellido() + " Edad: " + gabo.getEdad() + " Curso: " + gabo.getCurso());// get para obtener el atributo que tiene asignado mi variable
        System.out.println("nombre completo: " + cata.getNombre()+" "+ cata.getApellido() + " Edad: " + cata.getEdad() + " Curso: " + cata.getCurso());
        System.out.println("Nombre completo: " + carlos.getNombre()+" " + carlos.getApellido() + " - Edad: " + carlos.getEdad() + " - Curso: " + carlos.getCurso() );
        System.out.println("Nombre completo: " + nico.getNombre() +" "+ nico.getApellido() + " Edad: " + nico.getEdad() + " Curso: " + nico.getCurso());
        System.out.println("*********************************");

        System.out.println(cata.toString());

        for (Alumno elemento: listaGrupo2) {
            System.out.println(elemento.toString());

        }

        for (int i = 0; i < listaGrupo2.size(); i++) {
            System.out.println(listaGrupo2.get(i));
            System.out.println(listaGrupo2.get(i).getNombre());
        }

        // interfase: solo definen los metodos, solo la estructura
        //el arraylist: tiene atributos, funciones, metodos y van mucho mas alla de la implementacion o funcion
        //sobreescritura y sobrecarga de metodos, investigar
    }

}

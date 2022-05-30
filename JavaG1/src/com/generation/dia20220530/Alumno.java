package com.generation.dia20220530;

public class Alumno {
    //atributo
    private String nombre; //protected(solo el objeto interactua) or public (to do lo ven);private, por que solo lo usamos dentro dela misma clase
        //si es un arreglo o matriz o map,el nombre debe ser en plural
    private String apellido;
    private int edad; //siempre se recomienda usar objetos, en este caso usamos int por comodidad
    private String curso;

    //constructor

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                '}';
    }

    public Alumno(String nombre, String apellido, int edad, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
    }

    public Alumno() {

    }

    //get and set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    //encapsulacion
}

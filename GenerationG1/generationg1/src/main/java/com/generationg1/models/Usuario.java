package com.generationg1.models;

public class Usuario {
    private String Nombre;
    private String Apellido;
    private Integer edad;


    //constructor
    public Usuario(String nombre, String apellido, Integer edad) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.edad = edad;
    }

    public Usuario() {
    }

    //getter and setter

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}

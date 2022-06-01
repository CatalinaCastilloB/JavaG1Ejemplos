package com.generation.dia20220601.Modelos;

import javax.security.sasl.SaslServer;

public class Mascota {
    //atributos: color, especie, tamaño, pelaje, nombre, vacunas, sexo, peso,
    private String color;
    private String especie;
    private String tamano;
    private String pelaje;
    private String nombre;
    private String vacunas;
    private String sexo;
    private Integer peso;

    //constructores

    public Mascota(String color, String especie, String tamano, String pelaje, String nombre, String vacunas, String sexo, Integer peso) {
        super();
        this.color = color;
        this.especie = especie;
        this.tamano = tamano;
        this.pelaje = pelaje;
        this.nombre = nombre;
        this.vacunas = vacunas;
        this.sexo = sexo;
        this.peso = peso;
    }

    public Mascota() {
        super();
    }


    //setter getter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void hacerRuido(){
        System.out.println("muuu");
    }

    @Override
    public String toString() {
        return    "color=" + color + '\n' +
                "especie=" + especie + '\n' +
                "tamano=" + tamano + '\n' +
                "pelaje=" + pelaje + '\n' +
                "nombre=" + nombre + '\n' +
                "vacunas=" + vacunas + '\n' +
                "sexo=" + sexo + '\n' +
                "peso=" + peso ;
    }
}

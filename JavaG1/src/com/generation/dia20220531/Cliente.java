package com.generation.dia20220531;
import java.util.List;
public class Cliente {
    //TRIBUTOS
    /* String rut, integer id, list<integer> numeros de venta, String nombre, String correo*/
    private String rut;
    private Integer id;
    //private list<Integer> numVentas;
    private String nombre;
    private String correo;

    private List<Integer> numVentas;

    //constructor
    public Cliente(){

    }


    public Cliente(String rut, Integer id, String nombre, String correo, List<Integer> numVentas) {
        this.rut = rut;
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.numVentas = numVentas;
    }


    //get and set


    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPrueba(){
        return "esta es una prueva";
    }

    //debe crearse el atributo pueba para hacer el this.pueba
    /*public void setPrueba(){
        this.pueba = 1;
    }*/

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Integer> getNumVentas(){
        return numVentas;
    }

    public void setNumVentas(){
        this.numVentas = numVentas;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}

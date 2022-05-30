package com.generation.dia20220527;

public class Auto {
    //una clase es un modelo o prototipo

    //un objeto es la represetacion de algo tanjible. Algo concreto lo transformammos en abstracto

    //atributo de colaboracion
    private String color;


    //constructores

    public Auto(String color) {
        super(); //invocar el constructor clase superior, object
        this.color = color;
    }


    //accesadores y mutadores (get y set)

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //metodos o funciones
    //funciones creadas dentro de un objeto no llevan static

    public void EsVerde(String verde){
        this.color = verde;
    }
}

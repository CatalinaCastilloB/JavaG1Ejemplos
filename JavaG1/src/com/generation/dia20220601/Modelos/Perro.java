package com.generation.dia20220601.Modelos;

public class Perro extends Mascota{
    //extends hereda

    private boolean garras;
    private String sonidoVocal;



    @Override
    public void hacerRuido(){
        System.out.println("woof, woof");
    }
}

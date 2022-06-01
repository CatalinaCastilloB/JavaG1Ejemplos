package com.generation.dia20220601.Modelos;

public class Gato extends Mascota{
    //extends se hace la herencia

    private boolean garrasRetractil;
    private String sonidoVocal;

    public Gato(boolean garrasRetractil, String sonidoVocal) {
        super();
        this.garrasRetractil = garrasRetractil;
        this.sonidoVocal = sonidoVocal;
    }

    public Gato() {
        super();
    }

    @Override //sobreescribir un metodo
    public String toString() {
        return  "garrasRetractil=" + garrasRetractil  +"\n"+
                "sonidoVocal=" + sonidoVocal + '\n' + super.toString() ;
    }

    @Override
    public void hacerRuido(){
        System.out.println("miau, miau");
    }
}

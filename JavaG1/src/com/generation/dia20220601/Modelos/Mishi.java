package com.generation.dia20220601.Modelos;

public class Mishi extends Gato{
    private boolean internetFamus;

    public Mishi(boolean internetFamus) {
        this.internetFamus = internetFamus;
    }

    public Mishi() {
    }

    public boolean isInternetFamus() {
        return internetFamus;
    }

    public void setInternetFamus(boolean internetFamus) {
        this.internetFamus = internetFamus;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n"+
                "internetFamus =" + internetFamus ;
    }
}

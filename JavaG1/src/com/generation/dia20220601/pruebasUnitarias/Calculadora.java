package com.generation.dia20220601.pruebasUnitarias;

public class Calculadora {
    //metodos basicos de una calculadora, +-/%
    public int suma(int num1, int num2){
        return num1 + num2;

    }
    public int resta(int num1, int num2){
        return num1 - num2;

    }public int multiplicacion(int num1, int num2){
        return num1 * num2;

    }public String division(int num1, int num2){
        if (num2 != 0){
            String div = Integer.toString(num1 /num2);
            return div;}
        return "no se puede dividir por 0";

    }
}

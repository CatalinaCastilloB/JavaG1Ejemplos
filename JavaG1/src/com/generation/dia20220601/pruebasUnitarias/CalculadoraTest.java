package com.generation.dia20220601.pruebasUnitarias;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @org.junit.Test
    public void suma() {
        Calculadora calc = new Calculadora();
        Integer resultado = calc.suma(42, 12);
        // valor esperado, resultado
        Integer esper = (Integer) 54;
        assertEquals(esper,resultado);
        assertNotNull(resultado);
        Integer esperado = 54;
        assertSame(esperado, resultado);
    }

    @org.junit.Test
    public void resta() {
        Calculadora calc = new Calculadora();
        int resultado = calc.resta(10,5);
        assertEquals(5,resultado);
    }

    @org.junit.Test
    public void multiplicacion() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicacion(2,5);
        assertEquals(10, resultado);
        //para buscar escribir as + Ctrl + spacebar
    }

    @org.junit.Test
    public void division() {
        Calculadora calc = new Calculadora();
        String resultado = calc.division(3,4);
        //assertEquals((double)(3/4), resultado);
        assertNotNull(resultado);
    }
}
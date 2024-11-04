package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSumar(){
        Calculadora sut = new Calculadora();
        assertTrue(sut.sumar(4, 3) == 7);
    }
    @Test
    public void testSumartwo(){
        Calculadora sut = new Calculadora();
        int resultado = sut.sumar(4, 7);
        assertTrue(resultado == 11);
    }
    @Test
    public void testRestar(){
        Calculadora sut = new Calculadora();
        assertTrue(sut.restar(4, 3) == 1);
    }
    @Test
    public void testDividir(){
        Calculadora sut = new Calculadora();
        assertTrue(sut.dividir(4, 2) == 2);
    }
    @Test
    public void testMultiplicar(){
        Calculadora sut = new Calculadora();
        assertTrue(sut.multiplicar(4, 3) == 12);
    }

    
}

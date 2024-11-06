package es.santander.ascentic.proyecto03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestCalculadora{
 calculadora calculadora = new calculadora();
    @Test
    public void testsumar(){
        long resultado = calculadora.sumar(5,1);
        assertEquals(6,resultado,"5+1 deberia ser 6");

    }
    @Test
    public void testrestar() {
        long resultado = calculadora.restar(3,2);
        assertEquals(1,resultado,"3-2 deberia ser 1");
    }
    @Test
    public void testmultiplicar (){
        long resultado = calculadora.multiplicar(5, 2);
        assertEquals(10,resultado,"5*2 deberia de ser 10");
    }
    @Test
    public void testdividir(){
        long resultado =calculadora.dividir(10, 2);
        assertEquals(5,resultado,"10/2 deberia de ser 5 ");

    }
    


}

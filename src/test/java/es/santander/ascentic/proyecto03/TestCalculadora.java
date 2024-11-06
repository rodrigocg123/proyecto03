package es.santander.ascentic.proyecto03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;



public class TestCalculadora{
 Calculadora calculadora = new Calculadora();
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
    
    @Test
    public void testdividirDivisionPorCero(){
        try {
            long resultado =calculadora.dividir(10, 0);
            fail("Deberia haber lanzando un error de division por 0");
        } catch (Exception e) {

            System.out.println(e);
        }

    }
   
    @Test
    public void testpresentarTablaMultiplicar(){
        calculadora.presentarTablaMultiplicar(7);
    }
    @Test
    public void testCalcularTablaMultiplicar(){
        calculadora.calcularTablaMultiplicar(9);

    }
}

    

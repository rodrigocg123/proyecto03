package es.santander.ascentic.proyecto03;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        long resultado= calculadora.sumar(4,5);
        System.out.println(resultado);
    }
}

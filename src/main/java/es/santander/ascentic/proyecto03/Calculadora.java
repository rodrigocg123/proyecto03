package es.santander.ascentic.proyecto03;

public class Calculadora {
    public long sumar (long sumando1, long sumando2) {
        return sumando1 + sumando2;
    }

    public long restar(long substraendo, long minuendo){
        return substraendo - minuendo;
    }

    public long multiplicar(long factor1, long factor2) {
        return factor1 * factor2;
    }

    public long dividir(long dividendo, long divisor){
        return dividendo/ divisor;
    }
    public void presentarTablaMultiplicar(int numero){
    
        for (int i = 0 ;i <= 10;i = i + 1) {
            System.out.println(i * numero);

        }
    }
    public int[] calcularTablaMultiplicar (int numero) {
        int[] tablaDeMultiplicar = new int[11];
        for (int i = 0; i<=10; i++ ){
        tablaDeMultiplicar[i] = i * numero;
        }
        return tablaDeMultiplicar;
    

   
    }
}

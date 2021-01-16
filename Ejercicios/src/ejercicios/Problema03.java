/*
    Dado los siguientes arreglos

    double[] datos = {100, 90, 80, 70, 60};
    double[] datos2 = {200, 190, 180, 170, 160};
    Encuentre la suma de las posiciones 0 de datos y datos2
    (use un método recursivo) y el valor de la suma, asignarle
    a un arreglo llamado suma

    double[] suma = new int[5];
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] datos = {100, 90, 80, 70, 60};
        double[] datos2 = {200, 190, 180, 170, 160};
        double[] suma = new double[5];
        for (int cont = 0; cont < datos.length; cont++) {
            suma[cont] = obtenerSuma(datos[cont], datos2[cont]);
            System.out.println(suma[cont]);
        }
    }

    public static double obtenerSuma(double valor1, double valor2) {
        if (valor2 == 0) {
            return  valor1;
        } else {
            if (valor1 == 0) {
                return valor2;
            } else {
                return 1 + obtenerSuma(valor1, valor2 - 1);
            }
        }
    }
}

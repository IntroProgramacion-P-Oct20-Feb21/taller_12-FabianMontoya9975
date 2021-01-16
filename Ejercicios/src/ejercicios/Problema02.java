/*
    Dado el siguiente arreglo

    double[][] datos = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
    A través de un método recursivo encuentre y presente la suma de cada fila.

 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] datos = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[] datosFila = new double[3];
        double numero;
        for (int fila = 0; fila < datos.length; fila++) {
            numero = 0;
            for (int columna = 0; columna < datos[fila].length; columna++) {
                datosFila[columna] = datos[fila][columna];
                numero = sumaFila(datosFila, datosFila.length);
            }
            System.out.println(numero);
        }
    }

    public static double sumaFila(double[] valores, int tamano) {
        if (tamano == 1) {
            return valores[0];
        } else {
            return valores[tamano - 1] + sumaFila(valores, tamano - 1);
        }
    }

}

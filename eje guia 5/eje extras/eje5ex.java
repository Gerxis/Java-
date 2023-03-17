/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */
package guia5;

/**
 *
 * @author ALEXIS
 */
public class eje5ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matris [][] = new int [4][5],sum = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matris[i][j] = (int) (Math.random() * 10 + 1);
               sum += matris[i][j];
            }
        }
        String ma = " " ;
        for (int[] fila : matris ) {
            for(int elemento : fila){
             
                ma +=  "(" +elemento+")" + " "; 
            }
            System.out.println(ma);
            ma = " ";
        }
        System.out.println("la suma de los elementos de la matris es : " + sum );
    }
    
}

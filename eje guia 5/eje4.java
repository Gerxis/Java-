/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de 
la matriz. La matriz traspuesta 
de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5;

/**
 *
 * @author ALEXIS
 */
public class eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int matris [][] = new int [4][4];
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                matris[i][j]= (int)(Math.random()*20+1);
                        
            }
           }
        
        String aux;
        for (int[] fila: matris) {
            aux = " ";
            for (int elemento: fila) {
                aux += " " + "[" +elemento+"]" ;
            }
            System.out.println(aux);
        }
        System.out.println("***********************");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(" " + "[" + matris[j][i]+ "]");
            }
            System.out.println(" ");
        }
    }
    
}

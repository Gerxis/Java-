/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
Después haremos otra función o procedimiento que imprima el vector.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class eje3ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vector");
        
        int tam = leer.nextInt();
        
        int vec [] = new int [tam];
        
        vec = rellenar(vec, tam);
        mostrar(vec);
    }
    //rellenar
        public static int[] rellenar(int[] vec,int tam) {
   
             
             for (int i = 0; i < tam; i++) {
                vec[i] = (int)(Math.random()* 50 + 1);
            }
            
            return vec;}
     
      //mostrar
        public static void mostrar (int[] vec){
     
        for (int i: vec ) {
            System.out.println(i);
        }
    
    }


















}

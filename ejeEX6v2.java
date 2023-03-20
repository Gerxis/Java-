/*
Construya un programa que lea 5 palabras de mÃ­nimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando,
construya una â€œsopa de letras para niÃ±osâ€� de tamaÃ±o de 20 x 20 caracteres. Las palabras se ubicarÃ¡n todas en orden horizontal
en una fila que serÃ¡ seleccionada de manera aleatoria. Una vez concluida la ubicaciÃ³n de las palabras, rellene los espacios 
no utilizados con un nÃºmero aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class ejeEX6v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
     String[][] matris = new String [20][20];
     String palabra ,letra;
    int cor ,cor2 ,c = 0,cont = 0; 
    int cant ;
    int hori;
         //solicitar palabras y colocarlas
         do{
         System.out.println("Cuantas palabras decea ingresar a la sopa Max 8 y Min 1");
         cant = leer.nextInt();} while (cant < 1 || cant >8);
         do{
         System.out.println("decea colocar las palabras en horizonta(1) o vertical(2)");
         hori = leer.nextInt();} while (hori != 1 && hori != 2);
         System.out.println("ingrese palabras para la sopa"); 
        
         for (int i = 0; i < cant; i++) {
            do {
               palabra = leer.next(); if (palabra.length() <  3 || palabra.length() > 5) {System.out.println("Palabras entre 3 y 5 caracteres");} 
            }while (palabra.length() <  3 || palabra.length() > 5);
            
            cor = (int)(Math.random() * 20 + 0);
            cor2 = (int)(Math.random() * 15 + 0);
          
           //hotizontal
         switch (hori){
             case 1:  for (int j = cor2; j < 20; j++) {
                letra = palabra.substring(c,c+1);
               
                matris[cor][j] = letra;
                c = c + 1;   
                if (c == palabra.length()) {c = 0; break;}}
             break;
          //vertical   
         
             case 2 : for (int j = cor2; j < 20; j++) {
                letra = palabra.substring(c,c+1);
               
                matris[j][cor] = letra;
                c = c + 1;   
                if (c == palabra.length()) {c = 0; break;} 
                  }
              break;
           }}
            
        
    
       //rellenar lo faltante
       int num ;
       char rell ;
           for (int i = 0; i < 20; i++) {
               for (int j = 0; j < 20; j++) {
                   num = (int)(Math.random() * (('z' - 'a')+1) + 'a');
                   rell = (char) num;
                 if  (matris[i][j] == null ){matris[i][j] = String.valueOf(rell);}
               }}
        
           
           //mostrar matris
           for (int i = 0; i < 20; i++) {
               for (int j = 0; j < 20; j++) {
                   System.out.print( "[" + matris[i][j] +"] ");
             }
               System.out.println(" ");
               }
           
           
    }
    
}
/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.

 */
package guia5;

/**
 *
 * @author ALEXIS
 */
public class eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        int [] num = new int [100];
        int cont = 1;
        
        for (int i = 0; i < num.length; i++) {
            
            num [i] = cont;
            System.out.println(num[i]);    
            cont += + 1;
        
        }
      
    
        
        
    }
    
}

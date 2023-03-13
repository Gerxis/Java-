/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

/**
 *
 * @author ALEXIS
 */
public class eje12ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String cad ,cad1 ,cad2;
        
            for (int i = 0; i < 10; i++) {
           
            if (i == 3) {cad = "E";} else { 
                cad = String.valueOf(i);}
            
           
            for (int j = 0; j < 10; j++) {
               
            if (j==3) {cad1 = "E";} else { 
                cad1 = String.valueOf(j);}
           
            
            for (int k = 0; k < 10; k++) {
              
             if (k == 3) {cad2 = "E";} else {
                
                 cad2 = String.valueOf(k);}
                 
             System.out.println(cad + "-" + cad1 + "-" + cad2 );
                    
      
                }

            }
            
        }
        
        
    }
    
}

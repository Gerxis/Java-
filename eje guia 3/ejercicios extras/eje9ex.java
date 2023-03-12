/*
Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que

 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje9ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
       
        int n , n2 ;
        int cont = 0, resta ;
        
        
        do {System.out.println("Ingrese dos numeros para dividir");
            n = num.nextInt();
            n2 = num.nextInt(); 
         if (n < 2 || n2 < 2 )
         {System.out.println("Ingrese numeros matores a 1");}
       } while (n < 2 && n2 < 2 );
    
         do { resta = n - n2 ; 
              cont = cont + 1 ;
              n = resta ;
             } while (resta >= n2);
          
         
         System.out.println("cociente : " + cont);
         System.out.println("residuo : " + resta );
    
    
    
    
    }
    
}

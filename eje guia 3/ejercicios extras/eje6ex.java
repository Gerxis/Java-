/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
y el promedio de estaturas en general.
 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje6ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        
        boolean vali = false ;
        double suma = 0 , suma2 = 0 ;
        int cont = 0 , cont2 = 0 ,cont3 = 0; 
        
        
        System.out.println("Ingre las estatutar ");
        System.out.println("cuando termine escriba 0");
        
        while (!vali) { 
            double altura = tec.nextDouble();
            cont3 = cont3 + 1 ;
            if (altura == 0) {vali = true;}
           
           if ( altura <= 1.60 && altura > 0 ) {
               suma2 = suma2 + altura;
               cont2 = cont2 + 1; }
           if (altura > 0)
            {suma = suma + altura ; 
             cont = cont  + 1 ;}
           
        }
        
        System.out.println("El promedio de Estatura general es : " + suma / cont );
        System.out.println("El promedio de los que miden por debajo de 1.60 es : " + suma2 / cont2 );
        
    }
    
}

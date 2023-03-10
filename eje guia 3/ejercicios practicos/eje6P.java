/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla 
el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado
por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se 
debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el
usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package guia3;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje6P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner num =  new Scanner (System.in);
    
    int entero , entero2 ;
    
    do { System.out.println("Ingrese dos numero enteros para operar");
      entero = num.nextInt();
      entero2 = num.nextInt();
    } while (entero < 0 && entero2 < 0 );
    
    boolean vali = false ;
    int op ;
    
    while (!vali) {
        System.out.println("Ingrese una opcion");
        System.out.println(" ");
        System.out.println(".---------------.");
        System.out.println("|   Menu        |");
        System.out.println("|1. Sumar       |");
        System.out.println("|2. Resta       |");
        System.out.println("|3. multiplicar |");
        System.out.println("|4. Dividir     |");
        System.out.println("|5. Salir       |");
        System.out.println(".---------------.");
    
        op = num.nextInt();
        
        switch (op) {
            case 1: int suma = entero + entero2 ;
            
                System.out.println("La suma es :" + suma);
                
                break;
            case 2: int resta = entero - entero2 ;
                System.out.println("La resta es :" + resta);
                
                break;
            case 3: int mul = entero * entero2 ;
                System.out.println("El resultado de la multiplicacion es :" + mul);
                
                break;
            case 4: double div = entero / entero2 ;
                System.out.println("El resultado de la divicion es :" + div);
                
                break;
            case 5: vali = true;
                
                break;
            default : System.out.println("Las opciones son de entre 1 y 5 ");
         
        
        
        }
    } 
    
    
    
    }
    
}

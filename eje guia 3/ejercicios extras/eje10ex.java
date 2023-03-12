/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario 
ingresar su respuesta nuevamente.
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */
package guia3;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class eje10ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random num = new Random () ;
       Scanner res = new Scanner (System.in);
       int n = num.nextInt(11);
       int n2 = num.nextInt(11);
       int r , op = 2 ,mul = n * n2;
       
       
       do {
       System.out.println("Adivine el resultado de la multiplicacion tiene "
                + op + " intentos");
        System.out.println(n + " * " + n2);
        r = res.nextInt();
        op = op - 1;
        if (r == mul) {System.out.println("Felicidades es Correcto"); break;}
        else {System.out.println("incorrecto");}
        
       }while (op > 0);
       
       if (op == 0 && r != mul) {System.out.println("Se acabaron los intentos");}  
    }
    
}

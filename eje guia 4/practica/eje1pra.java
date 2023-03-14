/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
La aplicación debe tener una
función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class eje1pra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer= new Scanner (System.in);
    
  int num , num2 ;
  int op;
  
  
    do {
        System.out.println("ingrese dos numeros");
        num = leer.nextInt();
        num2=leer.nextInt();
        
        if (num < 1 || num2 < 1) {System.out.println("ingrese numeros mayores a 0");}
        
    } while (num < 1 || num2 < 1) ;
        
        boolean vali = false;
    while (!vali){
        System.out.println("Ingrese que operacion decea realizar");
        System.out.println("|---------------|");
        System.out.println("| 1: Sumar      |");
        System.out.println("| 2: Restar     |");
        System.out.println("| 3: Multiplicar|");
        System.out.println("| 4: Dividir    |");
        System.out.println("| 5: ingresar N |");
        System.out.println("| 6: Salir      |");
        System.out.println("|---------------|");
    
     
        op = leer.nextInt();
    
      
    switch (op) {
          case 1: int sum = sumar(num , num2);
              System.out.println("El resultado de la suma es: " + sum);
          break;
          case 2: int res = restar(num , num2);
           System.out.println("El resultado de la resta es: " + res);
          break;
          case 3: int mul = multiplicar(num , num2);
           System.out.println("El resultado de la multiplicacion es: " + mul);
          break;
          case 4: double div = dividir(num , num2);
           System.out.println("El resultado de la divicion es: " + div);
          break;
          case 5: num = leer.nextInt(); num2 = leer.nextInt();
          break;
          case 6: vali = true; break;
          default : System.out.println("las opciones son entre 1 y 6");
      }
    }
    
    }
    

public static int sumar(int num , int num2 ){
       int s = num + num2;
        return s;
}

public static int restar(int num , int num2 ){
       int s = num - num2;
        return s;}

public static int multiplicar(int num , int num2 ){
       int s = num * num2;
        return s;}

public static double dividir(int num , int num2 ){
       int s = num / num2;
        return s;}


 






}

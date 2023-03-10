/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A 
continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor 
de A, A tome el valor de D y D tome el valor de B. Mostrar 
los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia3;

/**
 *
 * @author ALEXIS
 */
public class eje2ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      int a = 10 ,b = 20 ,c = 30 , d = 40 , s ;
      
        System.out.println("a" +a);  System.out.println("b" +b);  System.out.println("c" + c);  System.out.println("d" +d);
      
      
      s = b;
      b = c;
      c = a;
      a = d;
      d = s;
           System.out.println(" ");
           System.out.println("a" + a);  System.out.println("b" + b);  System.out.println("c" + c);  System.out.println("d" + d);
    }
    
}

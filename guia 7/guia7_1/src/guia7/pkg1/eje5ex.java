/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" 
que permita retirar una cantidad de dinero del 
saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package guia7.pkg1;

import guia7.pkg1.ejercicios.Cuenta;
import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class eje5ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean vali = false;
        Cuenta c1 = new Cuenta();
        
        while (!vali){
        System.out.println("        menu       ");
        System.out.println("1 . Crear cuenta   ");
        System.out.println("2 . Ingresar dinero");
        System.out.println("3 . Retirar dinero ");
        System.out.println("4 . Salir          ");
        
        int op = leer.nextInt();
        
        switch (op) {
            case 1 : c1.crearUser();
            break;
            case 2: c1.ingresarDinero();
            break;
            case 3 : c1.retirarDinero();
            break;
            case 4 : vali = true ;
            break;
            default : System.out.println("opcion incorrecta op 1 - 4");
        
        
        }
        }
    }

}

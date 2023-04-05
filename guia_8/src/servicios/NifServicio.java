/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Nif;
import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class NifServicio {

    Scanner leer = new Scanner(System.in);

    public NifServicio() {
    }
    
    

    public void crearNif(Nif d) {
        int dn;
        do {
            System.out.println("ingrese El DNi");
            dn = leer.nextInt();
        } while (dn < 4);
        d.setDni(dn);
        
        String[] letra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        
        int let = dn % 23 ;
        
        d.setLetra(letra[let]);
        

    }
    
    public void mostrarNif (Nif d) {
        System.out.println("DNI = " + String.format("%08d", d.getDni())+ "-" + d.getLetra());
    
    }
    
}

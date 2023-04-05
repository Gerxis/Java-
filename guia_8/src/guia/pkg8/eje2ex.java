/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg8;

import entidades.Nif;
import servicios.NifServicio;

/**
 *
 * @author ALEXIS
 */
public class eje2ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nif d = new Nif ();
        
        NifServicio ns = new NifServicio ();
        
        
        
        ns.crearNif(d);
        ns.mostrarNif(d);
        
        
    }
    
}

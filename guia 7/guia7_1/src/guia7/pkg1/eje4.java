/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.pkg1;

import guia7.pkg1.ejercicios.Rectangulo;

/**
 *
 * @author ALEXIS
 */
public class eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Crear rectangulo");
        
        Rectangulo r1 = new Rectangulo ();
        
        r1.CrearRectangulo();
        
        System.out.println("La  superficie es = " + r1.CalcularSuperficie());
        System.out.println("El perimetro es = " + r1.CalcularPerimetro());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author ALEXIS
 */
public class eje4ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vec [] = new int [4];
        int cont = 0 , cont2 = 0 ,suma = 0;
        double div = 0;
        
        //numeros de alumnos
        for (int i = 0; i < 10; i++) {   
        vec = rellenar(vec);
        //sumar
        for (int j = 0; j < 4; j++) {
            suma += vec[j]; }
            
            div = suma / 10;
            System.out.println("la nota del alumno " + (i+1) + " es " + div ); 
            if (div >= 7) {cont += +1;} else{cont2 += +1;}
            suma = 0;
        }
    
        System.out.println("Hay un total de " + cont + " alumnos aprobados");
        System.out.println("hay un total de " + cont2 + " alumnos desaprobados");
    }
   
    
   //rellenar vector con notas
    public static int[] rellenar(int [] vec) {
        
        for (int i = 0; i < 4; i++) {
            vec[i] = (int)(Math.random() * 10 + 1);
            switch (i){
                case 1: vec[i] = (int) (vec[i] * 1.5);
                break;
                case 2: vec[i] = (int) (vec[i] * 2.5);
                break;
                case 3: vec[i] = vec[i] * 5;
                break;
            }
        }
        
        return vec;
    
    
    
    }

}
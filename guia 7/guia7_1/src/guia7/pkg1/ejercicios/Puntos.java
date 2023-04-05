/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.pkg1.ejercicios;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class Puntos {
Scanner leer = new Scanner (System.in);
    
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    
    public void crearPuntos (){
        System.out.println("ingrese las cordenadas del primer punto");
        System.out.println("x1"); 
        x1 = leer.nextInt();
        System.out.println("y1");
        y1 = leer.nextInt();
        System.out.println("Ingrese las cordenadas del segundo punto");
        System.out.println("x2");
        x2 = leer.nextInt();
        System.out.println("y2");
        y2 = leer.nextInt();
    }
    
    public double calcularDistancia(){
    double res = x2 - x1;
    double res2 = y2 - y1;
    
    res = Math.pow(res, 2) ;
    res2 = Math.pow(res2, 2);
    
    double sum = res + res2;
    double dis = Math.sqrt(sum);
        
    return dis ;
    }
}

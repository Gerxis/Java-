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
public class Operaciones {

    private int num1;
    private int num2;

    Scanner leer = new Scanner(System.in);

    public Operaciones() {
    }

    public Operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOpera() {
        do{
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt(); 
        if (num1 < 0 && num2 > 0) {System.out.println("Ingrese numero positivos enteros");}
        }while (num1 < 0 && num2 > 0);
    }

    public int sumar() {
        return num1 + num2;
    }

    public int restar() {
        return num1 - num2;
    }

    public int multiplicar() {
        return num1 * num2;
    }

    public double dividir() {
        
        if (num1 == 0 || num2 == 0){return 0.0;}
        else{return num1 / num2;}
    }
    
    
}

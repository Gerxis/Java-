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
public class Rectangulo {

    private double altura;
    private double base;

    Scanner leer = new Scanner(System.in);

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void CrearRectangulo() {
        System.out.println("Ingrese la altura");
        altura = leer.nextDouble();
        System.out.println("Ingrese la base");
        base = leer.nextDouble();
    }
    
    public double CalcularSuperficie(){
     return base * altura;
    }
    
    public double CalcularPerimetro(){
    return (base + altura) * 2;
    }
}

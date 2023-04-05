/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.pkg1.ejercicios;

/**
 *
 * @author ALEXIS
 */
public class Circunferencia {
    
    private double radio;

    
    
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {

        this.radio = radio;
    }
    
    public void crearCircunfer(double radio){

        this.radio = radio;
    
    
    }
    
    public double area(double radio){
        
    return 3.14 * radio * radio;
    }
    
    public double perimetro(double radio){
    
       
        return 2 * 3.14 * radio ;
    }
    
    
}

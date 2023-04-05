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
public class Empleado {
    private String nombre = "";
    private  int edad = 0;
    private  double salario = 0.0 ;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double aumentoSalario() {
    if (edad >= 30){return (salario * 0.10) + salario;}
    else {return (salario * 0.05) + salario ;}
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author ALEXIS
 */
public class Nif {
    
    private int Dni = 0;
    private String letra = " "; 

    public Nif(int Dni, String letra) {
        this.Dni = Dni;
        this.letra = letra;
    }

    public Nif() {
    }

    public long getDni() {
        return Dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
    
}

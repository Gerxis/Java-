/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.pkg1.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class Receta {

    Scanner leer = new Scanner(System.in);
    private String nombre;
    private String ingrediente[];
    private double tdp;

    public Receta() {
    }

    public Receta(String nombre, String[] ingrediente, int tdp) {
        this.nombre = nombre;
        this.ingrediente = ingrediente;
        this.tdp = tdp;
    }

    public void crearReceta() {
        System.out.println("Ingrese el nombre");
        nombre = leer.nextLine();

        System.out.println("Cuantos ingredientes posee la receta");
        int ing;
        do {
            ing = leer.nextInt();
        } while (ing < 0);
        ingrediente = new String[ing + 1];
        System.out.println("ingredientes");
        for (int i = 0; i < ingrediente.length; i++) {
            ingrediente[i] = leer.nextLine();
        }

        do {
            System.out.println("cuanto demora la receta en prepararse en minutos ");
            tdp = leer.nextDouble();
        } while (tdp < 1);

    }

    public String getNombre() {
        return nombre;
    }

    public String[] getIngrediente() {
        return ingrediente;
    }

    public double getTdp() {
        return tdp;
    }

    @Override
    public String toString() {
        return "Receta{" + "nombre=" + nombre + ", ingrediente=" + Arrays.toString(ingrediente) + ", tdp=" + tdp + '}';
    }

}

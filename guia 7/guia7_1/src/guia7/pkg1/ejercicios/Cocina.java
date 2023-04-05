/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.pkg1.ejercicios;

//import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class Cocina {

    Scanner leer = new Scanner(System.in);
    private String ingre[];
    private Receta rec[];

    public Cocina() {

    }
   
    public Cocina(String[] ingre) {
        this.rec = new Receta[5];
        this.ingre = ingre;
    }
    //añadir receta

    public String[] getIngre() {
        return ingre;
    }
    
    public void AddReceta() {
        int in;
        do {
            System.out.println("Cuantas recetas decea añadir max 5");
            in = leer.nextInt();
        } while (in > 5 && in < 1);
        rec = new Receta[in];
        for (int i = 0; i < in; i++) {
            rec[i] = new Receta();
            rec[i].crearReceta();
        }
    }
//añadir ingredientes de la cocina

    public void addIngreC() {
        int num;
        do {
            System.out.println("¿De cuantos ingredientes dispone?");
            num = leer.nextInt();
        } while (num < 0);
        ingre = new String[num + 1];
        System.out.println("ingredietes:");
        for (int i = 0; i < ingre.length; i++) {
            ingre[i] = leer.nextLine();
        }

    }
//buscar receta por nombre

    public void busRecNom() {
        String nom;
        boolean vali = false;
        do {
            System.out.println("ingrese el nombre de la receta");
            nom = leer.nextLine();
        } while (nom.length() < 1);

        for (int i = 0; i < rec.length; i++) {
            if (nom.equals(rec[i].getNombre())) {
                System.out.println(rec[i]);
                vali = true;
            }
        }
        if (vali == false) {
            System.out.println("no se encontro la receta");
        }
    }
//buscar receta por ingrediente

    public void busRecAut() {
        int cont = 0;
        System.out.println("las recetas que puede prepar con los ingredientes es :");
        for (int i = 0; i < rec.length; i++) {
            String[] bus;
            bus = rec[i].getIngrediente();
            for (int k = 0; k < bus.length; k++) {
                
                for (int j = 0; j < ingre.length; j++) {

                    if (bus[k].equalsIgnoreCase(ingre[j])) {
                        cont += 1;
                    }

                }

            }
            if (cont == bus.length) {
                System.out.println(rec[i].toString());
            }
            cont = 0;
        }

    }

}

//  int cont = 0;
//        System.out.println("las recetas que puede prepar con los ingredientes es :");
//        for (int i = 0; i < rec.length; i++) {
//            String[] bus;
//            bus = rec[i].getIngrediente();
//            for (int k = 0; k < bus.length; k++) {
//                
//            for (int j = 0; j < ingre.length; j++) {
//
//                if (bus[k].equals(ingre[j]) ) {
//                  cont += 1;}
//                 
//                }
//
//            }
//            if (cont == bus.length) {System.out.println(rec[i].toString());}
//        }
//        


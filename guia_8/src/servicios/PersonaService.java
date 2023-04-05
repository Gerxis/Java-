/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public PersonaService() {
    }

    public Persona crearPersona() {
        String nom;
        System.out.println("Ingrese el nombre (min 3 caracteres)");
        do {

            nom = leer.nextLine();
        } while (nom.length() < 3);

        String sex;
        do {
            System.out.println("Ingrese el sexo H = hombre, M =mujer O = Otros");
            sex = leer.nextLine();
            sex = sex.toLowerCase();
        } while (!sex.equals("h") && !sex.equals("m") && !sex.equals("o"));

        int ed;
        do {
            System.out.println("ingrese la edad");
            ed = leer.nextInt();
        } while (ed < 1 || ed > 150);

        double al, peso;

        do {
            System.out.println("Ingrese la altura");
            al = leer.nextDouble();
        } while (al < 1 || al > 10);

        do {
            System.out.println("Ingrese el peso");
            peso = leer.nextDouble();
        } while (peso < 1 || peso > 1000);

        return new Persona(nom, sex, ed, peso, al);
    }

    public boolean MayorDeEdad(int ed) {

        return ed > 17;
    }

    public int CalcularImc(Persona c) {
        double cal = c.getPeso() / (c.getAltura() * c.getAltura());
        int vali = 0; 
        if (cal < 20) {
            vali = -1;
        }
        if (cal > 25) {
            vali = 1;
        }
        if (cal >= 20 && cal <= 25) {
            vali = 0;
        } 
        
        return vali;
        }

    }



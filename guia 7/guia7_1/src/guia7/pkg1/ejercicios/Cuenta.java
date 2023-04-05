/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.pkg1.ejercicios;

import java.util.Scanner;

public class Cuenta {

    private final double saldo[] = new double[5];
    private final String titular[] = new String[5];
    private final int contra[] = new int[5];
    private int c = 0;

    public Cuenta() {
    }

    public void crearUser() {
        Scanner leer = new Scanner(System.in);
        if (c > 5) {
            c = 0;
            System.out.println("no hay mas epacio para cuentas");
        }
        do {
            System.out.println("ingrese el nombre de la cuenta min 3 caracteres");
            titular[c] = leer.nextLine();
        } while (titular[c].length() < 3);

        do {
            System.out.println("ingrese una contraseña de 4 dig");
            contra[c] = leer.nextInt();
        } while (contra[c] < 1000 || contra[c] > 9999);

        c = c + 1;

    }

    public void ingresarDinero() {
        Scanner leer = new Scanner(System.in);
        int com = 0;
        boolean cp = false;
        System.out.println("ingrese el nombre de usuario");
        String us = leer.nextLine();
        System.out.println("ingrese la contraseña");
        int con = leer.nextInt();

        for (int i = 0; i < 5; i++) {
            if (us.equals(titular[i]) && con == contra[i]) {
                System.out.println("cuanto dinero decea ingrear");
                saldo[i] = leer.nextDouble();
                cp = true;
            }

        }

        if (cp == false) {
            System.out.println("usuario invalido o contraseña incorrecta");
        }
    }

    @SuppressWarnings("empty-statement")
    public void retirarDinero() {
        Scanner leer = new Scanner(System.in);
        double ret;

        int co = -1;
        System.out.println("ingrese el nombre de usuario");
        String nom = leer.nextLine();
        System.out.println("ingrese la contraseña");

        int pass = leer.nextInt();

        for (int i = 0; i < 5; i++) {
            if (contra[i] == pass && titular[i].equals(nom)) {
                co = i;
                break;
            }
        }
        if (co > -1 && co < 6) {
            System.out.println("ingrese la cantidad a retirar min 100");
            ret = leer.nextDouble();

            if (ret <= saldo[co] && ret > 99) {
                saldo[co] = saldo[co] - ret;
                System.out.println("su saldo es :" + saldo[co]);
            } else if (ret > saldo[co] || ret < 100) {
                if (ret > saldo[co]) {
                    System.out.println("lo sentimos no tiene saldo suficiente ");
                    System.out.println("su saldo es :" + saldo[co]);
                } else {
                    System.out.println("dinero insuficiente para retirar ingrese un monto mayor o realize un depocito");;
                    System.out.println("su saldo es :" + saldo[co]);
                }
            }

            if (co == -1) {
                System.out.println("usuario no encontrado o contraseña incorrecta");
            }
        }
    }

}

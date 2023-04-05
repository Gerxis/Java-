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
public class Juego {

    private int num, num2;
    private int vic1 = 0, vic2 = 0;

    Scanner leer = new Scanner(System.in);

    public Juego() {
    }

    public Juego(int num) {
        this.num = num;
    }

    public void Juego() {
        int cont = 3;
        String op = " ";
        do {
            System.out.println("Jugador 1 ingrese un numero");
            num = leer.nextInt();
            cont = 3;
            do {

                System.out.println("jugador dos adivine el numero tiene " + cont +" intentos");
                num2 = leer.nextInt();
                if (num2 < num) {
                    System.out.println("mas alto");
                }
                if (num2 > num) {
                    System.out.println("mas vajo");
                }
                cont -= 1;
            } while (num != num2 && cont > 0);

            if (num2 == num) {
                System.out.println("felicidades jugador 2 gano");
                vic2 += 1;
            } else {
                System.out.println("felicidades jugador 1 gano");
                vic1 += 1;
            }
            System.out.println("el numero era " + num);

            do {
                System.out.println("decea jugar nuevamente s/n");
                op = leer.next();
                op = op.toLowerCase();
            } while (!"s".equals(op) && !"n".equals(op));

        } while (!"n".equals(op));

    }

    public void resultado() {
        System.out.println("El jugador 1 gano " + vic1 + " partidas");
        System.out.println("El jugador 2 gano " + vic2 + " partidas");
        if (vic1 > vic2) {
            System.out.println("el ganador es el jugador 1");
        }
        if (vic2 > vic1) {
            System.out.println("El ganador es el jugador 2");
        }
        if (vic1 == vic2) {
            System.out.println("Es un empate");
        }
    }

}

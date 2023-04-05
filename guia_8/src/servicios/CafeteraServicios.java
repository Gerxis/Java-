/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class CafeteraServicios {

    Scanner leer = new Scanner(System.in);

    public void CarCafetera(Cafetera c) {
        int max;
        do {
            System.out.println("Ingre la capacidad maxima de su cafetera (min 5)");
            max = leer.nextInt();
        } while (max < 5);
        c.setCapacidadMaxima(max);
        c.setCantidadActual(0);
    }

    public void llenarCafetera(Cafetera c) {
        c.setCantidadActual(c.getCapacidadMaxima());
    }

    public void servvirTaza(Cafetera c) {
        String tasa[][];
        int tam;
        do {
            System.out.println("ingrese el tamaño de la tasa max 20");
            tam = leer.nextInt();
        } while (tam < 1 || tam > 20);

        tasa = new String[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (c.getCantidadActual() > 0) {
                    tasa[i][j] = "*";
                    
                } else {tasa [i][j]= "." ;}
            }
            c.setCantidadActual(c.getCantidadActual() - 1);
        }
        int cont = 0;
        boolean vali = false;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                vali = "*".equals(tasa[i][j]);

            }
              if (".".equals(tasa[i][0])) {
                    cont += +1;
                } 
        }

        if (vali == true) {
            System.out.println("su tasa se lleno completa");
        } else if (vali == false) {
            System.out.println("su tasa no se pudo llenar completa");
            System.out.println("se lleno hasta " + (tam - cont));
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print("(" + tasa[j][i] + ")");
            }
            System.out.println(" ");
        }

    }

    public void vaciarCafetera(Cafetera c) {
        c.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera c) {
        int cafe;
        do {
            System.out.println("Ingrese una cantidad de cafe");
            cafe = leer.nextInt();
        } while (cafe < 1);

        if ((c.getCantidadActual() + cafe) <= c.getCapacidadMaxima()) {
            c.setCantidadActual(c.getCantidadActual() + cafe);
        } else if ((c.getCantidadActual() + cafe) > c.getCapacidadMaxima()) {
            c.setCantidadActual(c.getCapacidadMaxima());
        }

    }

}

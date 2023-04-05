/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg8;

import entidades.CuentaBancaria;
import java.util.Scanner;
import servicios.CuentaBancariaServicios;

/**
 *
 * @author ALEXIS
 */
public class eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        CuentaBancariaServicios cbs = new CuentaBancariaServicios();
        CuentaBancaria cb[] = new CuentaBancaria[5];

        boolean vali = false;
        int cue = 0;
        while (!vali) {
            System.out.println("   Menu    ");
            System.out.println(" ____________________");
            System.out.println("|1. Crear Cuenta     |");
            System.out.println("|2. Ingresar Dinero  |");
            System.out.println("|3. Retirar Dinero   |");
            System.out.println("|4. Extraccion Rapida|");
            System.out.println("|5. Consultar Saldo  |");
            System.out.println("|6. Consultar Datos  |");
            System.out.println("|7. Salir            |");
            System.out.println("|____________________|");

            int op = leer.nextInt();

            switch (op) {
                case 1:
                    if (cue < 5) {
                        cb[cue] = cbs.crearCuentaBancaria();
                        cue += +1;
                    } else if (cue > 4) {
                        System.out.println("Se alcanso el maximo de cuenta posibles");
                    }
                    break;
                case 2:
                    com(op, cb, leer, cue);
                    break;
                case 3:
                    com(op, cb, leer, cue);
                    break;
                case 4:
                    com(op, cb, leer, cue);
                    break;
                case 5:
                    com(op, cb, leer, cue);
                    break;
                case 6:
                    com(op, cb, leer, cue);
                    break;
                case 7:
                    vali = true;
                    System.out.println("****************");
                    System.out.println("*****Adios...***");
                    System.out.println("****************7");
                    break;
                default:
                    System.out.println("opcion incorrecta op (1 - 7)");

            }
        }

    }

    public static void com(int op, CuentaBancaria cb[], Scanner leer, int cue) {
        int nc;
        boolean c = false;
        CuentaBancariaServicios cbs = new CuentaBancariaServicios();
        do {
            System.out.println("ingresa el numero de cuenta");
            nc = leer.nextInt();
        } while (nc < 1);
        for (int i = 0; i < cue; i++) {
            if (cb[i].getNumeroDeCuenta() == nc) {
                switch (op) {
                    case 2:
                        cbs.ingresarDinero(cb[i]);
                        break;
                    case 3:
                        cbs.retirarDinero(cb[i]);
                        break;
                    case 4:
                        cbs.extraccionRapida(cb[i]);
                        break;
                    case 5:
                        cbs.consultarSaldo(cb[i]);
                        break;
                    case 6:
                        cbs.consultarDatos(cb[i]);
                        break;

                }
                c = true;
                break;
            }
        }
        if (c == false) {
            System.out.println("No se encontro el numero de cuenta");
        }

    }

}

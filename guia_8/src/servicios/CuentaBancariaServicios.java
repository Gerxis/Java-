/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class CuentaBancariaServicios {

    private final Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuentaBancaria() {
        int cu;
        do {
            System.out.println("Ingrese El numero de cuenta");
            cu = leer.nextInt();
        } while (cu < 1);
        long dni;
        do {
            System.out.println("Ingrese su DNI");
            dni = leer.nextLong();
        } while (dni < 1);
        double sal;
        do {
            System.out.println("Ingrese el saldo de la cuenta");
            sal = leer.nextDouble();
        } while (sal < 0);

        return new CuentaBancaria(cu, dni, sal);
    }

    public void ingresarDinero(CuentaBancaria m) {
        double in;
        do {
            System.out.println("Monto a ingresar min 100");
            in = leer.nextDouble();
        } while (in < 100);

        m.setSaldoActual(m.getSaldoActual() + in);

    }

    public void retirarDinero(CuentaBancaria m) {
        double re;
        do {
            System.out.println("Monto a retirar min 100");
            re = leer.nextDouble();
        } while (re < 100);

        m.setSaldoActual(m.getSaldoActual() - re);

    }

    public void extraccionRapida(CuentaBancaria m) {
        int op;
        boolean vali = false;
        System.out.println("Solo puede retirar un 20% del saldo de su cuenta");

        System.out.println("Dinero actual : " + m.getSaldoActual());
        System.out.println("Dino max para retirar : " + m.getSaldoActual() * 0.20);
        while (!vali) {
            System.out.println(" 1 . Retirar el 20 %");
            System.out.println(" 2 . ingresar monto (no mas del 20%)");
            System.out.println(" 3 . Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    m.setSaldoActual(m.getSaldoActual() - (m.getSaldoActual() * 0.20));
                    System.out.println("operacion exitosa");
                    break;
                case 2:
                    double ex;
                    do {
                        ex = leer.nextDouble();
                    } while (ex < 0 && ex > m.getSaldoActual() * 0.20);
                    m.setSaldoActual(m.getSaldoActual() - ex);
                    System.out.println("operacion exitosa");
                    break;
                case 3 : vali = true ;
                break;
                default : System.out.println("opcion incorrecta op (1-3)");
                
            }
        }

    }

    public void consultarSaldo(CuentaBancaria m) {
        System.out.println("Su saldo es " + m.getSaldoActual());

    }

    public void consultarDatos(CuentaBancaria m) {
        System.out.println("Datos ");
        System.out.println(m);

    }
}

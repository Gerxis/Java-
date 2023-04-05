/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Ecuacion;

/**
 *
 * @author ALEXIS
 */
public class EcuacionService {

  

    public EcuacionService() {
    }

    //Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    public double getDiscriminante(Ecuacion e) {

        return (Math.pow(e.getB(), 2)) - 4 * e.getA() * e.getC();
    }

    //Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(Ecuacion e) {
        return (Math.pow(e.getB(), 2)) - 4 * e.getA() * e.getC() > 0;
    }

    //Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Ecuacion e) {
        return (Math.pow(e.getB(), 2)) - 4 * e.getA() * e.getC() == 0;
    }

    //Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
    public void obtenerRaices(boolean val, Ecuacion e) {
        double res;
        if (val == true) {
            System.out.println("las dos posibles soluciones son :");
            res = -e.getB() + Math.sqrt(getDiscriminante(e)) / 2 * e.getA();
            System.out.println("soluvion 1 = " + res);

            res = -e.getB() - Math.sqrt(getDiscriminante(e)) / 2 * e.getA();
            System.out.println("solucion 2 = " + res);
        } else {
            System.out.println("no tiene dos resultados");
        }

    }

    //Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
    public void ObtenerRaiz(boolean val, Ecuacion e) {
        double res;
        if (val == true) {
            res = -e.getB() / (2 * e.getA());
            System.out.println("La unica solucion es " + res);
        } else {
            System.out.println("no hay una unica solucion");
        }

    }

    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones
            que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que 
            devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.*/
    public void calcular(Ecuacion e) {
        if (tieneRaices(e) == true && tieneRaiz(e) == true) {
            System.out.println("Raices =");
            obtenerRaices(true, e);
            System.out.println("Raiz =");
            ObtenerRaiz(true, e);

        }else {System.out.println("No se cumplen las condiciones");}
    }
}

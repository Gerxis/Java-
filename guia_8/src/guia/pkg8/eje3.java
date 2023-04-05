/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg8;

import entidades.Persona;
import servicios.PersonaService;

/**
 *
 * @author ALEXIS
 */
public class eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaService ps = new PersonaService();

        Persona p[];
        p = new Persona[4];
        boolean mayor[];
        mayor = new boolean[4];

        int Imc[];
        Imc = new int[4];

        for (int i = 0; i < 4; i++) {
            p[i] = ps.crearPersona();
            Imc[i] = ps.CalcularImc(p[i]);
            mayor[i] = ps.MayorDeEdad(p[i].getEdad());
        }
        double  c = 0, c1 = 0, c2 = 0, c4 = 0;

        for (int i = 0; i < 4; i++) {

            switch (Imc[i]) {
                case -1:
                    c = c + 1;
                    break;
                case 0:
                    c1 = c1 + 1;
                    break;
                case 1:
                    c2 = c2 + 1;
                    break;
            }

            if (mayor[i] == true) {
                c4 = c4 + 1;
            }
        }
        
    
        
        System.out.println("Peso debajo del ideal : " + c / 4 * 100);
        System.out.println("Peso ideal : " + c1  / 4 * 100);
        System.out.println("Peso mayor al ideal : " + c2 / 4 * 100);
        System.out.println("Personas mayores de edad " + c4);
        System.out.println("Personas menores de edad " + (4 - c4));

        /*porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima,
y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.*/
    }

}

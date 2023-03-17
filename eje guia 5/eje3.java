/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia5;

/**
 *
 * @author ALEXIS
 */
public class eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vec [] = new int [20];
        int cont =  0 , cont2 = 0 ;
        int uno = 0 , dos = 0, tres = 0, cuatro = 0, cinco = 0;
        
        for (int i = 0; i < vec.length; i++) {
            vec[i]= (int) (Math.random()*5000 + 1);
            System.out.print(vec[i] + " ");
        }
        
        for (int i = 0; i < vec.length; i++) {
            cont = vec[i];
            
            do {cont = cont / 10 ; cont2 += + 1 ; }while (cont > 0); 
            
            switch (cont2) {
                case 1: {uno += +1 ;} break;
                case 2: {dos += +1 ;} break;
                case 3: {tres += +1 ;} break;
                case 4: {cuatro += +1 ;} break;
                case 5: {cinco += +1 ;} break;
            
            }
            cont2 = 0 ;
        }
        System.out.println(" ");
        System.out.println("hay " + uno + " numeros de un digito");
          System.out.println("hay " + dos + " numeros de dos digito");
            System.out.println("hay " + tres + " numeros de tres digito");
              System.out.println("hay " + cuatro + " numeros de cuanto digito");
                System.out.println("hay " + cinco + " numeros de cinco digito");
    }
    
}

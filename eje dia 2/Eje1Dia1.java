/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Escribir un programa que pida dos números enteros por teclado y calcule la 
suma de los dos. El programa deberá después mostrar el resultado de la suma*/
package eje.pkg1.dia.pkg1;
import java.util.Scanner;
/**
 *
 * @author ALEXIS
 */
public class Eje1Dia1 {

    public static void main(String[] args) {
     Scanner Leer = new Scanner(System.in) ;
     int num1 ;
     int num2 ;
    System.out.println ("ingrasa dos numeros para sumar numero"); 
    
    num1 = Leer.nextInt();
    num2 = Leer.nextInt();
    
    int num3 = num1 + num2 ;
    
        System.out.println("La suma de os numero ingresado es :" + num3 );
    
    }
    }
       


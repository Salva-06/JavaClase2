/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclase2;
import java.util.Scanner;
/**
 *
 * @author Salva
 */
public class Ejercicio3_version2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //resolucion del ejercicio 3 por medio de las formulas//
    int operation, n, sum;
    Scanner sc=new Scanner (System.in);
        System.out.println("Indique que tipo de suma quiere hacer:");
        System.out.println("1. Suma de los n primeros numeros naturales");
        System.out.println("2. Suma de los n primeros numeros cuadrados");
        System.out.println("3. Suma de los n primeros numeros cubicos");
        operation=sc.nextInt();
        if (operation !=1 && operation !=2 && operation !=3){
            System.out.println("ERROR");
        }
        if (operation == 1){
            System.out.println("Ingrese el valor de n :");
            n=sc.nextInt();
            sum = n*(n+1)/2;
            System.out.println("La suma es : "+sum);
        }
        if (operation ==2){
            System.out.println("Ingrese el valor de n :");
            n=sc.nextInt();
            sum = n*(n+1)*(2*n+1)/6;
            System.out.println("La suma es: "+sum);
        }
        if (operation ==3){
            System.out.println("Ingrese el valor de n :");
            n=sc.nextInt();
            sum= (n*n)*(n+1)*(n+1)/4;
            System.out.println("La suma es: "+sum);
        }
    } 
}

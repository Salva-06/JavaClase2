/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaclase2;
import java.util.Scanner;
/**
 *
 * @author Salva
 * 
 */
public class JavaClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Problema 1//
    double n, numerador, denominador, result;
    Scanner sc=new Scanner (System.in);
    System.out.println("Ingrese el valor de X: ");
    n = sc.nextDouble();
    numerador = 2*Math.pow(n,-5) + 5*Math.pow(n,2) - 8*n;
    denominador = Math.sqrt(9*Math.pow(n, 3)-2*Math.pow(n,2)+n);
    result=numerador/denominador;
    if(result<1 && result>-1){
    System.out.println("El resultado es " +result+ " y esta dentro del rango");
    }
    else {
    System.out.println("El resultado es "+result+" y esta fuera del rango");
    }
    }
}

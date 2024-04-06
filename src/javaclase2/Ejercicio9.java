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
public class Ejercicio9 {
public static void main(String[] arg){
    // Codigo para saber si un numero es par o impar//
int n;
Scanner sc = new Scanner (System.in);
    System.out.println("Ingrese un numero: ");
    n = sc.nextInt();
    if (n%2==1){
        System.out.println("El numero es impar");
    }
    if (n%2==0){
        System.out.println("El numero es par");
    }
}
}

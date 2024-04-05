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
public class Ejercicio10 {
public static void main(String[] arg){
double radius, volume;
final float PI = 3.141592f;
Scanner sc=new Scanner (System.in);
    System.out.println("Ingrese el radio: ");
    radius = sc.nextFloat();
    if (radius<0){
        System.out.println("ERROR");
    }
    else {
        volume = (4*PI*(Math.pow(radius,3)))/3;
    System.out.println("El volumen es de: " + volume);
    }
}
}
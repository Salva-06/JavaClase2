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
public class Ejercicio7 {
public static void main(String[] arg) {
float r, area;
float PI = 3.141592f;
Scanner sc=new Scanner (System.in);
    System.out.println("Ingrese el valor del radio: ");
    r = sc.nextFloat();
    if (r >=0){
    area = PI*(r*r);
    System.out.println("El area del circulo es de: "+area);
}
    else
        System.out.println("No existe");
}
}

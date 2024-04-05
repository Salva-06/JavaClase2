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
public class Ejercicio5 {
public static void main(String[] arg) {
    //Use % para solo oquedarme con la parte decimal y asi obtener la parte entera//
    float angulo,grados, minutos, segundos;
    Scanner sc=new Scanner (System.in);
    System.out.println("Ingrese el angulo en radianes: ");
    angulo = sc.nextFloat();
    grados = angulo - angulo%1;
    minutos = (angulo%1)*60 - ((angulo%1)*60)%1;
    segundos = (((angulo%1)*60)%1)*60;
        System.out.println("El angulo en sexagesimales es: "+grados+" grados "+minutos+" minutos "+segundos+" segundos");
    
    }
}

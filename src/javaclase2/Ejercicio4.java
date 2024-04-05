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
public class Ejercicio4 {
    
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int plano;
        double distance;
        Scanner sc=new Scanner (System.in); 
        System.out.println("En que plano desea trabajar");
        System.out.println("1. En 2D");
        System.out.println("2. En 3D");
        plano = sc.nextInt();
        if (plano != 1 && plano !=2){
            System.out.println("ERROR");
        }
        if (plano == 1){
            double a,b,a1,b1;
            System.out.println("Ingrese los valores de la primera coordenada");
            System.out.println("x:");
            a = sc.nextDouble();
            System.out.println("y:");
            b = sc.nextDouble();
            System.out.println("Ingrese los valores de la segunda coordenada");
            System.out.println("x:");
            a1 = sc.nextDouble();
            System.out.println("y:");
            b1 = sc.nextDouble();
            distance = Math.sqrt(Math.pow(a1-a,2)+Math.pow(b1-b, 2));
            System.out.println("La distancia es de "+distance+"unidades");
        }
        if (plano ==2){
            double a,b,c,a1,b1,c1;
            System.out.println("Ingrese los valores de la primera coordenada");
            System.out.println("x:");
            a = sc.nextDouble();
            System.out.println("y:");
            b = sc.nextDouble();
            System.out.println("z:");
            c = sc.nextDouble();
            System.out.println("Ingrese los valores de la segunda coordenada");
            System.out.println("x:");
            a1 = sc.nextDouble();
            System.out.println("y:");
            b1 = sc.nextDouble();
            System.out.println("z:");
            c1 = sc.nextDouble();
            distance = Math.sqrt(Math.pow(a1-a,2)+Math.pow(b1-b, 2)+Math.pow(c1-c, 2));
            System.out.println("La distancia es de "+distance+"unidades");
        }
    }
}

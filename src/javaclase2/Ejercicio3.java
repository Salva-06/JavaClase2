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
public class Ejercicio3 {
public static void main(String[] args) {
//resolución del ejercicio 3 por medio del ciclo for//
    int Operacion, n, sum=0;
    Scanner sc=new Scanner (System.in);
        System.out.println("Que deseas realizar:");
        System.out.println("1. Suma de los n primeros numeros naturales");
        System.out.println("2. Suma de los n primeros numeros cuadrados");
        System.out.println("3. Suma de los n primeros numeros cubicos");
        Operacion=sc.nextInt();
        if (Operacion !=(1) && Operacion !=(2) && Operacion !=(3)){
            System.out.println("Error");
            }
        if (Operacion ==1){
            System.out.println("Ingrese el valor de n:");
            n=sc.nextInt();
            
            for (int i = 0; i<=n; i++){
                sum = sum + i;
            }
            System.out.println("La suma es de:"+sum);
        }
        if (Operacion ==2){
            System.out.println("Ingrese el valor de n:");
            n=sc.nextInt();
            for (int i =0 ; i<=n; i++){
                sum = sum + (i*i);
            }
            System.out.println("La suma es de:"+sum);
        }
        if (Operacion ==3) {
            System.out.println("Ingrese el valor de n:");
            n=sc.nextInt();
            for (int i=0 ; i<=n; i++){
                sum = sum + (i*i*i);
            }
            System.out.println("La suma es de:"+sum);
}
}
}
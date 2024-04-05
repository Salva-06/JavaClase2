/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclase2;

/**
 *
 * @author Salva
 */
public class Ejercicio2 {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Primer cilindro : radio1, altura1 y area1 
        Segundo cilindro: radio2, altura2 y area2 */ 
        float radio1 = 4.0f;
        float radio2 = 2.0f;
        float altura1 = 5.0f;
        float altura2 =2.5f;
        float area1;
        float area2;
        final float PI = 3.141592f;
        area1 = 2*PI*(float)Math.pow(radio1,2) + 2*PI*radio1*altura1 ;
        area2 = 2*PI*(float)Math.pow(radio2,2) + 2*PI*radio2*altura2 ;
        System.out.println("El area del primer cilindro es de " + area1 + " metros cuadrados");
        System.out.println("El area del segundo cilindro es de " + area2 + " metros cuadrdos");
    } 
}

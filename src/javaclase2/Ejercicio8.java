/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclase2;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Salva
 */
public class Ejercicio8 {
public static void main(String[] arg) {
float cash;
float b200,b100,b50,b20,b10,m5,m2,m1,c50,c20,c10;
Scanner sc=new Scanner (System.in);
    System.out.println("Ingrese el monto: ");
    cash = sc.nextFloat();
    
b200= (float)((cash-cash%200)/200);
b100= (float)(((cash%200 - (cash%200)%100))/100);
b50= (float)(((cash%200)%100 - (((cash%200)%100)%50))/50);
b20= (float)((((cash%200)%100)%50-(((cash%200)%100)%50)%20)/20);
b10= (float)(((((cash%200)%100)%50)%20 - ((((cash%200)%100)%50)%20)%10)/10);
m5= (float)((((((cash%200)%100)%50)%20)%10 - (((((cash%200)%100)%50)%20)%10)%5)/5);
m2=(float)(((((((cash%200)%100)%50)%20)%10)%5-((((((cash%200)%100)%50)%20)%10)%5)%2)/2);
m1=(float)((((((((cash%200)%100)%50)%20)%10)%5)%2 - (((((((cash%200)%100)%50)%20)%10)%5)%2)%1)/1);
c50= (float) (((cash%1)*10-((cash%1)*10)%5)/5);
c20= (float) ((((cash%1)*10)%5 - (((cash%1)*10)%5)%2)/2);
c10= (float) (((((((((((cash%200)%100)%50)%20)%10)%5)%2)%1)%(0.5))%(0.2))/(0.1));
DecimalFormat df=new DecimalFormat("#");
    System.out.println("Billetes de 200: "+(int)b200);
    System.out.println("Billetes de 100: "+(int)b100);
    System.out.println("Billetes de 50: "+(int)b50);
    System.out.println("Billetes de 20: "+(int)b20);
    System.out.println("Billetes de 10: "+(int)b10);
    System.out.println("Monedas de 5: "+(int)m5);
    System.out.println("Monedas de 2: "+(int)m2);
    System.out.println("Monedas de 1: "+(int)m1);
    System.out.println("Monedas de 0.5: "+(int)c50);
    System.out.println("Monedas de 0.2: "+(int)c20);
    System.out.println("Monedas de 0.1: "+df.format(c10));

}
}

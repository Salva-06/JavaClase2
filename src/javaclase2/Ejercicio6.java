/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclase2;
import java.util.Random;
/**
 *
 * @author Salva
 */
public class Ejercicio6 {
public static void main(String[] arg) {
double a,b,c,d,V1,V2,V3,V4,prom;
a = Math.random();
b = Math.random();
c = Math.random();
d = Math.random();
V1 = (a*99)+1 - ((a*99)+1)%1;
V2 = (b*99)+1 - ((b*99)+1)%1;
V3 = (c*99)+1 - ((c*99)+1)%1;
V4 = (d*99)+1 - ((d*99)+1)%1;
prom = (V1+V2+V3+V4)/4;
System.out.println(V1+" "+V2+" "+V3+" "+V4);
if (V1>V2&&V1>V3&&V1>V4){
    System.out.println("El mayor numero es: "+V1);
}
if (V2>V1&&V2>V3&&V2>V4){
    System.out.println("El mayor numero es: "+V2);
}
if (V3>V2&&V3>V1&&V3>V4){
    System.out.println("El mayor numero es: "+V3);
}
if (V4>V2&&V4>V3&&V4>V1){
    System.out.println("El mayor numero es: "+V4);
}
if (V1<V2&&V1<V3&&V1<V4){
    System.out.println("El menor numero es: "+V1);
}
if (V1<V2&&V1<V3&&V1<V4){
    System.out.println("El menor numero es: "+V1);
}
if (V2<V1&&V2<V3&&V2<V4){
    System.out.println("El menor numero es: "+V2);
}
if (V3<V2&&V3<V1&&V3<V4){
    System.out.println("El menor numero es: "+V3);
}
if (V4<V2&&V4<V3&&V4<V1){
    System.out.println("El menor numero es: "+V4);
}
System.out.println("El promedio es de: "+prom);
        }
}

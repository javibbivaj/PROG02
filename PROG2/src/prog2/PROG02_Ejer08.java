/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2;

/**
 * Diseña un programa Java que calcule la suma, resta, multiplicación y división de dos números introducidos por teclado.
 * Incorpora también las funciones que permitan realizar la potencia de un número y la raíz cuadrada del otro. 
 * @author JaviB BivaJ
 */
import java.util.Scanner; // importamos para introducir valores

public class PROG02_Ejer08 {
static Scanner keyboard = new Scanner( System.in );    
    public static void main (String[] args){
        int x, y;
        System.out.println("Este programa calcula el valor de x para resolver C1x + C2 = 0");
        System.out.print("\nPrimer número entero (C1): ");
        x = keyboard.nextInt();
        System.out.print("Segundo número entero (C2): ");
        y = keyboard.nextInt();
        System.out.println("Estoy pensando.... Lo tengo! Empiezo!!");
        System.out.printf("Los datos x: %d y: %d", x,y);
        System.out.println("\nx+y=" + (x+y));
        System.out.println("x-y=" + (x-y));
        System.out.println("x*y=" + (x*y));
        System.out.println("x/y=" + (x/y));
        System.out.println("x^2=" + (x^2));
        System.out.println("Raiz de x=" + Math.sqrt(x));
    }
}

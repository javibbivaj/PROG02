/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2;

/**
 *
Diseña un programa Java para resolver una ecuación de primer grado con una incógnita (x),
suponiendo que los coeficientes de la ecuación (C1 y C2) se introducen desde teclado.
C1x + C2 = 0

 * @author JaviB BivaJ
 */
import java.util.Scanner; // importamos para introducir valores

public class PROG02_Ejer07 {
    static Scanner keyboard = new Scanner( System.in );    
    public static void main (String[] args){
        int c1, c2;
        float x;
        System.out.println("Este programa calcula el valor de x para resolver C1x + C2 = 0");
        System.out.print("\nPrimer número entero (C1): ");
        c1 = keyboard.nextInt();
        System.out.print("Segundo número entero (C2): ");
        c2 = keyboard.nextInt();
        x=(-c2/c1);
        System.out.println("Estoy pensando.... Esto más esto... me llevo una... lo tengo!"
                + "\nEl valor de X es :" +x);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2;

/**
 * Diseña un programa Java que solicite un número de 5 dígitos del teclado,
 * separe el número en sus dígitos individuales y los muestre por pantalla.
 * 
 * @author JaviB BivaJ
 */
import java.util.Scanner; // importamos para introducir valores
public class PROG02_Ejer09 {
    static Scanner keyboard = new Scanner( System.in );
    public static void main (String[] args){
        long num,num2;
        System.out.println("Este programa descompone un número de 5 dígitos. "
                + "Intruduce el valor");
        num = keyboard.nextInt();
        while (num<9999 ^ num>99999){
           System.out.println("El número no es de 5 dígitos. "
                + "Intruduce el valor de nuevo");
            num = keyboard.nextInt();  
        }
        
        for (num2=10000; num2>=1; num2=num2/10){
            long i;
            i =num/num2;
            System.out.print(i+" ");
            num= (num - num2*i);
        }
        
        }
}

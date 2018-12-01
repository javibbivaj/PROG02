/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2;
import java.util.Scanner; // importamos para introducir valores
/**
 *Diseña un programa Java que
 * pida dos números por teclado, 
 * determine si el primero es múltiplo del segundo y muestre el resultado.
 * @author JaviB BivaJ
 */
public class PROG02_Ejer05 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner( System.in );    
        int a, b;
        
        //introducimos los valores
        System.out.println("Indique dos valores, se calculará si son múltiplos");
        System.out.print("\nPrimer número: ");
        a = keyboard.nextInt();
        System.out.print("Segundo número: ");
        b = keyboard.nextInt();

        // para comprobar si el primero es múltiplo, vamos a:
        // calcular el resto de la división del primero frente al segundo
        // si es 0, son múltiplos
        // consideramos, por tanto, que si son iguales, son múltiplos
        
        if (a % b == 0){
            System.out.println("Los números son múltiplos");
        }
        else{           
            System.out.println("Los números no son múltiplos");  
        }
    }
}
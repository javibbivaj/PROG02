/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2;

/**
 * Diseña un programa Java que cree un tipo enumerado para los meses del año.
 * El programa debe realizar las siguientes operaciones:
Crear una variable m del tipo enumerado y asignarle el mes de marzo. 
Mostrar por pantalla su valor.

* Asignar a la variable m, la cadena de texto "MARZO".
* Mostrar por pantalla el valor de la variable de tipo enumerado tras realizar la asignación.

 * @author JaviB BivaJ
 */
public class PROG02_Ejer06 {
    public enum Meses {enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre}
    static Meses m = Meses.marzo;
    public static void main(String[] args) {
       System.out.println("La variable m es " + m);
       String m = "MARZO";
       System.out.println("Y ahora la variable m es " + m);
    }
}

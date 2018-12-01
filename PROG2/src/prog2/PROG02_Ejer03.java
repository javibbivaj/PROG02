/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2;

/**
 * ejercio para identificación de tipos de variable adecuados
 * @author JaviB BivaJ
 */
public class PROG02_Ejer03 {
   
    public enum DiasSemana {Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo} //enumeración de los días de la semana
    public enum Sexo {V, M}; //enumeración del sexo
    
    public static void main(String[] args) {   
// TODO code application logic here
        boolean casado=true;
        int MAX = 999999;
        short diaAnyo = 300;
        long miliseg=1298332800000L, pobMundial = 6775235741L;
        double factura = 10350.678;
        
        DiasSemana dia1 = DiasSemana.Lunes;
        Sexo  varon = Sexo.M;
        
        
        System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.println("El valor de la variable casado es "+ casado);
        System.out.println("El valor de la variable MAXIMO es " + MAX);
        System.out.println("El valor de la variable diasem es " + dia1);
        System.out.println("El valor de la variable diaanual es " + diaAnyo);
        System.out.println("El valor de la variable miliseg es " + miliseg);
        System.out.println("El valor de la variable totalfactura es " + factura);
        System.out.println("El valor de la variable poblacion es " + pobMundial);
        System.out.println("El valor de la variable sexo es " + varon);
        
        System.out.print("\n\n\n\n\n----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.print("\nEl valor de la variable casado es "+ casado);
        System.out.print("\nEl valor de la variable MAXIMO es " + MAX);
        System.out.print("\nEl valor de la variable diasem es " + dia1);
        System.out.print("\nEl valor de la variable diaanual es " + diaAnyo);
        System.out.print("\nEl valor de la variable miliseg es " + miliseg);
        System.out.print("\nEl valor de la variable totalfactura es " + factura);
        System.out.print("\nEl valor de la variable poblacion es " + pobMundial);
        System.out.print("\nEl valor de la variable sexo es " + varon + "\n");
        
        System.out.printf("\n\n\n\n\n----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.printf("\nEl valor de la variable casado es %s", casado);
        System.out.printf("\nEl valor de la variable MAXIMO es %d", MAX);
        System.out.printf("\nEl valor de la variable diasem es %s", dia1);
        System.out.printf("\nEl valor de la variable diaanual es %d", diaAnyo);
        System.out.printf("\nEl valor de la variable miliseg es %d", miliseg);
        System.out.printf("\nEl valor de la variable totalfactura es %.3f", factura);
        System.out.printf("\nEl valor de la variable poblacion es %d", pobMundial);
        System.out.printf("\nEl valor de la variable sexo es %s\n", varon);
       
        
        
        
    }  //fin de la clase main
} // fin de la aplicación
        


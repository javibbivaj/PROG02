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
        boolean casado;
        int MAX;
        short diaAnyo;
        double miliseg;
        double factura;
        long pobMundial; 

        casado=true;
        MAX=999999;
        DiasSemana dia1 = DiasSemana.Lunes;
        diaAnyo=300;
        miliseg=1298332800000;
        factura=10350.678;
        pobMundial=6775235741;
        Sexo  varon = Sexo.V;


        
/*
Utiliza el operador de asignación para inicializar las variables a los valores que se indican en los mensajes.
Utiliza la secuencia de escape correspondiente para generar un tabulador al principio de cada línea salvo de la primera
Mostrar el siguiente resultado:
Usando sólo la orden println:

----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----
El valor de la variable casado es true
El valor de la variable MAXIMO es 999999
El valor de la variable diasem es 1
El valor de la variable diaanual es 300
El valor de la variable miliseg es 1298332800000
El valor de la variable totalfactura es 10350.678
El valor de la variable poblacion es 6775235741
El valor de la variable sexo es M

Usando sólo la orden print:

----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----
El valor de la variable casado es true
El valor de la variable MAXIMO es 999999
El valor de la variable diasem es 1
El valor de la variable diaanual es 300
El valor de la variable miliseg es 1298332800000
El valor de la variable totalfactura es 10350.678
El valor de la variable poblacion es 6775235741
El valor de la variable sexo es M

Usando sólo la orden printf:

----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----
El valor de la variable casado es true
El valor de la variable MAXIMO es 999999
El valor de la variable diasem es 1
El valor de la variable diaanual es 300
El valor de la variable miliseg es 1298332800000
El valor de la variable totalfactura es 10350,677734
El valor de la variable totalfactura en notación científica es 1.035068E+04
El valor de la variable poblacion es 6775235741
El valor de la variable sexo es M
*/
        
    }  //fin de la clase main
} // fin de la aplicación



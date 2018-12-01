/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2;

/**
 *
 * @author JaviB BivaJ
 */
public class PROG02_Ejer10 {

    public static void main (String[] args){
            
            System.out.println("------- Conversiones entre enteros y coma flotante -------");
            
            float x=4.5F;
            float y=3.0F;
            int	i=2;
            int	j;
            j= (int) (i*x);
            System.out.println("Producto de int por float: j= i*x = "+j); 
            
            double dx=2.0;
            double dz;
            dz=(dx*y);
            System.out.println("Producto de float por double: dz=dx * y = " + dz);
    
            
            
            System.out.println("------- Operaciones con byte -------");
            
            byte bx=5;
            byte by=2;
            byte bz;
            bz=(byte)(bx-by);
            System.out.println("byte: "+bx+" - "+by+" = " + bz);
            
            bx=-128;
            by=1;
            bz=(byte)(bx-by);
            System.out.println("byte: "+bx+" - "+by+" = " + bz);
            
            int bzint=(bx-by); //necesitamos una variable int
            System.out.println("(int): "+bx+" - "+by+" = " + bzint);

            
            System.out.println("------- Operaciones con short -------");
            short sx=5;
            short sy=2;
            short sz;
            sz=(short) (sx-sy);
            System.out.println("short: "+sx+" - "+sy+" = "+sz);
           
            sx = 32767; // rango de short -32,768 a 32,767
            sy = 1;
            sz = (short) (sx + sy);
            System.out.println("short: "+sx+" + "+sy+" = "+sz);
            
            System.out.println("------- Operaciones con char -------");
 
            char cx ='\u000F';
            char cy='\u0001';
            int	z;
            z = (cx - cy);
            System.out.println("char: "+cx+" - "+cy+" = "+z);
            
            z = (cx - 1);
            System.out.printf("char(%#x) - 1 = %d\n",(int)cx,z);

            cx='\uFFFF';
            z=cx;
            System.out.println("(int)= "+z);
            
            sx= (short) cx;
            System.out.println("(short)= "+sx);
            
            sx=-32768;
            cx= (char) sx;
            z= (char) sx;
            System.out.println(sx+" short-char-int = "+z);
            
            sx = -1;
            cx = (char) sx; 
            z = (int) cx; 
            System.out.println(sx+" short-char-int = "+z);           
    }
}

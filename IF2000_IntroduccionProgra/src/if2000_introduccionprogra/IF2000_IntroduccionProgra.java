/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante
 */

package if2000_introduccionprogra;
 import Logic.*;
import java.util.Scanner;
import java.util.Arrays;

public class IF2000_IntroduccionProgra {
    
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  // Person p = new Person ("Manuel","Jimenez","C234432","E772812",20);
 Repositorio_semana2_practica1 ej = new Repositorio_semana2_practica1();
  ej.quiz2_B_piramide(4);
  
  System.out.println("\n\n");
  
  Repertorio_sem2_prac1 cuadr = new Repertorio_sem2_prac1();
  cuadr.cuadrado(6, 6);
  
  System.out.println("\n\n");
    Scanner sc = new Scanner(System.in);
        TriangulosInvertidos obj = new TriangulosInvertidos();

        // Prueba de triángulos invertidos
        System.out.println("Triángulo invertido a la izquierda:");
        obj.trianguloIzquierda(5);

        System.out.println("\nTriángulo invertido a la derecha:");
        obj.trianguloDerecha(5);

        // Prueba de ejercicios
        obj.ejercicio1(sc);
        obj.ejercicio2(sc);
        obj.ejercicio3();
        obj.ejercicio4(sc);
        obj.ejercicio5(sc);
        obj.ejercicio6(sc);
        obj.ejercicio7(sc);
        obj.ejercicio8(sc);
        obj.ejercicio9(sc);
        obj.ejercicio10(sc);
        obj.ejercicio11(sc);
        obj.ejercicio12(sc);

        sc.close();
    }
 } 




/* String name = "Lionel";
    int age =40;
    
    System.out.println("Hello Word ");
    System.out.println (" name: "+name);
    System.out.println(" Age: "+age);
  
    }
}   /*
        Tipos de datos Numericos:
        int,long,short,float,double,numeric,money,decimal
        Manejo de fechas: Date
        Cadena de texto: Strng
        Objetos: object
        Data structres:
        Arrays or Vectors: int[] x; 
          int[][] y;
         */    
           
    

    
    

 


    


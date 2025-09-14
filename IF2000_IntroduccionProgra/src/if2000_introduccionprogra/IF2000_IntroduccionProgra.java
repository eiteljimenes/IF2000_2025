
/** //esta incluido el lab1
 *
 * @author estudiante
 */
package if2000_introduccionprogra;

import Logic.*;
import java.util.Scanner;
public class IF2000_IntroduccionProgra {

    public static void main(String[] args) {

        // Ejercicios previos de la semana
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

        // Llamada de todos los ejercicios de Lab2
        Lab2 ejercicios = new Lab2();
        ejercicios.ejercicio1(sc);
        ejercicios.ejercicio2(sc);
        ejercicios.ejercicio3();
        ejercicios.ejercicio4(sc);
        ejercicios.ejercicio5(sc);
        // ejercicios.ejercicio6(sc);
        ejercicios.ejercicio7(sc);
        ejercicios.ejercicio8(sc);
        ejercicios.ejercicio9(sc);
        ejercicios.ejercicio10(sc);
        ejercicios.ejercicio11(sc);
        ejercicios.ejercicio12(sc);

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
         
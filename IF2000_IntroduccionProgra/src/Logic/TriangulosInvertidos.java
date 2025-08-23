/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author eitel
 */
public class TriangulosInvertidos {

    // Triángulo invertido alineado a la izquierda
    public void trianguloIzquierda(int altura) {
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Triángulo invertido alineado a la derecha
    public void trianguloDerecha(int altura) {
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print("  "); // Espacios a la izquierda
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TriangulosInvertidos obj = new TriangulosInvertidos();

        System.out.println("Triángulo invertido a la izquierda:");
        obj.trianguloIzquierda(5);

        System.out.println("\nTriángulo invertido a la derecha:");
        obj.trianguloDerecha(5);
    }
}


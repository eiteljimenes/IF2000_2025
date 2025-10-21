/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author eitel
 */
public class Repertorio_sem2_prac1 {
   
  public void cuadrado(int f, int c){ 
   
    for (int i = 1; i <= f; i++) {
         for (int j = 1; j <=c; j++) {
           if (i == 1 || i == f || j == 1 || j == c) {
             System.out.print("* ");
        }else{ 
             System.out.print("  ");
           }
       } 
           System.out.println("");
    } 
   }   
 
  /* public static void main(String[] args) {
    Repertorio_sem2_prac1 cuadr = new Repertorio_sem2_prac1();
    cuadr.cuadrado(6, 6);
}
*/
    }
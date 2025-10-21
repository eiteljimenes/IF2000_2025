/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author eitel
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author eitel
 */
public class Lab2 {

    // 1) Determinar si un número es par o impar
    public void ejercicio1(Scanner sc) {
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR.");
        } else {
            System.out.println("El número " + numero + " es IMPAR.");
        }
    }

    // 2) Valor absoluto de un número
    public void ejercicio2(Scanner sc) {
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        int absoluto = Math.abs(numero);
        System.out.println("El valor absoluto es: " + absoluto);
    }

    // 3) Serie 3, 6, 9 … 99 y su suma
    public void ejercicio3() {
        int suma = 0;
        for (int i = 3; i <= 99; i += 3) {
            System.out.print(i + " ");
            suma += i;
        }
        System.out.println("\nLa suma de la serie es: " + suma);
    }

    // 4) Ordenar tres números ascendentemente
    public void ejercicio4(Scanner sc) {
        int[] numeros = new int[3];
        System.out.print("Ingrese el primer número: ");
        numeros[0] = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numeros[1] = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        numeros[2] = sc.nextInt();

        Arrays.sort(numeros);
        System.out.println("Orden ascendente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }

    // 5) Operaciones con dos números
    public void ejercicio5(Scanner sc) {
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        int resultado;
        if (a == b) resultado = a * b;
        else if (a > b) resultado = a - b;
        else resultado = a + b;

        System.out.println("Resultado: " + resultado);
    }

    // 6) Notas hasta -1 y verificar si hubo 10
  /*  public void ejercicio6(Scanner sc) {
        boolean huboDiez = false;
        int nota;

        do {
            System.out.print("Ingrese una nota (0-10, o -1 para terminar): ");
            nota = sc.nextInt();
            if (nota == 10) huboDiez = true;
        } while (nota != -1);

        if (huboDiez) System.out.println("Sí hubo al menos una nota con valor 10.");
        else System.out.println("No hubo notas con valor 10.");
    } */

    // 7) Pulsaciones por sexo y edad
    public void ejercicio7(Scanner sc) {
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese su sexo (M/F): ");
        char sexo = sc.next().charAt(0);

        int pulsaciones;
        if (sexo == 'F' || sexo == 'f') pulsaciones = (220 - edad) / 10;
        else pulsaciones = (210 - edad) / 10;

        System.out.println("Número de pulsaciones por 10 segundos: " + pulsaciones);
    }

    // 8) Utilidad por antigüedad
    public void ejercicio8(Scanner sc) {
        System.out.print("Ingrese el salario mensual: ");
        double salario = sc.nextDouble();
        System.out.print("Ingrese los años de antigüedad: ");
        int años = sc.nextInt();

        double utilidad;
        if (años < 1) utilidad = salario * 0.05;
        else if (años < 2) utilidad = salario * 0.07;
        else if (años < 5) utilidad = salario * 0.10;
        else if (años < 10) utilidad = salario * 0.15;
        else utilidad = salario * 0.20;

        System.out.println("La utilidad anual es: " + utilidad);
    }

    // 9) Verificar si un número es primo
    public void ejercicio9(Scanner sc) {
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        boolean primo = true;

        if (n <= 1) primo = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) System.out.println(n + " es primo.");
        else System.out.println(n + " no es primo.");
    }

    // 10) Descuento en computadoras
    public void ejercicio10(Scanner sc) {
        final double precio = 11000;
        System.out.print("Ingrese la cantidad de computadoras: ");
        int cantidad = sc.nextInt();

        double total = precio * cantidad;
        double descuento;

        if (cantidad < 5) descuento = total * 0.10;
        else if (cantidad < 10) descuento = total * 0.20;
        else descuento = total * 0.40;

        double totalPagar = total - descuento;

        System.out.println("Cantidad comprada: " + cantidad);
        System.out.println("Precio sin descuento: $" + total);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);
    }

    // 11) Lista de números primos hasta N
    public void ejercicio11(Scanner sc) {
        System.out.print("Ingrese un número N: ");
        int N = sc.nextInt();

        System.out.println("Números primos hasta " + N + ":");
        for (int num = 2; num <= N; num++) {
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) System.out.print(num + " ");
        }
        System.out.println();
    }

    // 12) Área de un triángulo
    public void ejercicio12(Scanner sc) {
        System.out.print("Ingrese la base del triángulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

} 


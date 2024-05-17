package Ejercicios;

import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {
        int num;
        float suma;
        num = numeroTerminos();
        System.out.println("--------Reporte--------");
        mostrarSerie(num);
        suma = dividirSumar(num);
        imprimir(suma);
        System.out.println("-----------------------");
    }

    private static int numeroTerminos() {
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese número de terminos (n): ");
        n = teclado.nextInt();
        return n;
    }

    private static void mostrarSerie(int n) { //no devuelve nada pero se ejecuta
        int numerador = 3, denominador = 5, y = 1;
        while (y <= n) {
            System.out.print(numerador + "/" + denominador + " ");
            numerador += 2;
            denominador += 3;
            y++;
        }
    }

    private static float dividirSumar(int n) {
        float numerador = 3, denominador = 5, y = 1;
        float suma = 0;
        while (y <= n) {
            float resultado = numerador / denominador;
            if (y % 2 != 0) {
                suma -= resultado;
            } else {
                suma += resultado;
            }
            numerador += 2;
            denominador += 3;
            y++;
        }
        return suma;
    }

    private static void imprimir(float suma) {
        System.out.println("\nLa suma es : " + suma);
    }

}

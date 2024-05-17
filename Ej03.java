package Ejercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ej03 {

    public static void main(String[] args) {
        int num;
        float suma;
        num = numeroTerminos();
        System.out.println("--------Reporte--------");
        mostrarSerie(num);
        suma = dividirYSumar(num);
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
        int numerador = 1, denominador = 3, y = 1;
        while (y <= n) {
            System.out.print(numerador + "/" + denominador);
            numerador += 2;
            denominador += 4;
            y++;
            if (y<=n) {
                System.out.print(" + ");
            }
        }
    }

    private static float dividirYSumar(int n) {
        float numerador = 1, denominador = 3, y = 1;
        float suma = 0;
        while (y <= n) {
            float resultado = numerador / denominador;
            suma += resultado;
            numerador += 2;
            denominador += 4;
            y++;
        }
        return suma;
    }

    private static void imprimir(float suma) {
        String formato = String.format("%.3f", suma);
        System.out.println("\nLa suma es : " + formato);
    }
}

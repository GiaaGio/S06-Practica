package Ejercicios;

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        int num, suma;
        num = numeroTerminos();
        System.out.println("--------Reporte--------");
        mostrarSerie(num);
        suma = calcularSumaSerie(num);
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
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }

    private static int calcularSumaSerie(int n) {
        int i = 1, suma = 0;
        while (i <= n) {
            suma += i;
            i++;

        }
        return suma;
    }

    private static void imprimir(float suma) {
        System.out.println("\nLa suma es : " + suma);
    }
}

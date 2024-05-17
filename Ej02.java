package Ejercicios;

import java.util.Scanner;

public class Ej02 {

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
        int i = 3, y = 1;
        while (y <= n) {
            System.out.print(i + " ");
            i += 7;
            y++;

        }
    }

    private static int calcularSumaSerie(int n) {
        int i = 3, y = 1, suma = 0;
        while (y <= n) {
            suma += i;
            i += 7;
            y++;
        }
        return suma;
    }

    private static void imprimir(float suma) {
        System.out.println("\nLa suma es : " + suma);
    }
}

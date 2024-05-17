package Ejercicios;

import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        int num, mayor;
        num = numeroTerminos();
        System.out.println("--------Reporte--------");
        mostrarSerie(num);
        mayor = calcularMayorSerie(num);
        imprimir(mayor);
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

    private static int calcularMayorSerie(int n) {
        int i = 1, mayor = 0;
        while (i <= n) {
            if (i > mayor) {
                mayor = i;
            }
            i++;
        }
        return mayor;
    }

    private static void imprimir(int mayor) {
        System.out.println("\nEl mayor es : " + mayor);
    }
}

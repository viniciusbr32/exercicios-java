package exercicios;

// 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Saiba se um numero é impar ou par---");
        System.out.println("Digite um Numero");

        if (!scanner.hasNextInt()) {
            System.out.println("Digite um Numero inteiro valido exemplo: 10");
            return;
        }

        int numero = scanner.nextInt();

        String imparOuPar = numero % 2 == 0 ? "Esse número é Par" : "Esse numero é Impar";
        System.out.println(imparOuPar);

        scanner.close();

    }
}

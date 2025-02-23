package exercicios;

// 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor, e saiba quanto ficaria com um reajuste de 5%");

        double valor = scanner.nextDouble();
        double valorReajustado = valor + valor * 0.05;

        System.out.printf("O valor %.2f com reajuste de 5%% fica: %.2f%n", valor, valorReajustado);

        scanner.close();
    }
}

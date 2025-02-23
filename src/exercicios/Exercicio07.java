package exercicios;


import java.util.Scanner;

// 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor booleano true ou false: ");
        boolean valor1;
        boolean valor2;
        while (true) {
            if (!scanner.hasNextBoolean()) {
                System.out.println("Só aceitamos valores true ou false");
                scanner.next();
                continue;
            }
            valor1 = scanner.nextBoolean();
            break;
        }

        System.out.println("Digite o segundo valor booleano true ou false: ");
        while (true) {
            if (!scanner.hasNextBoolean()) {
                System.out.println("Só aceitamos valores true ou false");
                scanner.next();
                continue;
            }
            valor2 = scanner.nextBoolean();
            break;
        }

        if (valor1 && valor2) {
            System.out.println("Ambos são verdadeiros");
            return;
        }
        if (!valor1 && !valor2) {
            System.out.println("Ambos são Falsos");
            return;

        }
        System.out.println("São diferentes");
    }
}

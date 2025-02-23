package exercicios;

import java.util.Scanner;

// 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
public class Exercicio04 {
    public static void main(String[] args) {
        int numeroInteiro = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Numero inteiro Valido");
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Numero invalido, Digite o numero corretamente exemplo: 10");
                scanner.next();
                continue;
            }
            numeroInteiro = scanner.nextInt();
            break;
        }

        System.out.println("O numero é "+ numeroInteiro + " e seu Antecessor é "+ (numeroInteiro - 1) + " e seu Sucessor é " + (numeroInteiro + 1));

    }
}

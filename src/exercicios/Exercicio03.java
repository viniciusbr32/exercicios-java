package exercicios;

// 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
//
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//
//imprimir o seu valor na tela.

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {


        int numeroA = 0;
        int numeroB = 0;
        int numeroC = 0;
        String resultado;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o primeiro numero inteiro exemplo: 10");
            if (!scanner.hasNextInt()) {
                System.out.println("Digite um numero inteiro valido");
                scanner.nextLine();
                continue;
            }
            numeroA = scanner.nextInt();
            break;
        }


        while (true) {
            System.out.println("Digite o segundo numero inteiro exemplo: 10");
            if (!scanner.hasNextInt()) {
                System.out.println("Digite um numero inteiro valido");
                scanner.nextLine();
                continue;
            }
            numeroB = scanner.nextInt();
            break;
        }


        System.out.println("Os valores digitados são Valor A: " + numeroA + " Numero B " + numeroB);

        if (numeroA == numeroB) {
            numeroC = numeroA + numeroB;
            resultado = "A soma entre Numero A com o Numero B é " + numeroC;
        } else {
            numeroC = numeroA * numeroB;
            resultado = "A Multiplicação entre Numero A com o Numero B é " + numeroC;
        }

        System.out.println(resultado);
    }
}

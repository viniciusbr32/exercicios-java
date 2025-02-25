package exercicios.Exercicio10;

// 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

import java.util.Scanner;

public class Exercicio10Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1 = LeitorDeNotas.lerNota(scanner, "Digite a primeira nota");
        double nota2 = LeitorDeNotas.lerNota(scanner, "Digite a segunda nota");
        double nota3 = LeitorDeNotas.lerNota(scanner, "Digite a terceira nota");

       double mediaNota = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media das nota é " + mediaNota);

        scanner.close();
    }
}

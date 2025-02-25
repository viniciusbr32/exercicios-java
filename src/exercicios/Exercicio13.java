package exercicios;

// 13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

public class Exercicio13 {
    public static void main(String[] args) {
        String nome = "Vinicius";
        int idade = 20;

        String maiorOuMenor = idade >= 18 ? " Maior de idade " : "Menor de idade";

        System.out.println(nome + " é " + maiorOuMenor);
    }
}

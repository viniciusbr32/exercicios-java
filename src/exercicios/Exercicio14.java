package exercicios;

// 14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

public class Exercicio14 {
    public static void main(String[] args) {
        double a = 20;
        double b = 30;

        double temporario = a;

        a = b;
        b = temporario;


        System.out.println("Valor de A " + a);
        System.out.println("Valor de B " + b);
    }
}

package exercicios;

// 20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
public class Exercicio20 {
    public static void main(String[] args) {

        int numero = 7;
        System.out.println(" Tabuada do " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (i * numero));

        }

    }
}

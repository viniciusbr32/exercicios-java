package exercicios;

// 19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class Exercicio19 {
    public static void main(String[] args) {

        double tabuada = 10;

        // 1 * 1 = 1

        for (int i = 1; i <= tabuada; i++) {

            System.out.println("Tabuada do " + i + ":");
            for (int k = 1; k <= tabuada; k++) {
                System.out.println(i + " X " + k + " = " + (i * k));
            }
            System.out.println();
        }
    }
}

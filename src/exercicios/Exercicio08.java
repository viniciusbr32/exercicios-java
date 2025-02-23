package exercicios;

// 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.


import java.util.Arrays;


public class Exercicio08 {
    public static void main(String[] args) {

        int[] valores = {1, 3, 5, 9, 7, 8, 25};

        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = i + 1; j < valores.length; j++) {

                if (valores[i] < valores[j]) {
                    int temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;

                }
            }

        }
        System.out.println(Arrays.toString(valores));
    }

}

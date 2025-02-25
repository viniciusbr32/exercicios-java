package exercicios;

//16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//
//equilátero, isósceles ou escaleno.

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro lado: ");
        int lado1 = scanner.nextInt();

        System.out.print("Digite o segundo lado: ");
        int lado2 = scanner.nextInt();

        System.out.print("Digite o terceiro lado: ");
        int lado3 = scanner.nextInt();


        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero (todos os lados iguais).");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles (dois lados iguais).");
            } else {
                System.out.println("Triângulo Escaleno (todos os lados diferentes).");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo válido.");
        }

        scanner.close();
    }
}

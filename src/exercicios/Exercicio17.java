package exercicios;

// 17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//
//Fórmula: C = (5 * ( F-32) / 9)

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();


        double celsius = (5 * (fahrenheit - 32)) / 9;


        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");
        System.out.println("Temperatura em Celsius: " + celsius + "°C");

        scanner.close();
    }
}

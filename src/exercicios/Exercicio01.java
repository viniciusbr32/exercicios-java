package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificação se a soma do Numero A e do Numero é maior que C");

        System.out.println("Digite o numero A");
        double a = scanner.nextDouble();

        System.out.println("Digite o numero B");
        double b = scanner.nextDouble();

        System.out.println("Digite o numero C");
        double c = scanner.nextDouble();

        double resultado = a + b;
        String resultadoMaiorQueC = resultado > c ? "Resultado é maior que Numero C" : "Resultado Não é maior que Numero C";


        System.out.println("------ RELATÓRIO ------");
        System.out.println("Número A: " + a + " | Número B: " + b);
        System.out.println("A soma entre eles é: " + resultado);
        System.out.println("Numero C: " + c);
        System.out.println(resultadoMaiorQueC);

        scanner.close();

    }
}

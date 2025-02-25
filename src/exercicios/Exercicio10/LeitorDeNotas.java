package exercicios.Exercicio10;

import java.util.Scanner;

public class LeitorDeNotas {

    public static double lerNota(Scanner scanner, String mensagem) {
        double nota;
        while (true) {
            System.out.println(mensagem);
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    break;
                } else {
                    System.out.println("Nota invalida, digite um valor entre 0 e 10");
                }
            } else {
                System.out.println("Digite apenas numeros");
            }
            scanner.nextLine();
        }

        return nota;
    }
}

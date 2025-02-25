package exercicios;

// 18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.

public class Exercicio18 {
    public static void main(String[] args) {

        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        int anos = 0;


        while (alturaSara < alturaFrancisco) {
            alturaFrancisco += 0.02;
            alturaSara += 0.03;
            anos++;
            System.out.printf("Ano %d: Altura de Sara: %.2f metros, Altura de Francisco = %.2f metros\n", anos, alturaSara, alturaFrancisco);

        }


        System.out.println("Sara ultrapassou Francisco após " + anos + " anos");
    }
}

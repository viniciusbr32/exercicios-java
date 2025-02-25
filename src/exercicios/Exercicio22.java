package exercicios;

// 22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
public class Exercicio22 {
    public static void main(String[] args) {

        int dividendo = 10;
        int divisor = 3;

        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;


        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);


    }
}

package exercicios.Exercicio23.teste;

// 23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações
// fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.

import exercicios.Exercicio23.dominio.Professor;

public class Exercicio23Teste {
    public static void main(String[] args) {
        Professor professor = new Professor(1000, 30);

        professor.calcularSalario();
    }
}

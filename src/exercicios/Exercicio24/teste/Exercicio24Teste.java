package exercicios.Exercicio24.teste;

// 22 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
//
//Fórmula: distância = tempo x velocidade.
//
//            litros usados = distância / 12.

import exercicios.Exercicio24.dominio.Carro;

public class Exercicio24Teste {
    public static void main(String[] args) {
        Carro carro = new Carro(5, 100);
        carro.calcularLitros();
    }
}

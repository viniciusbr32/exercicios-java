package exercicios.Exercicio11.teste;

import exercicios.Exercicio11.Servico.RelatorioNotas;
import exercicios.Exercicio11.dominio.Aluno;
import exercicios.Exercicio11.dominio.Pessoa;

public class Exercicio11Test {
    public static void main(String[] args) {
        int[] notas = {10, 5, 10, 5};
        Pessoa pessoa = new Aluno("vinicius", notas);

        RelatorioNotas.Relatorio(pessoa);
    }
}

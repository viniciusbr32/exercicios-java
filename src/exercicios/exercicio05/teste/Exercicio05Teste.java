package exercicios.exercicio05.teste;

import exercicios.exercicio05.Servico.Relatorio;
import exercicios.exercicio05.dominio.Pessoa;
import exercicios.exercicio05.dominio.Usuario;

public class Exercicio05Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Usuario("Vinicius", 15000);
        Relatorio.Relatorio(pessoa);
    }
}

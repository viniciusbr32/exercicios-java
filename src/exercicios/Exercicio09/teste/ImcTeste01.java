package exercicios.Exercicio09.teste;


import exercicios.Exercicio09.dominio.Pessoa;
import exercicios.Exercicio09.dominio.Usuario;
import exercicios.Exercicio09.servico.Relatorio;

public class ImcTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Usuario(" Vinicius ", 1.80, 90);
        Pessoa pessoa2 = new Usuario(" Lucas ", 1.75, 90);
        Relatorio.relatorioIMC(pessoa);
        System.out.println("-----------------");
        Relatorio.relatorioIMC(pessoa2);

    }
}

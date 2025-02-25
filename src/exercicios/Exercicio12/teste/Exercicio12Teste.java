package exercicios.Exercicio12.teste;

import exercicios.Exercicio12.dominio.Computador;
import exercicios.Exercicio12.dominio.Produto;
import exercicios.Exercicio12.dominio.TipoPagamento;
import exercicios.Exercicio12.servico.RelatorioProduto;


public class Exercicio12Teste {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 10000, TipoPagamento.CARTAO, 4);
        RelatorioProduto.Relatorio(produto, produto.getTipoPagamento());
    }
}

package exercicios.Exercicio12.servico;

import exercicios.Exercicio12.dominio.Produto;
import exercicios.Exercicio12.dominio.TipoPagamento;

public class RelatorioProduto {

    public static void Relatorio(Produto produto, TipoPagamento tipoPagamento) {

        double valorFinal;

        if (tipoPagamento == TipoPagamento.PIX || tipoPagamento == TipoPagamento.DINHEIRO) {
            valorFinal = tipoPagamento.calcularValor(produto.getValor());
        } else {
            valorFinal = tipoPagamento.calcularValor(produto.getValor(), produto.getQtdParcelas());
        }

        System.out.println("-- Relatório Produto --");
        System.out.print("O produto é " + produto.getNome() + ", valor do produto: " + produto.getValor() +
                ", tipo de pagamento: " + tipoPagamento);

        if (tipoPagamento == TipoPagamento.CARTAO) {
            System.out.print(", quantidade de parcelas: " + produto.getQtdParcelas());
        }

        System.out.println(", valor final: " + valorFinal);
    }
}

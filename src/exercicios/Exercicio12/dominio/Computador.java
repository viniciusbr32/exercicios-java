package exercicios.Exercicio12.dominio;

public class Computador extends Produto{

    public Computador(String nome, double valor, TipoPagamento tipoPagamento) {
        super(nome, valor, tipoPagamento);
    }

    public Computador(String nome, double valor, TipoPagamento tipoPagamento, int qtdParcelas) {
        super(nome, valor, tipoPagamento, qtdParcelas);
    }
}

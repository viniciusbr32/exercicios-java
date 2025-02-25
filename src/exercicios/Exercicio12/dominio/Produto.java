package exercicios.Exercicio12.dominio;

public class Produto {
    private String nome;
    private double valor;
    private TipoPagamento tipoPagamento;
    private int qtdParcelas;

    public Produto(String nome, double valor, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    public Produto(String nome, double valor, TipoPagamento tipoPagamento, int qtdParcelas) {
        this(nome, valor, tipoPagamento);
        this.qtdParcelas = qtdParcelas;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }
}

package exercicios.Exercicio12.dominio;

public enum TipoPagamento {
    PIX(1, "Pix") {
        @Override
        public double calcularValor(double valor) {
            return valor * 0.85;
        }
    },
    DINHEIRO(2, "Dinheiro") {
        @Override
        public double calcularValor(double valor) {
            return valor * 0.85;
        }
    },
    CARTAO(3, "Cartão") {
        @Override
        public double calcularValor(double valor, int qtdParcelas) {
            return qtdParcelas == 1 ? valor * 0.9 : qtdParcelas == 2 ? valor : valor * 1.10;

        }
    };

    private final int TipoPagamentoInt;
    private final String TipoPagamentoString;

    TipoPagamento(int tipoPagamentoInt, String tipoPagamentoString) {
        this.TipoPagamentoInt = tipoPagamentoInt;
        TipoPagamentoString = tipoPagamentoString;
    }

    public  double calcularValor(double valor) {
        return valor;
    }

    public  double calcularValor(double valor, int qtdParcelas) {
        return valor;
    }


}

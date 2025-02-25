package exercicios.Exercicio09.dominio;

public class Usuario extends Pessoa {

    public Usuario(String nome, double altura, double peso) {
        super(nome, altura, peso);
    }

    @Override
    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }
}

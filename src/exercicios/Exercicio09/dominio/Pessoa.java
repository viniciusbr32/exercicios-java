package exercicios.Exercicio09.dominio;

public abstract class Pessoa implements CalcularIMC {
    protected String nome;
    protected double altura;
    protected double peso;

    public Pessoa(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }


}

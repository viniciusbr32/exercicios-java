package exercicios.exercicio05.dominio;

public abstract class Pessoa implements CalculavelSalarioMinimo {
    private String nome;
    protected double salario;
    protected static final double SALARIO_MINIMO_BASE = 1293.20;

    public Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}

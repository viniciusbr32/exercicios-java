package exercicios.Exercicio11.dominio;

public abstract class Pessoa implements CalculavelNotas {
    private String nome;
    private int[] notas;

    public Pessoa(String nome, int[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
}

package exercicios.Exercicio11.dominio;

public class Aluno extends Pessoa {

    public Aluno(String nome, int[] notas) {
        super(nome, notas);
    }

    @Override
    public double calcularNotas() {

        double soma = 0;
        int[] notas = this.getNotas();

        for (int nota : notas) {
            soma += nota;
        }

        return (soma) / notas.length;
    }

}

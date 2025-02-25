package exercicios.Exercicio11.Servico;

import exercicios.Exercicio11.dominio.Pessoa;

public class RelatorioNotas {
    public static void Relatorio(Pessoa pessoa) {
        System.out.println("---Relatorio Media alunos ---");
        double mediaNotas = pessoa.calcularNotas();
        System.out.println("ALuno: " + pessoa.getNome() + " Media Notas: " + mediaNotas);

    }
}

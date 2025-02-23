package exercicios.exercicio05.Servico;

import exercicios.exercicio05.dominio.Pessoa;

public class Relatorio {
    public static void Relatorio(Pessoa pessoa) {
        System.out.println("--- Relatorio Quantidade Salario Usuario Recebe ---");
        double qtdSalario = (int) pessoa.calcularSalarios();
        System.out.println("Usuario: " + pessoa.getNome() + " Salario: " + pessoa.getSalario());
        System.out.println(" A quantidade de Salarios Minimos que recebe é " + qtdSalario + " Salarios minitos");

    }
}

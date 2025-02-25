package exercicios.Exercicio09.servico;

import exercicios.Exercicio09.dominio.Pessoa;

public class Relatorio {
    public static void relatorioIMC(Pessoa pessoa) {
        System.out.println("--Relatorio Calculo IMC---");
        double imc = pessoa.calcularIMC();
        String resultado = imc < 18.5 ? "Abaixo do peso" :
                imc >= 18.5 && imc < 24.9 ? "Peso normal" :
                        imc >= 25 && imc <= 29.9 ? "Levemente acima do peso" :
                                imc >= 30 && imc <= 34.9 ? "Obesidade grau I" :
                                        imc >= 35 && imc <= 39.9 ? "Obesidade grau II (severa)" :
                                                "Obesidade grau III (mórbida)";

        System.out.println("Usuario:" + pessoa.getNome() + "IMC: " + String.format("%.2f", imc) + " Resultado: " + resultado);


    }
}

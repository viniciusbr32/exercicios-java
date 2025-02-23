package exercicios.exercicio05.dominio;

// 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
public class Usuario extends Pessoa {
    public Usuario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalarios() {
        return  salario / SALARIO_MINIMO_BASE;
    }
}

package exercicios.Exercicio23.dominio;

public class Professor implements Calculavel {
    private double valorHoraAula;
    private int aulasLecionadaMes;
    private final static int PERCENTUAL_INSS = 14;


    public Professor(double valorHoraAula, int aulasLecionadaMes) {
        this.valorHoraAula = valorHoraAula;
        this.aulasLecionadaMes = aulasLecionadaMes;
    }

    @Override
    public void calcularSalario() {
        double salarioBruto = valorHoraAula * aulasLecionadaMes;
        double descontoINSS = salarioBruto * PERCENTUAL_INSS / 100;
        double salarioComDesconto = salarioBruto - descontoINSS;

        System.out.println("Salario Bruto: " + salarioBruto + " Desconto do INSS " + descontoINSS +  " Salario com desconto " + salarioComDesconto + " E o desconto em % é " + PERCENTUAL_INSS + "%");
    }
}

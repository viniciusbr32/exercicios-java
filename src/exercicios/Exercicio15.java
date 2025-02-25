package exercicios;

// 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
//
//consideração o ano com 365 dias e o mês com 30 dias.
//
//(Ex: 5 anos, 2 meses e 15 dias de vida)

//

public class Exercicio15 {
    public static void main(String[] args) {

        int diaNascimento = 9;
        int mesNascimento = 5;
        int anoNascimento = 2000;


        int diaAtual = 25;
        int mesAtual = 2;
        int anoAtual = 2025;

        int mesesVividos = mesAtual - mesNascimento;
        int anosVividos = anoAtual - anoNascimento;
        int diasVividos = diaAtual - diaNascimento;


        if (diasVividos < 0) {
            diasVividos += 30;
            mesesVividos--;

        }

        if (mesesVividos < 0) {
            mesesVividos += 12;
            anosVividos--;
        }

        int totalDiasVividos = anosVividos * 365 + mesesVividos * 30 + diasVividos;

        System.out.println(anosVividos + " anos, " + mesesVividos + " meses e " + diasVividos + " dias.");
        System.out.println("Total de dias vividos: " + totalDiasVividos);

    }
}

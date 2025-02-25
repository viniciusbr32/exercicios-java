package exercicios.Exercicio24.dominio;

public class Carro implements CalcularlLitros {
    private static final int QTD_LITROS_CARRO = 12;
    private int tempo;
    private int velocidade;

    public Carro(int tempo, int velocidade) {
        this.tempo = tempo;
        this.velocidade = velocidade;
    }

    @Override
    public void calcularLitros() {
        double distancia = tempo * velocidade;
        double litros = distancia / QTD_LITROS_CARRO;

        System.out.printf(
                "Tempo de viagem: %d horas%nVelocidade média: %d km/h%nDistância percorrida: %.2f km%nLitros utilizados: %.2f L%n",
                tempo, velocidade, distancia, litros
        );
    }
}

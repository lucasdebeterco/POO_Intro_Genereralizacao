package NaveEspacial;

public class NaveEspacial {
    private double velocidadeMaxima;

    public NaveEspacial(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Velocidade Máxima: ").append(velocidadeMaxima);
        return sb.toString();
    }
}

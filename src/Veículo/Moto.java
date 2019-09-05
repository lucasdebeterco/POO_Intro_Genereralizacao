package Veículo;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String motor, int cilindradas) {
        super(motor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Cilindradas: ").append(cilindradas);
        return sb.toString();
    }
}

package Veículo;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String motor, int eixos) {
        super(motor);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Eixos: ").append(eixos);
        return sb.toString();
    }
}

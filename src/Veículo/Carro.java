package Veículo;

public class Carro extends Veiculo{
    private int portas;

    public Carro(String motor, int portas) {
        super(motor);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Portas: ").append(portas);
        return sb.toString();
    }
}

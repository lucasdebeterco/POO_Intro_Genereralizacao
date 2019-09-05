package Ambiente;

public class Quarto extends Ambiente {
    private int capacidade;

    public Quarto(int area, int capacidade) {
        super(area);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Capacidade: ").append(capacidade);
        return sb.toString();
    }
}

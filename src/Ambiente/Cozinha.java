package Ambiente;

public class Cozinha extends Ambiente {
    private boolean microondas;

    public Cozinha(int area, boolean microondas) {
        super(area);
        this.microondas = microondas;
    }

    public boolean isMicroondas() {
        return microondas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Microondas: ").append(microondas);
        return sb.toString();
    }
}


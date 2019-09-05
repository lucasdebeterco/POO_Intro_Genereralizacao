package Ambiente;

public class Ambiente {
    private int area;

    public Ambiente(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Área: ").append(area);
        return sb.toString();
    }
}

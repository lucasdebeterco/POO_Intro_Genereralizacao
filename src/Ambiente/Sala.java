package Ambiente;

public class Sala extends Ambiente {
    private boolean tv;

    public Sala(int area, boolean tv) {
        super(area);
        this.tv = tv;
    }

    public boolean isTv() {
        return tv;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Tv: ").append(tv);
        return sb.toString();
    }
}

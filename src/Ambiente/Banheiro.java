package Ambiente;

public class Banheiro extends Ambiente{
    private boolean banheira;

    public Banheiro(int area, boolean banheira) {
        super(area);
        this.banheira = banheira;
    }

    public boolean isBanheira() {
        return banheira;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Banheira: ").append(banheira);
        return sb.toString();
    }
}

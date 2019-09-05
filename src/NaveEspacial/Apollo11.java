package NaveEspacial;

public class Apollo11 extends NaveEspacial{
    private String tipoCombustivel;

    public Apollo11(double velocidadeMaxima,String tipoCombustivel) {
        super(velocidadeMaxima);
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Tipo de Combustível: ").append(tipoCombustivel);
        return sb.toString();
    }
}

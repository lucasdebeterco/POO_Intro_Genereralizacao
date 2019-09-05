package Animal;

public class Cao extends Mamifero{
    private String raca;

    public Cao (int idade, String tipoSangue, String localVida, String tipo, String raca){
        super(idade, tipoSangue, localVida, tipo);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Raça: ").append(raca);
        return sb.toString();
    }
}

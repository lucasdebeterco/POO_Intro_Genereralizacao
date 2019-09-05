package Animal;

public class Gato extends Mamifero {
    private String cor;

    public Gato(int idade, String tipoSangue, String localVida, String tipo, String cor) {
        super(idade, tipoSangue, localVida, tipo);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Cor: ").append(cor);
        return sb.toString();
    }
}

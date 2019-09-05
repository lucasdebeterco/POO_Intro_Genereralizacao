package Animal;

public class Reptil extends Animal {
    private String localVida;
    private String tipo;

    public Reptil(int idade, String tipoSangue, String localVida, String tipo) {
        super(idade, tipoSangue);
        this.localVida = localVida;
        this.tipo = tipo;
    }

    public String getLocalVida() {
        return localVida;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Local de Vida: ").append(localVida);
        sb.append(", Tipo: ").append(tipo);
        return sb.toString();
    }
}

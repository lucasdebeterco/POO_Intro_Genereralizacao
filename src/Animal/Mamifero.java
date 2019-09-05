package Animal;

public class Mamifero extends Animal {
    private String localVida;
    private String tipo;

    public Mamifero(int idade, String tipoSangue, String localVida, String tipo) {
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
        sb.append(", Local de Vida: ").append(localVida).append('\'');
        sb.append(", Tipo: '").append(tipo).append('\'');
        return sb.toString();
    }
}
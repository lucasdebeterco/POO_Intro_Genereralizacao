package Item;

public class Midia extends Item {
    private String gravadora;
    private float duracao;

    public Midia(int codigo, String descricao, String gravadora, float duracao){
        super(codigo, descricao);
        this.gravadora = gravadora;
        this.duracao = duracao;
    }

    public String getGravadora() {
        return gravadora;
    }

    public float getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Gravadora: " + gravadora);
        sb.append(", Duracao: " + duracao);
        return sb.toString();
    }
}

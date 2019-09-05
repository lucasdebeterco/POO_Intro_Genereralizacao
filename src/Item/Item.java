package Item;

public class Item {
    private int codigo;
    private String descricao;

    public Item (int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Codigo: " + codigo);
        sb.append(", Descricao: " + descricao);
        return sb.toString();
    }
}

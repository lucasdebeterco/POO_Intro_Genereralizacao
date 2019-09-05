package Xadrez;

public class Torre extends Peca {
    public Torre(int linha, int coluna, boolean cor, int movimentos) {
        super(linha, coluna, cor, movimentos);
    }

    public boolean mover(int linha, int coluna) {
        super.setColuna(coluna);
        super.setLinha(linha);
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }
}

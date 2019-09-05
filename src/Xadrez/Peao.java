package Xadrez;

public class Peao extends Peca {
    public Peao(int linha, int coluna, boolean cor, int movimentos) {
        super(linha, coluna, cor, movimentos);
    }
    public boolean mover(int linha, int coluna){
        if (coluna == super.getColuna()){
            super.setColuna(coluna);
            super.setLinha(linha);
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }
}

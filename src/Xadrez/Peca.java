package Xadrez;

public class Peca {
    private int linha;
    private int coluna;
    private boolean cor;
    private int movimentos;

    public Peca(int linha, int coluna, boolean cor, int movimentos) {
        this.linha = linha;
        this.coluna = coluna;
        this.cor = cor;
        this.movimentos = movimentos;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public boolean isCor() {
        return cor;
    }

    public int getMovimentos() {
        return movimentos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Linha: ").append(linha);
        sb.append(", Coluna: ").append(coluna);
        sb.append(", Cor: ").append(cor);
        sb.append(", Movimentos: ").append(movimentos);
        return sb.toString();
    }
}

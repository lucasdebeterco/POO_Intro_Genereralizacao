package Sala;

public class Pessoa {
    private int codigo;
    private String nome;
    private String endereco;

    public Pessoa (int codigo, String nome, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Codigo: ").append(codigo);
        sb.append(", Nome: ").append(nome);
        sb.append(", Endereco: ").append(endereco);
        return sb.toString();
    }
}

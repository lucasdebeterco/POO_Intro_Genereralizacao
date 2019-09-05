package Pessoa;

public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco){
        this.nome= nome;
        this.endereco = endereco;
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
        sb.append("Nome: " + nome);
        sb.append(", Endereço: " + endereco);
        return sb.toString();
    }
}

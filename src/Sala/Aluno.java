package Sala;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(int codigo, String nome, String endereco, int matricula) {
        super(codigo, nome, endereco);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Matricula: ").append(matricula);
        return sb.toString();
    }
}

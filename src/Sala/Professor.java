package Sala;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(int codigo, String nome, String endereco, String disciplina) {
        super(codigo, nome, endereco);
        this.disciplina = disciplina;
    }

    public String getDisciplina() { return disciplina; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Disciplina: ").append(disciplina);
        return sb.toString();
    }
}

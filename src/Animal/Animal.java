package Animal;

public class Animal {
    private int idade;
    String tipoSangue;

    public Animal(int idade, String tipoSangue) {
        this.idade = idade;
        this.tipoSangue = tipoSangue;
    }

    public int getIdade() {
        return idade;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Idade: ").append(idade);
        sb.append(", Tipo de Sangue: ").append(tipoSangue);
        return sb.toString();
    }
}

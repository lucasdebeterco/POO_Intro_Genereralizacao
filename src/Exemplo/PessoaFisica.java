package Exemplo;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String estadoCivil;

    public PessoaFisica(String nome, String endereco, String cpf, String estadoCivil) {
        super(nome, endereco);
        setCpf(cpf);
        setEstadoCivil(estadoCivil);
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        if (cpf.length() >= 9) {
            this.cpf = cpf;
        }
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        if (estadoCivil.length() > 0) {
            this.estadoCivil = estadoCivil;
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PessoaFisica [cpf=");
        builder.append(cpf);
        builder.append(", estadoCivil=");
        builder.append(estadoCivil);
        builder.append("]");
        builder.append(super.toString());
        return builder.toString();
    }

}

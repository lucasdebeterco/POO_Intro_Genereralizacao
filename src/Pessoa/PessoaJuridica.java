package Pessoa;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String tipoEmpresa;

    public PessoaJuridica(String nome, String endereco, String cnpj, String tipoEmpresa){
        super(nome, endereco);
        this.cnpj = cnpj;
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", CNPJ: " + cnpj);
        sb.append(", Tipo Empresa" + tipoEmpresa);
        return sb.toString();
    }
}

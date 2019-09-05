package Simples;

public class ContaEspecial extends Conta{
    private int diasSemJuros;
    private double limite;

    public ContaEspecial(String banco, int agencia, int numeroConta, double saldo, int diasSemJuros, double limite){
        super(banco, agencia, numeroConta, saldo);
        this.diasSemJuros = diasSemJuros;
        this.limite = limite;
    }

    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public double getLimite() {
        return limite;
    }

    public boolean saqueComLimite(double valor){
        if (valor > (super.getSaldo() + this.limite)){
            return false;
        } else {
            super.saqueLimite(valor);
            return true;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" Dias sem juros: ").append(diasSemJuros);
        sb.append(" Limite: ").append(limite);
        return sb.toString();
    }
}

package Simples;

public class ContaSimples extends Conta{
    private double saldoPoupanca;

    public ContaSimples(String banco, int agencia, int numeroConta, double saldo, double saldoPoupanca){
        super(banco, agencia, numeroConta, saldo);
        this.saldoPoupanca = saldoPoupanca;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public double depositoPoupanca(double valor){
        this.saldoPoupanca += valor;
        return this.saldoPoupanca;
    }

    public boolean saquePoupanca(double valor){
        if (valor > this.saldoPoupanca){
            return false;
        } else {
            this.saldoPoupanca -= valor;
            return true;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Saldo poupança: ").append(saldoPoupanca);
        return sb.toString();
    }
}

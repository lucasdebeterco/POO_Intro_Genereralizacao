package Simples;

public class Conta {
    private String banco;
    private int agencia;
    private int numeroConta;
    private double saldo;

    public Conta(String banco, int agencia, int numeroConta, double saldo){
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saqueLimite(double valor) {
        saldo -= valor;
    }

    public double depositar(double valor){
        this.saldo += valor;
        return this.saldo;
    }

    public boolean saque(double valor){
        if (valor > this.saldo){
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Banco: ").append(banco);
        sb.append(", Agência: ").append(agencia);
        sb.append(", Número da Conta: ").append(numeroConta);
        sb.append(", Saldo: ").append(saldo);
        return sb.toString();
    }
}

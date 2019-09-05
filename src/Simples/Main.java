package Simples;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta("XX",222,222,1000);
        System.out.println(conta.depositar(100));
        System.out.println(conta.saque(1100));
        System.out.println(conta);

        System.out.println();

        ContaSimples contaSimples = new ContaSimples("XXX",333,333,1000, 3000);
        System.out.println(contaSimples.depositoPoupanca(100));
        System.out.println(contaSimples.saquePoupanca(1500));
        System.out.println(contaSimples);

        System.out.println();

        ContaEspecial contaEspecial = new ContaEspecial("XXXX",444,444,100, 30, 100);
        System.out.println(contaEspecial.saqueComLimite(201));
        System.out.println(contaEspecial);



    }
}

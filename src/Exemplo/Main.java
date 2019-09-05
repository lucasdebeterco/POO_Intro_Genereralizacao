package Exemplo;

public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Lucas", "Rio do Sul");
        System.out.println(p);

        PessoaFisica pf = new PessoaFisica("Lucas F", "Rio do Sul F", "09101164902", "Casado" );
        System.out.println(pf);

    }

}

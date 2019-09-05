package Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Lucas", "Taboão");
        System.out.println(p);

        PessoaFisica pf = new PessoaFisica("LucasF", "TaboãoF", "09101164902", "Solteiro");
        System.out.println(pf);

        PessoaJuridica pj = new PessoaJuridica("LucasJ", "TaboãoJ", "123845739", "Simples");
        System.out.println(pj);
    }
}

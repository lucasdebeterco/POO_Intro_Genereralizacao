package Item;

public class Main {
    public static void main(String[] args) {

        Item i = new Item(1, "Descrição item");
        System.out.println(i);

        Livro livro = new Livro(2,"A Ética da Liberdade", "Murray Rothbard");
        System.out.println(livro);

        Midia midia = new Midia(3,"Mídia", "Gravadora", 3);
        System.out.println(midia);

        Cd cd = new Cd(4,"CD","Gravadora CD", 40,8,"Fulano","Album");
        System.out.println(cd);

        Vhs vhs = new Vhs(5,"Vhs","Gravadora VHS ", 20,"VHS 1");
        System.out.println(vhs);
    }
}

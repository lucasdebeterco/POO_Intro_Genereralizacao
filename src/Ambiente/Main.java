package Ambiente;

public class Main {
    public static void main(String[] args) {

        Quarto q = new Quarto(10,3);
        System.out.println(q);

        Sala s = new Sala(15,true);
        System.out.println(s);

        Banheiro b = new Banheiro(4, true);
        System.out.println(b);

        Cozinha coz = new Cozinha(10, true);
        System.out.println(coz);




    }
}

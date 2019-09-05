package Xadrez;

public class Main {
    public static void main(String[] args) {

        Peao p = new Peao(3,3,false, 3);
        p.mover(9,4);
        System.out.println(p);

        Torre t = new Torre(3,3,false, 3);
        t.mover(100,20);
        System.out.println(t);

    }
}

package Animal;

public class Main {
    public static void main(String[] args) {

        Cao cao = new Cao(5,"Quente", "Terra", "Placentário","Vira-lata");
        System.out.println(cao);
        Gato gato = new Gato(12,"Quente", "Terra", "Placentário","Angorá");
        System.out.println(gato);

        Tartaruga tar = new Tartaruga(30, "Frio", "Água e terra","Ovíparo", "Verde");
        System.out.println(tar);
        Lagarto lag = new Lagarto(2, "Frio", "Terra","Ovíparo", "Cinza");
        System.out.println(lag);

    }
}

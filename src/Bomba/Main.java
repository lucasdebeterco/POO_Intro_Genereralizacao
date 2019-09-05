package Bomba;

public class Main {
    public static void main(String[] args) {
        Bomba b = new Bomba (1000,2);
        b.abastecerPorLitro(50);
        b.abastecerPorValor(50);
        System.out.println(b);
    }
}

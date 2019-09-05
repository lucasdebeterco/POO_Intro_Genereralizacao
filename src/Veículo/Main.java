package Veículo;

public class Main {
    public static void main(String[] args) {

        Veiculo v = new Veiculo("Motor Veiculo");
        System.out.println(v);

        Carro c = new Carro("Motor carro", 4);
        System.out.println(c);

        Moto m = new Moto("Motor moto", 1000);
        System.out.println(m);

        Caminhao caminhao = new Caminhao("Motor caminão", 6);
        System.out.println(caminhao);

    }

}


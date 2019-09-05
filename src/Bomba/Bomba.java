package Bomba;

public class Bomba {
    private double totalLitros;
    private float valorLitro;

    public Bomba(double totalLitros, float valorLitro) {
        this.totalLitros = totalLitros;
        this.valorLitro = valorLitro;
    }

    public double abastecerPorLitro( int litros){
        float total  = litros*valorLitro;
        this.totalLitros -= total;
        return this.totalLitros;
    }

    public double abastecerPorValor(double valor){
        double total = valor/valorLitro;
        this.totalLitros -= total;
        return this.totalLitros;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Total litros na bomba: ").append(totalLitros);
        sb.append(", Valor do litro: ").append(valorLitro);
        return sb.toString();
    }
}

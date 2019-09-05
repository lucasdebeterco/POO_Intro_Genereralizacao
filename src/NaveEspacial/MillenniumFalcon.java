package NaveEspacial;

public class MillenniumFalcon extends Apollo11{
    private float classeHiperpropulsor;

    public MillenniumFalcon(double velocidadeMaxima,String tipoCombustivel, float classeHiperpropulsor) {
        super(velocidadeMaxima, tipoCombustivel);
        this.classeHiperpropulsor = classeHiperpropulsor;
    }

    public float getClasseHiperpropulsor() {
        return classeHiperpropulsor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Classe do Hiperpropulsor: ").append(classeHiperpropulsor);
        return sb.toString();
    }
}

package Veículo;

public class Veiculo {
    private String motor;

    public Veiculo(String motor){
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Motor: ").append(motor);
        return sb.toString();
    }
}

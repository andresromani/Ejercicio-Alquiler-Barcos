package entidades;

public class Deportivo extends Barco {
    private int potencia;
    
    public Deportivo(int matricula, int eslora, int anioFabricacion, int potencia) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public double calcularCosto() {
        return (this.getEslora() * 10 + potencia) * 2;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "\nPotencia: " + potencia;
    }
}
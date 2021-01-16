package entidades;

public class Yate extends Barco {
    private int camarotes;
    private int potencia;

    public Yate(int matricula, int eslora, int anioFabricacion, int camarotes, int potencia) {
        super(matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
        this.potencia = potencia;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public double calcularCosto() {
        return ((this.getEslora() * 10) + camarotes + potencia) * 2;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "\nCamarotes: " + camarotes +
                "\nPotencia: " + potencia;
    }
}
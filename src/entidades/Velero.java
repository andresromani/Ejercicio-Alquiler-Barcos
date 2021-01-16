package entidades;

public class Velero extends Barco {
    private int mastiles;

    public Velero(int matricula, int eslora, int anioFabricacion, int mastiles) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public double calcularCosto() {
        return (this.getEslora() * 10 + mastiles) * 2;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "\nMastiles: " + mastiles;
    }
}
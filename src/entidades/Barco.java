package entidades;

public abstract class Barco {
    private int matricula;
    private int eslora;
    private int anioFabricacion;
    
    public Barco(int matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    public abstract double calcularCosto();
    
    @Override
    public String toString() {
        return "\nMatricula: " + matricula +
                "\nEslora: " + eslora +
                "\nAño de fabricación: " + anioFabricacion;
    }
}
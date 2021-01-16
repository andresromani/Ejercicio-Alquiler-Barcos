package entidades;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;

public class Alquiler {
    private String nombre;
    private int dni;
    private LocalDate inicioAlquiler;
    private LocalDate finAlquiler;
    private Barco barco;
    private int posicionAmarre;
    private double costo;

    public Alquiler() {
    }
    
    public Alquiler(String nombre, int dni, String inicioAlquiler, String finAlquiler, Barco barco, int posicionAmarre) {
        this.nombre = nombre;
        this.dni = dni;
        this.inicioAlquiler = LocalDate.parse(inicioAlquiler, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.finAlquiler = LocalDate.parse(finAlquiler, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.barco = barco;
        this.posicionAmarre = posicionAmarre;
        this.calcularAlquiler();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getInicioAlquiler() {
        return inicioAlquiler;
    }

    public void setInicioAlquiler(LocalDate inicioAlquiler) {
        this.inicioAlquiler = inicioAlquiler;
    }

    public LocalDate getFinAlquiler() {
        return finAlquiler;
    }

    public void setFinAlquiler(LocalDate finAlquiler) {
        this.finAlquiler = finAlquiler;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }
    
    public double getCosto() {
        return costo;
    }
    
    public double calcularAlquiler() {
        long diffDias = DAYS.between(inicioAlquiler, finAlquiler);
        costo = diffDias * barco.calcularCosto();
        return costo;
    }
            
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Cliente: " + nombre +
                "\nDNI: " + dni +
                "\nInicio alquiler: " + inicioAlquiler +
                "\nFin alquiler: " + finAlquiler +
                "\nBarco: " + barco +
                "\nPosición amarre: " + posicionAmarre +
                "\nCosto: $" + df.format(costo) + "\n";
    }
}
package entidades;

import comparators.ComparatorCostoAlquiler;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Puerto {
    private List<Alquiler> alquileres;
    
    public Puerto() {
    }
    
    public Puerto(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }
    
    public List<Alquiler> getAlquileres() {
        return alquileres;
    }
    
    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }
    
    public boolean agregarAlquiler(Alquiler alquiler) {
        return alquileres.add(alquiler);
    }
    
    public Alquiler calcularMayorAlquiler() {
        Collections.sort(alquileres, new ComparatorCostoAlquiler());
        
        return alquileres.get(alquileres.size() - 1);
    }
    
    public Alquiler calcularMenorAlquiler() {
        Collections.sort(alquileres, new ComparatorCostoAlquiler());
        
        return alquileres.get(0);
    }
    
    public double calcularPromedioMensual() {
        int mesActual = LocalDate.now().getMonthValue();
        int contadorAlquileres = 0;
        double sumaAlquileres = 0;
        
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getInicioAlquiler().getMonthValue() == mesActual) {
                contadorAlquileres++;
                sumaAlquileres += alquiler.getCosto();
            }
        }
        
        return sumaAlquileres / contadorAlquileres;
    }
    
    public double calcularPromedioAnual() {
        int anioActual = LocalDate.now().getYear();
        int contadorAlquileres = 0;
        double sumaAlquileres = 0;
        
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getInicioAlquiler().getYear() == anioActual) {
                contadorAlquileres++;
                sumaAlquileres += alquiler.getCosto();
            }
        }
        
        return sumaAlquileres / contadorAlquileres;
    }
    
    @Override
    public String toString() {
        String resultado = "";
        
        for (Alquiler alquiler : alquileres) {
            if (alquiler != null) {
                resultado += alquiler + "\n";
            }
        }
        
        return resultado;
    }
}
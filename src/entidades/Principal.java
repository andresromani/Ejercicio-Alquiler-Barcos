package entidades;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public static void main(String [] args) {
        // Alquileres
        Barco b1 = new Velero(123, 30, 2010, 2);
        Barco b2 = new Yate(456, 100, 2010, 20, 50);
        Barco b3 = new Deportivo(789, 15, 2007, 40);
        Barco b4 = new Yate(987, 100, 2019, 15, 50);
        Barco b5 = new Velero(147, 25, 2000, 1);
        Alquiler a1 = new Alquiler("Carlos", 123456, "10-12-2020", "20-12-2020", b1, 2);
        Alquiler a2 = new Alquiler("Ana", 456123, "01-01-2021", "10-01-2021", b2, 3);
        Alquiler a3 = new Alquiler("Raul", 987654, "01-01-2021", "15-01-2021", b3, 1);
        Alquiler a4 = new Alquiler("Maria", 123321, "07-01-2021", "14-01-2021", b4, 3);
        Alquiler a5 = new Alquiler("Pablo", 148863, "05-01-2021", "13-01-2021", b5, 2);
        List<Alquiler> alquileres = new ArrayList();
        
        // Puerto
        Puerto puerto = new Puerto(alquileres);
        puerto.agregarAlquiler(a1);
        puerto.agregarAlquiler(a2);
        puerto.agregarAlquiler(a3);
        puerto.agregarAlquiler(a4);
        puerto.agregarAlquiler(a5);
        
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("El mayor alquiler es: $" + df.format(puerto.calcularMayorAlquiler().getCosto()));
        System.out.println("El menor alquiler es: $" + df.format(puerto.calcularMenorAlquiler().getCosto()));
        System.out.println("El promedio mensual es: $" + df.format(puerto.calcularPromedioMensual()));
        System.out.println("El promedio anual es: $" + df.format(puerto.calcularPromedioAnual()));
        List<Integer> list = new ArrayList<>();
        // Mostrar todos los alquileres
//        System.out.println("");
//        System.out.println(puerto);
    }
    
}

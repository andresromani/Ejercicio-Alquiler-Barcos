package comparators;

import entidades.Alquiler;
import java.util.Comparator;

public class ComparatorCostoAlquiler implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Alquiler a1 = (Alquiler) o1;
        Alquiler a2 = (Alquiler) o2;
        Double costo1 = a1.getCosto();
        Double costo2 = a2.getCosto();
        return costo1.compareTo(costo2);
    }
    
}

package Lambda;

import java.util.*;
import java.util.function.Function;

public class Ejercicio11 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(
                "hola", "mundo", "java", "programacion", "lambda", "expresiones"
        ));

        // Ordenado ascendente, la primera letra en minúscula y el resto en mayúscula
        ejecutarTransformacionYOrdenacion(lista,
                s -> s.substring(0, 1).toLowerCase() + s.substring(1).toUpperCase(),
                (s1, s2) -> s1.compareTo(s2));

        // Ordenado descendente, la primera y última letra en mayúscula
        ejecutarTransformacionYOrdenacion(lista,
                s -> s.substring(0, 1).toUpperCase() + s.substring(1, s.length() - 1) + s.substring(s.length() - 1).toUpperCase(),
                (s1, s2) -> s2.compareTo(s1));

        // Voltea el String y ordenado ascendente
        ejecutarTransformacionYOrdenacion(lista,
                s -> new StringBuilder(s).reverse().toString(),
                (s1, s2) -> s1.compareTo(s2));
    }

    public static void ejecutarTransformacionYOrdenacion(ArrayList<String> lista, Function<String, String> transformacion, Comparator<String> comparator) {
        // Ordenar la lista con el Comparator y luego aplicar la transformación con la función lambda
        lista.sort(comparator);

        // Recorrer la lista, aplicar la transformación y mostrar los resultados
        lista.forEach(s -> System.out.println(transformacion.apply(s)));
    }
}

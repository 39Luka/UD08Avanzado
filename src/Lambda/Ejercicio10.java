package Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio10 {

        public static void main(String[] args) {
            List<String> ciudades = Arrays.asList(
                    "elche",
                    "alicante",
                    "elda",
                    "petrer",
                    "aspe",
                    "crevillente",
                    "alcoy",
                    "ibi",
                    "benidorm",
                    "matola"
            );

            // Ordenar las ciudades alfabéticamente usando un Comparator
            Collections.sort(ciudades, (ciudad1, ciudad2) -> ciudad1.compareTo(ciudad2));

            // Usar forEach para recorrer la lista e imprimir las ciudades con la primera letra en mayúsculas
            ciudades.forEach(ciudad -> {
                // Convertir la primera letra a mayúsculas
                String ciudadFormateada = ciudad.substring(0, 1).toUpperCase() + ciudad.substring(1);
                System.out.println(ciudadFormateada);
            });
        }


}

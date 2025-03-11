package Generico;

public class Main {
    public static void main(String[] args) {
        // Crear un conjunto de cadenas (Conjunto<String>)
        Conjunto<String> conjuntoDeCadenas = new Conjunto<>();

        // Insertar elementos en el conjunto de cadenas
        System.out.println("Insertar 'Hola': " + conjuntoDeCadenas.insert("Hola"));
        System.out.println("Insertar 'Mundo': " + conjuntoDeCadenas.insert("Mundo"));
        System.out.println("Insertar 'Java': " + conjuntoDeCadenas.insert("Java"));

        // Buscar elementos en el conjunto de cadenas
        System.out.println("Buscar 'Mundo': " + conjuntoDeCadenas.find("Mundo")); // Debe devolver la posición
        System.out.println("Buscar 'Python': " + conjuntoDeCadenas.find("Python")); // Debe devolver -1 (no encontrado)

        // Eliminar un elemento del conjunto de cadenas
        System.out.println("Eliminar 'Mundo': " + conjuntoDeCadenas.delete("Mundo"));
        System.out.println("Buscar 'Mundo' después de eliminar: " + conjuntoDeCadenas.find("Mundo")); // Debe devolver -1

        // Mostrar el contenido del conjunto de cadenas después de eliminar un elemento
        System.out.println("Contenido del conjunto de cadenas después de eliminar 'Mundo': ");
        for (int i = 0; i < 10; i++) {
            String elemento = conjuntoDeCadenas.get(i);
            if (elemento != null) {
                System.out.println("Elemento en posición " + i + ": " + elemento);
            } else {
                System.out.println("Elemento en posición " + i + ": null");
            }
        }

        // Crear un conjunto de enteros (Conjunto<Integer>)
        Conjunto<Integer> conjuntoDeEnteros = new Conjunto<>();

        // Insertar elementos en el conjunto de enteros
        System.out.println("Insertar 10: " + conjuntoDeEnteros.insert(10));
        System.out.println("Insertar 20: " + conjuntoDeEnteros.insert(20));
        System.out.println("Insertar 30: " + conjuntoDeEnteros.insert(30));

        // Buscar elementos en el conjunto de enteros
        System.out.println("Buscar 20: " + conjuntoDeEnteros.find(20)); // Debe devolver la posición
        System.out.println("Buscar 40: " + conjuntoDeEnteros.find(40)); // Debe devolver -1 (no encontrado)

        // Eliminar un elemento del conjunto de enteros
        System.out.println("Eliminar 20: " + conjuntoDeEnteros.delete(20));
        System.out.println("Buscar 20 después de eliminar: " + conjuntoDeEnteros.find(20)); // Debe devolver -1

        // Mostrar el contenido del conjunto de enteros después de eliminar un elemento
        System.out.println("Contenido del conjunto de enteros después de eliminar '20': ");
        for (int i = 0; i < 10; i++) {
            Integer elemento = conjuntoDeEnteros.get(i);
            if (elemento != null) {
                System.out.println("Elemento en posición " + i + ": " + elemento);
            } else {
                System.out.println("Elemento en posición " + i + ": null");
            }
        }
    }
}

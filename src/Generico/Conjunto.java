package Generico;

/**
 * Representa un conjunto genérico de elementos.
 * El conjunto no permite elementos duplicados y proporciona operaciones básicas como insertar, eliminar y gestionar los huecos generados por la eliminación de elementos.
 *
 * @param <T> el tipo de elementos que almacena el conjunto
 */
public class Conjunto<T> {
    // Define el tamaño máximo del conjunto
    private static final int TAM = 10;
    // Inicializa un arreglo de tamaño TAM para almacenar los elementos del conjunto
    private T[] array = (T[]) new Object[TAM];
    // Mantiene el conteo de los elementos actuales en el conjunto
    private int size = 0;

    /**
     * Inserta un elemento en el conjunto.
     * Si el conjunto no está lleno y el elemento no está ya presente, el elemento será añadido.
     *
     * @param element el elemento a insertar
     * @return true si el elemento fue insertado con éxito, false si no
     */
    boolean insert(T element) {
        int pos = 0;
        boolean found = false;

        // Itera sobre el arreglo para encontrar un espacio vacío
        while (!found && (pos < TAM)) {
            if (array[pos] == null) found = true;
            else pos++;
        }

        // Si encontró un espacio vacío, inserta el elemento
        if (found) {
            array[pos] = element;
            size++;
        }
        return found;
    }

    /**
     * Elimina un elemento del conjunto.
     * Si el elemento está presente, se elimina y se reorganizan los elementos restantes.
     *
     * @param element el elemento a eliminar
     * @return true si el elemento fue encontrado y eliminado, false si no se encontró
     */
    boolean delete(T element) {
        int pos = 0;
        boolean found = false;

        // Itera sobre el arreglo para encontrar el elemento
        while (!found && (pos < TAM)) {
            if (array[pos].equals(element)) {
                array[pos] = null;
                found = true;
                size--;
            }
            pos++;
        }
        gestionarHuecos();  // Llama a gestionarHuecos para reorganizar el conjunto
        return found;
    }

    /**
     * Gestiona los huecos en el conjunto moviendo los elementos hacia la izquierda.
     * Esto se hace después de eliminar un elemento.
     */
    void gestionarHuecos() {
        int blank = buscarHuecos();  // Busca el primer hueco
        while (blank != -1 && blank < size) {  // Mientras haya huecos y no se haya alcanzado el final del conjunto
            moverHuecos(blank);  // Mueve los elementos hacia la izquierda
            blank = buscarHuecos();  // Busca el siguiente hueco
        }
    }

    /**
     * Busca el primer hueco (espacio vacío) en el conjunto.
     *
     * @return la posición del primer hueco, o -1 si no hay huecos
     */
    int buscarHuecos() {
        int pos = 0;
        boolean found = false;

        // Itera sobre el arreglo para encontrar el primer hueco
        while (!found && (pos < TAM)) {
            if (array[pos] == null) found = true;
            pos++;
        }
        if (!found) pos = -1;  // Si no encontró huecos, devuelve -1

        return pos;  // Devuelve la posición del primer hueco
    }

    /**
     * Mueve los elementos del conjunto hacia la izquierda para eliminar los huecos.
     *
     * @param blank la posición del hueco a mover
     */
    void moverHuecos(int blank) {
        if (blank < size - 1) {
            array[blank] = array[blank + 1];  // Mueve el siguiente elemento al hueco
            array[blank + 1] = null;           // Borra el elemento que se movió
        }
    }
}

package Generico;

/**
 * Representa un conjunto genérico de elementos.
 * El conjunto no permite elementos duplicados y proporciona operaciones básicas como insertar, eliminar y gestionar los huecos generados por la eliminación de elementos.
 *
 * @param <T> el tipo de elementos que almacena el conjunto
 */
public class Conjunto<T> {
    private static final int TAM = 10;  // Tamaño máximo del conjunto
    private T[] array = (T[]) new Object[TAM];  // Arreglo que almacena los elementos del conjunto

    // Mantiene el conteo de los elementos actuales en el conjunto
    private int size = 0;  // Número de elementos en el conjunto

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
            if (array[pos] == null) found = true;  // Encuentra espacio vacío
            else pos++;  // Avanza a la siguiente posición
        }

        // Si encontró un espacio vacío, inserta el elemento
        if (found) {
            array[pos] = element;
            size++;  // Aumenta el tamaño del conjunto
        }
        return found;  // Devuelve true si el elemento se insertó correctamente
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
            if (array[pos].equals(element)) {  // Si encuentra el elemento
                array[pos] = null;  // Elimina el elemento
                found = true;  // Marca que el elemento fue encontrado
                size--;  // Disminuye el tamaño del conjunto
            }
            pos++;  // Avanza a la siguiente posición
        }
        gestionarHuecos();  // Llama a gestionarHuecos para reorganizar el conjunto después de eliminar el elemento
        return found;  // Devuelve true si el elemento fue eliminado
    }

    /**
     * Gestiona los huecos en el conjunto moviendo los elementos hacia la izquierda.
     * Esto se hace después de eliminar un elemento.
     */
    void gestionarHuecos() {
        for (int i = 0; i < TAM - 1; i++) {
            if (array[i] == null) {  // Si encontramos un hueco
                // Mover todos los elementos hacia la izquierda
                for (int j = i + 1; j < TAM; j++) {
                    if (array[j] != null) {
                        array[i] = array[j];
                        array[j] = null;
                        i = j - 1;  // Actualizar el índice para seguir moviendo después del elemento movido
                    }
                }
            }
        }
    }

    /**
     * Busca el primer hueco (espacio vacío) en el conjunto.
     *
     * @return la posición del primer hueco, o -1 si no hay huecos
     */

    /**
     * Obtiene el elemento en la posición especificada.
     *
     * @param pos la posición del elemento en el conjunto
     * @return el elemento en la posición especificada
     */
    T get(int pos) {
        return array[pos];  // Devuelve el elemento en la posición indicada
    }

    /**
     * Busca un elemento en el conjunto y devuelve su posición.
     *
     * @param element el elemento a buscar
     * @return la posición del elemento, o -1 si no se encuentra
     */
    int find(T element) {
        int r = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(element)) {  // Asegúrate de que el elemento no sea null antes de comparar
                r = i;  // Si encuentra el elemento, guarda la posición
            }
        }
        return r;  // Devuelve la posición del elemento o -1 si no se encontró
    }
}

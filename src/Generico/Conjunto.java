package Generico; // Define el paquete en el que se encuentra la clase

/**
 * Representa un conjunto genérico de elementos.
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
        int pos = 0;  // Inicializa la posición en 0
        boolean found = false;  // Indica si se encontró un espacio vacío

        // Itera sobre el arreglo para encontrar un espacio vacío
        while (!found && (pos < TAM)) {
            if (array[pos] == null) found = true;  // Si encuentra un espacio vacío, marca como encontrado
            else pos++;  // Si no, avanza a la siguiente posición
        }

        // Si encontró un espacio vacío, inserta el elemento
        if (found) {
            array[pos] = element;  // Inserta el elemento en el espacio vacío
            size++;  // Aumenta el tamaño del conjunto
        }
        return found;  // Devuelve si se pudo insertar o no el elemento
    }

    /**
     * Elimina un elemento del conjunto.
     * Si el elemento está presente, se elimina y se reorganizan los elementos restantes.
     *
     * @param element el elemento a eliminar
     * @return true si el elemento fue encontrado y eliminado, false si no se encontró
     */
    boolean delete(T element) {
        int pos = 0;  // Inicializa la posición en 0
        boolean found = false;  // Indica si se encontró el elemento

        // Itera sobre el arreglo para encontrar el elemento
        while (!found && (pos < TAM)) {
            if (array[pos].equals(element)) {  // Si encuentra el elemento, lo elimina
                array[pos] = null;  // Elimina el elemento (lo marca como null)
                found = true;  // Marca como encontrado
                size--;  // Disminuye el tamaño del conjunto
            }
            pos++;  // Avanza a la siguiente posición
        }
        gestionarHuecos();  // Llama a gestionarHuecos para reorganizar el conjunto
        return found;  // Devuelve si se pudo eliminar o no el elemento
    }

    /**
     * Gestiona los huecos en el conjunto moviendo los elementos hacia la izquierda.
     * Esto se hace después de eliminar un elemento.
     */
    void gestionarHuecos() {
        // Solo mueve elementos si hay huecos
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
        int pos = 0;  // Inicializa la posición en 0
        boolean found = false;  // Indica si se encontró un hueco

        // Itera sobre el arreglo para encontrar el primer hueco
        while (!found && (pos < TAM)) {
            if (array[pos] == null) found = true;  // Si encuentra un hueco, marca como encontrado
            pos++;  // Avanza a la siguiente posición
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
        // Solo mueve los elementos si no estamos al final del arreglo
        if (blank < size - 1) {
            array[blank] = array[blank + 1];  // Mueve el siguiente elemento al hueco
            array[blank + 1] = null;  // Borra el elemento que se movió
        }
    }
}

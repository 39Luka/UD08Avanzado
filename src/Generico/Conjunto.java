package Generico;

public class Conjunto<T> {
    private static final  int TAM = 10;
    private T[] array = (T[]) new Object[TAM];



    boolean insert(T element){
        int pos = 0;
        boolean found = false;

        while (!found && (pos < TAM)){
            if(array[pos] == null) found = true;
            else pos++;
        }

        if(found) array[pos] = element;
        return found;


    }

    boolean delete(T element) {
        int pos = 0;
        boolean found = false;

        while (!found && (pos < TAM)){
            if (array[pos].equals(element)){
                array[pos] = null;
                found = true;
            }
            pos++;
        }
        moverHuecos();
        return found;
    }


    int buscarHuecos(){
        int pos = 0;
        boolean found = false;

        while (!found && (pos < TAM)){
            if (array[pos] == null) found = true;
            pos++;
        }
        if(!found) pos = -1;

        return pos;
    }

    void moverHuecos(){
        int blank = buscarHuecos();

        while (blank != -1){
            array[blank] = array[blank + 1];
            array[blank + 1] = null;
            blank = buscarHuecos();
        }
    }
}

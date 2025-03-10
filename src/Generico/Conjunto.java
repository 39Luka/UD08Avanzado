package Generico;

import java.util.Arrays;
import java.util.Iterator;

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

        }
    }
}

package Lambda;

import java.util.function.Function;

public class Ejercicio7 {

    static Function<String, String> caracteresPares = texto -> {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            if (i % 2 == 0) {
                sb.append(texto.charAt(i));
            }
        }
        return sb.toString();
    };


}

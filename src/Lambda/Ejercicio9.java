package Lambda;

import java.util.function.Function;

public class Ejercicio9 {

    public static String paresEjecuta(Function<String, String> funcion) {
        return funcion.apply("1234567890");
    }

    public static void main(String[] args) {
        String resultado = paresEjecuta(Ejercicio7.caracteresPares);

        System.out.println(resultado);
    }

}

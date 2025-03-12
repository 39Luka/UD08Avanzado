package Lambda;

import java.util.function.Predicate;

public class Ejercicio5 {

    public static void main(String[] args) {
        // OperacionUnitariaEntera
        OperacionUnitariaEntera operacionUnitaria = x -> x + x;

        // OperaciónBinariaDecimal
        OperaciónBinariaDecimal operacionBinariaDecimal = valor -> valor * valor;

        // Predicate
        Predicate<Integer> predicado = x -> x * 5 > 100;

        // OperacionBinariaEntera
        OperacionBinariaEntera operacionBinaria = (x, y) -> x * y;

        // Saludable
        Saludable saludo = () -> System.out.println("hola mundo");
    }

    // Interfaces personalizadas
    interface OperacionUnitariaEntera {
        int operar(int x);
    }

    interface OperaciónBinariaDecimal {
        double operar(double valor);
    }

    interface OperacionBinariaEntera {
        int operar(int x, int y);
    }

    interface Saludable {
        void saludar();
    }
}


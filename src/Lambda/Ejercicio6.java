package Lambda;

public class Ejercicio6 {

    @FunctionalInterface
    public interface Predicate {
        boolean test(Integer valor);
    }
    @FunctionalInterface
    public interface UnaryOperator {
        Integer apply(Integer valor);
    }

    @FunctionalInterface
    public interface Consumer {
        void accept(Integer valor);
    }

    @FunctionalInterface
    public interface BinaryOperator {
        Integer apply(Integer valor1, Integer valor2);
    }

    @FunctionalInterface
    public interface predicate {
        boolean test(Integer valor);
    }

}

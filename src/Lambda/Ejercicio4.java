package Lambda;

public class Ejercicio4 {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            String texto = "Vamos a crear un array";
            String[] partes = texto.split(" ");
            for (String parte: partes) {
                System.out.println(parte);
            }
        };

        Thread hilo = new Thread(runnable);
        hilo.start();
    }

}

public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.println(exponente(2,4));
    }
    public static int exponente(int n, int e){
        int r = 1;
        for (int i = 0; i<e; i++) r *= n;
        return r;
    }


}

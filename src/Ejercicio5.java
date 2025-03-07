public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println(exponente(2,4));
    }
    public static int exponente(int n, int e){
        if (e==0){
            return 1;
        }
        return n*exponente(n,e-1);
    }



}

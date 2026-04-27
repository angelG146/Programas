public class Factorial {
    public static void main(String[] args) throws Exception {
        int numero = 5;
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);

    }
}

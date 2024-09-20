package desafio.fibonacci;


public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("5 " + verificarFibonacci(5));
        System.out.println("21 " + verificarFibonacci(21));
        System.out.println("133 " + verificarFibonacci(9999));
        System.out.println("610 " + verificarFibonacci(610));
        System.out.println("6765 " + verificarFibonacci(6765));
        System.out.println("9999 " + verificarFibonacci(9999));


    }

    public static int calcularFibonacci(int numero) {
        if (numero <= 1) return numero;
        return calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
    }

    public static String verificarFibonacci (int numero) {
        int i = 0;
        int fibonacciAtual = calcularFibonacci(i);
        while (fibonacciAtual <= numero) {
            if (numero == calcularFibonacci(i)){
                return "Pertence ao conjunto de Fibonacci!";
            }
            fibonacciAtual = calcularFibonacci(++i);
        }
        return "Nao pertence ao conjunto de Fibonacci!";
    }
}

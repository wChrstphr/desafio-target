package desafio.trechocodigo;


public class TrechoDeCodigo {
    public static void main(String[] args) {
        int indice = 12, soma = 0, k = 1;

        do {
            k++;
            soma += k;
            System.out.println(soma);
        } while (k < indice);
    }
}

package desafio.string;


import java.util.Scanner;

public class VerificaLetraA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra;

//        Entrada pelo usuário

        System.out.println("Verifica ocorrencia de 'a'\nDigite uma palavra ou frase");
        palavra = scan.nextLine();
        System.out.println(verificarOcorrenciaA(palavra));

        System.out.println(verificarOcorrenciaA("Paralelograma"));
        System.out.println(verificarOcorrenciaA("Água, café, código e uma maçã"));
    }

    public static String verificarOcorrenciaA(String texto) {
        int ocorrencias = 0;
        texto = texto.trim();
        char[] palavraCharArray = texto.toCharArray();
        for (char letra : palavraCharArray) {
            if (letra == 'a' ||
                letra == 'à' ||
                letra == 'á' ||
                letra == 'â' ||
                letra == 'ã' ) ocorrencias++;
        }
        return "Numero de ocorrencias da letra 'a' em \"" + texto +"\": " + ocorrencias;
    }
}

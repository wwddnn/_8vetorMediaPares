import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos o vetor vai ter ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.println("Digite um número ");
            vetor[i] = sc.nextInt();
        }
        //pares e quantidade e media
        int somaPares = 0;
        int quantidadePares = 0;
        for (int i = 0; i < n ; i++) {
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                quantidadePares++;
            }
        }
        //nao tem par ou tem par
        int media = 0;
        if (somaPares == 0){
            System.out.println("Nenhum número par !");
        }
        else {
            media = somaPares / quantidadePares;
            System.out.print("Média dos pares " + media);
        }
        sc.close();
    }
}

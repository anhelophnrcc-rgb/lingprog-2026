import java.util.Scanner;

public class VetorFibonacci {

    public static void main(String[] args) {
        int n = lerQuantidade();

        int[] fibo = gerarFibonacci(n);

        mostrarVetor(fibo);
    }

    public static int lerQuantidade() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos termos da sequência de Fibonacci você deseja guardar? ");
        return entrada.nextInt();
    }

    public static int[] gerarFibonacci(int n) {
        int[] fibo = new int[n];

        if (n >= 1) {
            fibo[0] = 0;
        }
        if (n >= 2) {
            fibo[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        return fibo;
    }

    public static void mostrarVetor(int[] fibo) {
        System.out.println("\n--- VETOR DE FIBONACCI GERADO ---");

        for (int i = 0; i < fibo.length; i++) {
            System.out.print("[" + fibo[i] + "] ");
        }
    }
}
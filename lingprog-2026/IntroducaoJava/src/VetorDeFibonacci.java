import java.util.Scanner;

public class VetorDeFibonacci {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos termos da sequência de fibonacci voce deseja: ");
        int N = entrada.nextInt();

        int[] fib = new int[N];

        if(N >= 1){
            fib[0] = 0;
        }

        if(N >= 2){
            fib[1] = 1;
        }

        // próximo = anterior + anterior do anterior

        for(int i = 2; i < N; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println("\n---Vetor de Fibonacci gerado--- ");
        for(int i = 0; i < N; i++){
            System.out.print(fib[i] + " ");
        }
    }
}

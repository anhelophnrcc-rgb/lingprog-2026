import java.util.Scanner;

public class VetorDeFibonacci {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = entrada.nextInt();

        int[] fib = new int[N];

        if(N > 0){
            fib[0] = 0;
        }

        if(N > 1){
            fib[1] = 1;
        }

        // próximo = anterior + anteiror do anterior

        for(int i = 2; i < N; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for(int i = 0; i < N; i++){
            System.out.println(fib[i]);
        }
    }
}

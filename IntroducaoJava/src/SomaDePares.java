import java.util.Scanner;

public class SomaDePares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[8];
        int soma = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = entrada.nextInt();
        }
        for(int i = 0; i < 8; i++){
            if(numeros[i] % 2 == 0){
                soma = soma + numeros[i];
            }
        }
        System.out.println("Soma dos números pares: " + soma);
    }
}

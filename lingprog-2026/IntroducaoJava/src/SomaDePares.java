import java.util.Scanner;

public class SomaDePares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[8];
        int soma = 0;

        int i;
        for (i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º um número inteiro: ");
            numeros[i] = entrada.nextInt();
        }

        if (numeros[i] % 2 == 0) {
            soma = soma + numeros[i];
        }

        System.out.println("Soma dos números pares: " + soma);
    }
}

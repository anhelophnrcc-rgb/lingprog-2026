import java.util.Scanner;

public class SomaPares {

    public static void main(String[] args) {
        int[] numeros = lerNumeros();

        int soma = somarPares(numeros);

        mostrarResultado(soma);
    }

    public static int[] lerNumeros() {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = entrada.nextInt();
        }

        return numeros;
    }

    public static int somarPares(int[] numeros) {
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                soma += numeros[i];
            }
        }

        return soma;
    }

    public static void mostrarResultado(int soma) {
        System.out.println("\nA soma de todos os números pares digitados é: " + soma);
    }
}
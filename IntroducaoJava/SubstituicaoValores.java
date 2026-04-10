import java.util.Scanner;

public class SubstituicaoValores {

    public static void main(String[] args) {
        int[] numeros = lerNumeros();

        substituirNegativos(numeros);

        mostrarVetor(numeros);
    }

    public static int[] lerNumeros() {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor para a posição [" + i + "]: ");
            numeros[i] = entrada.nextInt();
        }

        return numeros;
    }

    public static void substituirNegativos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                numeros[i] = 0;
            }
        }
    }

    public static void mostrarVetor(int[] numeros) {
        System.out.println("\nVetor resultante (sem negativos):");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}


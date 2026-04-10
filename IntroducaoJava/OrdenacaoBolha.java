import java.util.Scanner;
public class OrdenacaoBolha {

    public static void main(String[] args) {
        int[] numeros = lerNumeros();

        ordenarBolha(numeros);

        mostrarVetor(numeros);
    }

    public static int[] lerNumeros() {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }

        return numeros;
    }

    public static void ordenarBolha(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
    }

    public static void mostrarVetor(int[] numeros) {
        System.out.println("\n--- VETOR EM ORDEM CRESCENTE ---");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
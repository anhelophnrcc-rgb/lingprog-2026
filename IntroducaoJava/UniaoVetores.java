import java.util.Scanner;

public class UniaoVetores {

    public static void main(String[] args) {
        int[] v1 = lerVetor("Vetor 1");
        int[] v2 = lerVetor("Vetor 2");

        int[] vUniao = unirVetores(v1, v2);

        mostrarVetor(vUniao);
    }

    public static int[] lerVetor(String nome) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Preencha o " + nome + ":");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entrada.nextInt();
        }

        return vetor;
    }

    public static int[] unirVetores(int[] v1, int[] v2) {
        int[] vUniao = new int[v1.length + v2.length];

        for (int i = 0; i < v1.length; i++) {
            vUniao[i] = v1[i];
        }

        for (int i = 0; i < v2.length; i++) {
            vUniao[i + v1.length] = v2[i];
        }

        return vUniao;
    }

    public static void mostrarVetor(int[] vetor) {
        System.out.print("\nVetor União: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
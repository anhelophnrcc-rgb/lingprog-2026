import java.util.Scanner;

public class CalculaMedia {

    public static void main(String[] args) {
        float[] notas = lerNotas();
        float media = calcularMedia(notas);

        mostrarMedia(media);
    }

    public static float[] lerNotas() {
        Scanner entrada = new Scanner(System.in);
        float[] notas = new float[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1) );
            notas[i] = entrada.nextFloat();
        }

        return notas;
    }

    public static float calcularMedia(float[] notas) {
        float soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }

    public static void mostrarMedia(float media) {
        System.out.println("A média é: " + media);
    }
}

import java.util.Scanner;

public class AcimaMedia {

    public static void main(String[] args) {
        double[] salarios = lerSalarios();
        double media = calcularMedia(salarios);
        int[] resultado = contarSalarios(salarios, media);

        mostrarRelatorio(media, resultado);
    }

    public static double[] lerSalarios() {
        Scanner entrada = new Scanner(System.in);
        double[] salarios = new double[5];

        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Informe o salário do " + (i + 1) + "º funcionário: R$ ");
            salarios[i] = entrada.nextDouble();
        }

        return salarios;
    }

    public static double calcularMedia(double[] salarios) {
        double soma = 0;

        for (int i = 0; i < salarios.length; i++) {
            soma += salarios[i];
        }

        return soma / salarios.length;
    }

    public static int[] contarSalarios(double[] salarios, double media) {
        int acima = 0, abaixo = 0, igual = 0;

        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > media) {
                acima++;
            } else if (salarios[i] < media) {
                abaixo++;
            } else {
                igual++;
            }
        }

        return new int[]{acima, abaixo, igual};
    }

    public static void mostrarRelatorio(double media, int[] resultado) {
        System.out.println("\n--- RELATÓRIO ESTATÍSTICO ---");
        System.out.printf("Média Salarial da Empresa: R$ %.2f%n", media);
        System.out.println("Funcionários acima da média: " + resultado[0]);
        System.out.println("Funcionários abaixo da média: " + resultado[1]);
        System.out.println("Funcionários que ganham exatamente a média: " + resultado[2]);
    }
}
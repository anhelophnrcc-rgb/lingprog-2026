import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {
        double[] numeros = lerNumeros();

        double[] resultado = encontrarMaiorMenor(numeros);

        mostrarResultado(resultado);
    }

    public static double[] lerNumeros() {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextDouble();
        }

        return numeros;
    }

    public static double[] encontrarMaiorMenor(double[] numeros) {
        double maior = numeros[0], menor = numeros[0];
        int posMaior = 0, posMenor = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posMaior = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        // retorna: [maior, posMaior, menor, posMenor]
        return new double[]{maior, posMaior, menor, posMenor};
    }

    public static void mostrarResultado(double[] resultado) {
        System.out.println("\nMaior valor: " + resultado[0] + " na posição " + (int)resultado[1]);
        System.out.println("Menor valor: " + resultado[2] + " na posição " + (int)resultado[3]);
    }
}

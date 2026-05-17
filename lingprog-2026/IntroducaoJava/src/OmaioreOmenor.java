import java.util.Scanner;

public class OmaioreOmenor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextDouble();
        }
        double maior = numeros[0];
        double menor = numeros[0];
        int posMaior = 0;
        int posMenor = 0;

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
        System.out.println(" Maior Valor: " + maior + " na posição: " + posMaior);
        System.out.println(" Menor Valor: " + menor + " na posição: " + posMenor);
    }
}

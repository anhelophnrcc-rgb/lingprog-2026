import java.util.Scanner;

public class OmaioreOmenor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = entrada.nextInt();
        }
        int maior = numeros[0];
        int menor = numeros[0];
        int posMaior = 0;
        int posMenor = 0;

        for (int i = 0; i < 10; i++) {
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

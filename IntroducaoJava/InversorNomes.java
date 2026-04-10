import java.util.Scanner;

public class InversorNomes {

    public static void main(String[] args) {
        String[] nomes = lerNomes();

        mostrarOrdemInversa(nomes);
    }

    public static String[] lerNomes() {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = entrada.next();
        }

        return nomes;
    }

    public static void mostrarOrdemInversa(String[] nomes) {
        System.out.println("\nNomes na ordem inversa:");

        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }
}

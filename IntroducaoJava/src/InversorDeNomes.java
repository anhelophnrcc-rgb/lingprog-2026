import java.util.Scanner;

public class InversorDeNomes {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] nome = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um nome: ");
            nome[i] = entrada.nextLine();
        }
        System.out.println("\n Nomes na ordem inversa: ");
        for (int i = 4; i >= 0; i--) {
            System.out.println(nome[i]);
        }
    }
}

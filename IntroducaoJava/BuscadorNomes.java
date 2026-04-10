import java.util.Scanner;

public class BuscadorNomes {

    public static void main(String[] args) {
        String[] nomes = lerNomes();
        String busca = lerBusca();

        int posicao = buscarNome(nomes, busca);

        mostrarResultado(posicao);
    }

    public static String[] lerNomes() {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Cadastre o nome " + i + ": ");
            nomes[i] = entrada.next();
        }

        return nomes;
    }

    public static String lerBusca() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nQual nome deseja buscar? ");
        return entrada.next();
    }

    public static int buscarNome(String[] nomes, String busca) {
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                return i; // retorna a posição se encontrar
            }
        }
        return -1; // se não encontrar
    }

    public static void mostrarResultado(int posicao) {
        if (posicao != -1) {
            System.out.println("Nome encontrado na posição: " + posicao);
        } else {
            System.out.println("Nome não cadastrado na lista.");
        }
    }
}

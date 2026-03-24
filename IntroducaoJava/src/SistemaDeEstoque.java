import java.util.Scanner;

public class SistemaDeEstoque {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] quantidades = new int[5];

        boolean temCritico = false;

        System.out.println("---CADASTRO DE PRODUTOS---");

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome do produto: ");
            nomes[i] = entrada.nextLine();
            System.out.println("Digite a quantidade em estoque: ");
            quantidades[i] = entrada.nextInt();
            entrada.nextLine();
        }
        System.out.println("\nProdutos com estoque critico: ");

        for(int i = 0; i < 5; i++){
            if(quantidades[i] < 5){
                System.out.println("-> " + nomes[i] + ": apenas " + quantidades[i] + " unidades.");
                temCritico = true;
            }
        }
        if (!temCritico) {
            System.out.println("Tudo em ordem! Nenhum item abaixo do limite.");
        }
    }
}

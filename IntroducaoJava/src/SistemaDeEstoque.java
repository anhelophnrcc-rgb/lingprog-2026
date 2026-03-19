import java.util.Scanner;

public class SistemaDeEstoque {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String[] produtos = new String[5];
        int[] quantidade = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome do produto: ");
            produtos[i] = entrada.nextLine();
            System.out.println("Digite a quantidade em estoque: ");
            quantidade[i] = entrada.nextInt();
            entrada.nextLine();
        }
        System.out.println("\nProdutos com estoque critico: ");

        for(int i = 0; i < 5; i++){
            if(quantidade[i] < 5){
                System.out.println(produtos[i] + " - Quantidade: " + quantidade[i] );
            }
        }
    }
}

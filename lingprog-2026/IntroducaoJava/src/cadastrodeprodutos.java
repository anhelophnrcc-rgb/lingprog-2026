import java.util.Scanner;

public class cadastrodeprodutos {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String nome;
        String produtoMaisCaro = "";
        double preco;
        double maiorPreco = 0;

        while (true){

            System.out.print("Nome do Produto: ");
            nome = entrada.nextLine();

            System.out.print("Preço do Produto: ");
            preco = entrada.nextDouble();
            entrada.nextLine();

            if (preco > maiorPreco){
                maiorPreco = preco;
                produtoMaisCaro = nome;
            }
            System.out.print("Deseja continuar? (S/N): ");
            String resposta = entrada.nextLine();

            if (resposta.equalsIgnoreCase("N")){
                break;
            }
        }
        System.out.println("Produto Mais Caro: " + produtoMaisCaro);
        System.out.println("Preço: " + maiorPreco);
        entrada.close();
    }
}

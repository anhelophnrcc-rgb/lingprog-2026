import java.util.Scanner;

public class PedidoCliente {

        public static void main(String[] args) {

            Scanner entrada = new
                    Scanner(System.in);

            System.out.println("=== MENU ===");
            System.out.println("101 - Cachorro Quente (R$ 10,00)");
            System.out.println("102 - X-Burger (R$ 15,00)");
            System.out.println("103 - X-Salada (R$ 12,00)");
            System.out.print("Digite a opção desejada: ");

            int opcao = entrada.nextInt();
            float valor = 0f;

            switch (opcao) {
                case 101:
                    valor = 10.0f;
                    System.out.println("Você escolheu Cachorro Quente.");
                    break;

                case 102:
                    valor = 15.0f;
                    System.out.println("Você escolheu X-Burger.");
                    break;

                case 103:
                    valor = 12.0f;
                    System.out.println("Você escolheu X-Salada.");
                    break;

                default:
                    System.out.println("Opção Inválida.");
                    return;
            }
            System.out.print("Digite sua idade: ");
            int idade = entrada.nextInt();

            float valorFinal = valor;

            if (idade < 12) {
                valorFinal = valor * 0.5f;
                System.out.println("Desconto Menu Kids aplicado (50%).");
            } else if (idade > 60) {
                valorFinal = valor * 0.7f;
                System.out.println("Desconto Melhor Idade aplicado (30%).");
            } else {
                System.out.println("Sem desconto.");
            }

            System.out.println("Valor final: R$ " + valorFinal);

            entrada.close();

        }
    }


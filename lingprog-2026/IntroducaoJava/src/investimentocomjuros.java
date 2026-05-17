import java.util.Scanner;

public class investimentocomjuros {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double deposito;
        double taxa;
        double saldo;

        System.out.print("Digite o valor do deposito: ");
        deposito = entrada.nextDouble();

        System.out.print("Digite a taxa de juros mensal: ");
        taxa = entrada.nextDouble();

        saldo = deposito;

        for(int mes = 1; mes <= 12; mes++){
            saldo = saldo + ( saldo * taxa / 100);
            System.out.println(" Mês " + mes+ " -saldo: " + saldo);
        }
        entrada.close();
    }
}

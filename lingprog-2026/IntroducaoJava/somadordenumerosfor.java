import java.util.Scanner;

public class somadenumerosfor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        int quantidade;
        int soma = 0;

        System.out.print("Quantos números deseja somar?: ");
        quantidade = entrada.nextInt();

        for (int i = 1; i <= quantidade; i++){
            System.out.print("Digite o número " + i + ": ");
            int numero = entrada.nextInt();

            soma = soma + numero;
        }
        System.out.println("A Soma total é : " + soma);

        entrada.close();
    }
}

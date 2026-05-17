import java.util.Scanner;

public class fatorialdeumnumero {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numero;
        int fatorial = 1;

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        for(int i = numero; i >= 1; i--){
            fatorial = fatorial * i;
        }
        System.out.println("O Fatorial de " + numero + " é: " + fatorial);
        entrada.close();
    }
}

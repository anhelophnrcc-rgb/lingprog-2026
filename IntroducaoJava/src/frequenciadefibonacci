import java.util.Scanner;

public class sequenciadefibonacci {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int termos;
        int a = 0;
        int b = 1;

        System.out.print("Quantos termos de sequência deseja ver?: ");
        termos = entrada.nextInt();

        for(int i = 1; i <= termos; i++){
            System.out.print(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;
        }
        entrada.close();
    }

}

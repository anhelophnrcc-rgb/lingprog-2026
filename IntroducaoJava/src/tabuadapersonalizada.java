import java.util.Scanner;
public class tabuadapersonalizada {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número:");
        int numero = entrada.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
        entrada.close();
    }
}

import java.util.Scanner;

public class SubstituicaoDeValores {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int[]  numeros = new  int[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            numeros[i] = entrada.nextInt();
        }
        for(int i = 0; i < 10; i++){
            if(numeros[i] < 0){
                numeros[i] = 0;
            }
        }
        System.out.println("Vetor Final: ");
        for(int i = 0; i < 10; i++){
            System.out.println(numeros[i]);
        }
    }

}

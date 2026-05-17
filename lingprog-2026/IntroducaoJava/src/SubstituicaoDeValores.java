import java.util.Scanner;

public class SubstituicaoDeValores {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int[] numeros= new  int[10];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o valor para a posição [" + 1 + "]: ");
            numeros[i] = entrada.nextInt();

            if(numeros[i] < 0){
                numeros[i] = 0;
            }
        }
        System.out.println("Vetor Final: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }

}

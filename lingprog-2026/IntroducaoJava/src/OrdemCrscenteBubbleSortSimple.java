import java.util.Scanner;

public class OrdemCrscenteBubbleSortSimple {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length -1; i++){
            System.out.println("Digite um número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros.length -1 -i; j++){
                if(numeros[j] > numeros[j + 1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        System.out.println(" Vetor em ordem crescente: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

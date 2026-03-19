import java.util.Scanner;

public class UniaodeVetores {
    public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

    int[] v1 = new int[5];
    int[] v2 = new int[5];
    int[] v3 = new int[10];

    for(int i = 0; i < 5; i++){
        System.out.println("Digite um valor para o vetor 1: ");
        v1[i] = entrada.nextInt();
    }
    for(int i = 0; i < 5; i++){
        System.out.println("Digite um valor para o vetor 2: ");
        v2[i] = entrada.nextInt();
    }
    for(int i = 0; i < 5; i++) {
        v3[i] = v1[i];
    }
    for(int i = 0; i < 5; i++){
        v3[i+5] = v2[i];
    }
        System.out.println("Vetor Unido: ");
    for(int i = 0; i < 10; i++){
        System.out.println(v3[i]);
    }
  }
}
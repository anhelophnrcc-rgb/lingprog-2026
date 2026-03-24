import java.util.Scanner;

public class UniaodeVetores {
    public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

    int[] v1 = new int[5];
    int[] v2 = new int[5];
    int[] vUniao = new int[10];

    for(int i = 0; i < v1.length; i++){
        System.out.println("Digite um valor para o vetor 1: ");
        v1[i] = entrada.nextInt();
    }
    for(int i = 0; i < v2.length; i++){
        System.out.println("Digite um valor para o vetor 2: ");
        v2[i] = entrada.nextInt();
    }
    for(int i = 0; i < vUniao.length; i++) {
        vUniao[i] = v1[i]; // Copia para as primeiras 5 posições
    }
    for(int i = 0; i < v2.length; i++){
        vUniao[i+5] = v2[i];
    }
        System.out.println("Vetor União: ");
    for(int num: vUniao){
        System.out.println(num + " ");
    }
  }
}
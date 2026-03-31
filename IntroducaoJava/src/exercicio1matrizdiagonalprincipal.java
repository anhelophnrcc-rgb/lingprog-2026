import java.util.Scanner;
public class exercicio1matrizdiagonalprincipal {
    public static void main(String [] args){
        Scanner  entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int soma = 0;
        //alimentar a matriz

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                if(i == j){
                    System.out.println("Elemento faz parte da diagonal principal: " + matriz[i][j]);
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("Soma dos elementos da diagonal principal: " + soma);
    }
}

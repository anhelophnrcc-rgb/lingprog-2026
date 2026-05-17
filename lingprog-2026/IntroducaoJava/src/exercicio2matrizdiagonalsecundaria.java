import java.util.Scanner;
public class exercicio2matrizdiagonalsecundaria {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o tamanho da matriz: ");
        int n = entrada.nextInt();

        int[][] matriz = new int[n][n]; // matriz quadrada
        // alimenta a matriz
        // calcula a soma dos elementos da diagonal principal
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 10;
                if ((i + j) == matriz.length - 1) { // é diagonalç secundaria
                    System.out.println("Elemento faz parte da diagonal secundaria " + matriz[i][j]);
                    soma += matriz[i][j];
                }
            }

        }
        System.out.println("Soma dos elementos da diagonal secundária " + soma);

    }
}

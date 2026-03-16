import java.util.Scanner;

public class contadordepares {
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        int inferior;
        int superior;

        System.out.print("Digite o limite inferior: ");
        inferior = entrada.nextInt();

        System.out.print("Digite o limite superior: ");
        superior = entrada.nextInt();

        for( int i = inferior; i <= superior; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        entrada.close();
    }
}

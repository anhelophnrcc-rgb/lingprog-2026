import java.util.Scanner;
public class validacaocominsistencia {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota;

        System.out.print("Digite uma nota entre 0 e 10: ");
        nota = entrada.nextDouble();

        while ( nota < 0 || nota > 10){
            System.out.println("Nota invalida! Digite novamente.");
            nota = entrada.nextDouble();
        }
        System.out.println("Nota válida digitada: " + nota);
        entrada.close();
    }
}

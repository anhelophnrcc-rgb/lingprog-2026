import java.util.Scanner;

public class acimadaMediaSalarial {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double[] salarios = new double[5];

        double soma = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o salário: ");
            salarios[i] = entrada.nextDouble();
            soma = soma + salarios[i];
        }
        double media = soma / 5;

        int iguais = 0;
        int acima = 0;
        int abaixo = 0;

        for(int i = 0; i < 5; i++){
            if(salarios[i] == media){
                iguais++;
            }
            else if(salarios[i] > media){
                acima++;
            }
            else{
                abaixo++;
            }
        }
        System.out.println(" Média Salarial: " + media);
        System.out.println(" Iguais a Média: " + iguais);
        System.out.println(" Acima da Média: " + acima);
        System.out.println(" Abaixo da Média: " + abaixo);
    }
}

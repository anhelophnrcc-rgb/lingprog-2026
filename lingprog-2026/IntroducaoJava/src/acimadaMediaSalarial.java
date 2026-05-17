import java.util.Arrays;
import java.util.Scanner;

public class acimadaMediaSalarial {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double[] salarios = new double[5];
        double soma = 0;

        for(int i = 0; i < salarios.length; i++){
            System.out.println("Informe o salario " + (i + 1) + ": ");
            salarios[i] = entrada.nextDouble();
            soma = soma + salarios[i];
        }
        double media = soma / salarios.length;

        int iguais = 0;
        int acima = 0;
        int abaixo = 0;

        for(int i = 0; i < salarios.length; i++){
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

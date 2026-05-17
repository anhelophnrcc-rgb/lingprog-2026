import java.util.Scanner;

public class mediadasidadessentinela {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int idade;
        int soma = 0;
        int contador = 0;

        System.out.print("Digite uma idade (-1 para parar) : ");
        idade = entrada.nextInt();

        while(idade >= 0){
            soma = soma + idade;
            contador++;

            System.out.print("Digite uma idade (-1 para parar) :");
            idade = entrada.nextInt();
        }
        if(contador > 0){
            double media = (double) soma / contador;
            System.out.println("Media das idades; " + media);
        } else{
            System.out.println("Nenhuma idade válida foi digitada!");
        }
        entrada.close();
    }


}

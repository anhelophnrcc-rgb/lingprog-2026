import java.util.Scanner;

public class Obuscador {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String[] nomes =  new String[10];


        for(int i = 0; i < 10; i++){
            System.out.println("Digite um nome: ");
            nomes[i] = entrada.nextLine();
        }
        System.out.println("Qual nome deseja buscar?: ");
        String busca = entrada.nextLine();

        boolean encontrado = false;
        int posicao = -1;


        for(int i = 0; i < 10; i++){
            if(nomes[i].equalsIgnoreCase(busca)){
                encontrado = true;
                posicao = i;
            }
        }
        if(encontrado){
            System.out.println("Nome encontrado na posição:" + posicao);
        }
        else{
            System.out.println(" Não Encontrado!");
        }
    }
}

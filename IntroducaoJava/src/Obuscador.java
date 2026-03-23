import java.util.Scanner;

public class Obuscador {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String[] nomes =  new String[10];


        for(int i = 0; i < nomes.length; i++){
            System.out.println("Cadastre o nome: " + i + ": " );
            nomes[i] = entrada.nextLine();
        }
        System.out.println("Qual nome deseja buscar? : ");
        String busca = entrada.nextLine();
        boolean encontrado = false;

        for(int i = 0; i < nomes.length; i++){
            if(nomes[i].equalsIgnoreCase(busca)){
                System.out.println("Nome encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println(" Nome não encontrado na lista. ");
        }
    }
}


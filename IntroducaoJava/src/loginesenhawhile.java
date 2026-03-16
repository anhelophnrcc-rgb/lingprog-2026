import java.util.Scanner;

public class loginesenhawhille {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String usuario;
        String senha;

        System.out.print("Digite seu nome: ");
        usuario = entrada.nextLine();

        System.out.print("Digite sua senha: ");
        senha = entrada.nextLine();

        while(senha.equals(usuario)){
            System.out.println("Erro!A senha não pode ser igual ao nome.");
            System.out.print("Digite sua senha: ");
            senha = entrada.nextLine();
        }
        System.out.println("Cadastro realizado com sucesso!");
        entrada.close();
    }
}

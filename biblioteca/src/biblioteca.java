import java.sql.*;
import java.util.Scanner;

public class biblioteca {
    public static void criarTabela(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS livros (" +
                "id SERIAL PRIMARY KEY," +
                "titulo TEXT NOT NULL," +
                "autor TEXT NOT NULL," +
                "ano INTEGER NOT NULL," +
                "disponivel INTEGER NOT NULL)";
        // cria objeto de instrução SQL
        Statement stmt = conn.createStatement();
        stmt.execute(sql); //executa comando sql
        System.out.println("Tabela pronta!");//fecha instrção sql
    }
    public static void cadastrarLivro(Connection conn, Scanner sc) throws SQLException {
        System.out.println("Informe o titulo do livro");
        String titulo = sc.nextLine();
        System.out.println("Informe o autor do livro");
        String autor = sc.nextLine();
        System.out.println("Informe o ano do livro");
        int ano = sc.nextInt();
        sc.nextLine();
        //cria SQL
        String sql = "INSERT INTO livros " + "(titulo, autor, ano, disponivel) " + "VALUES (?, ?, ?, 1)";
        //prepara uma instrução
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, titulo); // define o titulo do livro
        ps.setString(2, autor); // define o autor do livro
        ps.setInt(3, ano); // define o ano do livro
        ps.executeUpdate(); //executa o sql
        System.out.println("Livro cadastrado com sucesso");
        ps.close();
    }
    public static void listarLivros(Connection conn) throws SQLException {
        String sql = "SELECT * FROM livros ORDER BY titulo";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {

            int id = rs.getInt("id");
            String titulo = rs.getString("titulo");
            String autor = rs.getString("autor");
            int ano = rs.getInt("ano");
            int disponivel = rs.getInt("disponivel");

            String situacao;

            if (disponivel == 1) {
                situacao = "DISPONIVEL";
            }
            else {
                situacao = "EMPRESTADO";
            }

            System.out.printf("[%d] %s - %s (%d) - %s%n", id, titulo, autor, ano, situacao);
        }
        rs.close();
        stmt.close();
  }
    public static void emprestarLivro(Connection conn, Scanner sc) throws SQLException {
        System.out.println("Informe o id do livro");
        int id = sc.nextInt();
        String sql = "UPDATE livros " +
                "SET disponivel = 0 " +
                "WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        int linhasAfetadas = ps.executeUpdate();

        if (linhasAfetadas > 0) {
            System.out.println("Livro emprestado");
        }
        else {
            System.out.println("Livro nao encontrado");
        }
        ps.close();
    }
    public static void devolverLivro(Connection conn, Scanner sc) throws SQLException {
        System.out.println("Informe o id do livro");
        int id = sc.nextInt();
        String sql = "UPDATE livros " +
                     "SET disponivel = 1 " +
                     "WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        int linhasAfetadas = ps.executeUpdate();

        if (linhasAfetadas > 0) {
            System.out.println("Livro devolvido");
        }
        else {
            System.out.println("Livro nao encontrado");
        }
        ps.close();
    }
    public static void removerLivro(Connection conn, Scanner sc) throws SQLException {
        System.out.println("Informe o id do livro");
        int id = sc.nextInt();
        String sql = "DELETE FROM livros WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        int linhasAfetadas = ps.executeUpdate();
        ps.close();

        if (linhasAfetadas > 0) {
            System.out.println("Livro removido");
        }
        else {
            System.out.println("Livro nao encontrado");
        }
    }
    public static void exibirMenu() {
        System.out.println("\n=== Biblioteca ===");
        System.out.println("1. Listar livros");
        System.out.println("2. Cadastrar livro");
        System.out.println("3. Emprestar livro");
        System.out.println("4. Devolver livro");
        System.out.println("5. Remover livro");
        System.out.println("0. Sair");
        System.out.print("Opcao: ");
    }
    public static void processarOpcao(Connection conn, Scanner sc, int opcao) throws SQLException {

        switch (opcao) {

            case 1:
                listarLivros(conn);
                break;
            case 2:
                cadastrarLivro(conn, sc);
                break;
            case 3:
                emprestarLivro(conn, sc);
                break;
            case 4:
                devolverLivro(conn, sc);
                break;
            case 5:
                removerLivro(conn, sc);
                break;
            case 0:
                System.out.println("Encerrando...");
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
    public static void main (String[] args){
        String url = "jdbc:postgresql://localhost:5432/biblioteca";
        try  { // tenta se conectar no banco de dados
            Connection conn = DriverManager.getConnection(
                    url, "postgres", "helo123");
            System.out.println("Conexão com sucesso");
            // cria a tabela produto
            criarTabela(conn);
            Scanner sc = new Scanner(System.in);
            int opcao = 1;
            do {
                exibirMenu();
                opcao = sc.nextInt();
                sc.nextLine();
                processarOpcao(conn, sc, opcao);
            }
            while (opcao != 0);
        }
        catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco "+ e.getMessage());
        }
    }
}
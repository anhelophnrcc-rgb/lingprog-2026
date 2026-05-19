import java.sql.*;
import java.util.Scanner;


public class bazar_Iansa {

    public static void criarTabelaUsuarios(Connection conn) throws SQLException{

        String sql = "CREATE TABLE NOT EXISTES usuarios (" +
                " id SERIAL PRIMARY KEY,"+
                " nome TEXT NOT NULL," +
                "email TEXT UNIQUE NOT NULL," +
                "cpf TEXT UNIQUE NOT NULL,"+
                "senha TEXT NOT NULL," +
                "perfil TEXT NOT NULL," +

                // cria objeto de instrução SQL
            Statement stmt = conn.creatStatement();
            stmt.execute(sql);
            stmt.close();
        System.out.println("Tabela de usuários criada");
    }
    public static void cadastrarUsuarios(Connection conn, Scanner sc) throws SQLException{

    }
}

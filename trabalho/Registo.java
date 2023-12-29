import java.util.Scanner;
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Registo {

    public void realizarRegisto() 
    {
        utilizadores novoUtilizador = criarUtilizador();
        salvarUtilizadorTexto(novoUtilizador); // Guarda o utilizador no arquivo em formato de texto
    }

    public utilizadores criarUtilizador() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        try 
        {
            MessageDigest algorithm = MessageDigest.getInstance("MD5");
            byte senha[] = algorithm.digest(password.getBytes("UTF-8"));
            StringBuilder pass = new StringBuilder();
            for (byte b : senha) 
            {
                pass.append(String.format("%02X", 0xFF & b));
            }
            password = pass.toString();
        } 
        catch (UnsupportedEncodingException | NoSuchAlgorithmException e) 
        {
            e.printStackTrace();
        }
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Defina o estado (ativo/inativo): ");
        boolean estado = scanner.nextLine().equalsIgnoreCase("ativo");
        System.out.print("Defina o tipo (gestor/farmacêutico/cliente): ");
        String tipo = scanner.nextLine();

        // Cria uma instancia com as informações fornecidas
        utilizadores novoUtilizador = new utilizadores(login, password, nome, estado, email, tipo);
        System.out.println("Sucesso!! Bem-vindo, " + novoUtilizador.getNome() + ":D");

        return novoUtilizador;
    }

    private void salvarUtilizadorTexto(utilizadores utilizador) 
    {
        //tem de ser o caminho completo do ficheiro
        try (PrintWriter writer = new PrintWriter(new FileWriter("./credenciais_acesso.txt", true))) 
        {
            // Escreve os dados do utilizador no arquivo em formato de texto
            writer.println(utilizador.getlogin() + "," + utilizador.getPassword() + "," + utilizador.getNome() + ","
                    + utilizador.getEmail() + "," + utilizador.isEstado() + "," + utilizador.getTipo());
                
            System.out.println("Utilizador salvo no arquivo 'credenciais_acesso.txt'"); // PRINT DE TESTES APAGAR NO FIM!!!!!!!!!!!!!!!!!!!!!!!!!!
        } 
        catch (IOException e) 
        {
            System.out.println("Erro ao salvar o utilizador no arquivo.");
            e.printStackTrace();
        }
    }
}

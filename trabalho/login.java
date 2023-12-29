import java.io.*;
import java.util.Scanner;

public class login {

    public utilizadores realizarLogin() 
    {
        utilizadores utilizador = obterUtilizadorExistente();

        if (utilizador != null) 
        {
            System.out.println("Sucesso!! Bem-vindo, " + utilizador.getNome() + "!");
        } 
        else 
        {
            System.out.println("Erro. Password ou Email incorretos.");
        }

        return utilizador;
    }

    private utilizadores obterUtilizadorExistente() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza o seu Email: ");
        String email = scanner.nextLine();

        System.out.print("Insira a sua password: ");
        String password = scanner.nextLine();

        scanner.close();

        // Tenta carregar o utilizador a partir do arquivo
        utilizadores utilizador = carregarUtilizador(email);

        // Verifica se o utilizador existe e se a password está correta
        if (utilizador != null && utilizador.getPassword().equals(password)) 
        {
            return utilizador;
        } 
        else 
        {
            return null;
        }
    }

    private utilizadores carregarUtilizador(String email) 
    {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("credenciais_acesso.txt"))) 
        {
            // Lê o objeto Utilizador do arquivo
            utilizadores utilizador = (utilizadores) objectInputStream.readObject();
            return utilizador;
        } 
        catch (IOException | ClassNotFoundException e) 
        {
            // Se ocorrer um erro (por exemplo, arquivo não encontrado), retorna null
            return null;
        }
    }
}

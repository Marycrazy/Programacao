import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

        // Tenta carregar o utilizador a partir do arquivo
        utilizadores utilizador = carregarUtilizador(email);

        // Verifica se o utilizador existe e se a password está correta
        if (utilizador != null && utilizador.getPassword().equals(password)) 
        {
            System.out.println("Sucesso!! Bem-vindo, " + utilizador.getNome() + "!");
            return utilizador;
        } 
        else 
        {
            return null;
        }
    }

    private utilizadores carregarUtilizador(String email) 
    {
        try(BufferedReader reader= new BufferedReader(new FileReader("./Programacao\\trabalho\\credenciais_acesso.txt"))) {
            String linha;
             while((linha = reader.readLine()) != null){
                //dividir a linha em partes
                 String[] dados = linha.split(",");
                 if(dados[3].trim().equals(email)) //trim() remove os espaços em branco e caso o email introduzido seja igual ao email do ficheiro ele retorna o utilizador
                 {
                     return new utilizadores(dados[0], dados[1], dados[2], Boolean.parseBoolean(dados[4]), dados[3], dados[5]);
                   }
             }
 
         } catch (IOException e) {
             System.out.println("Erro ao ler o arquivo");
             e.printStackTrace();
         }
         return null;
    }
}

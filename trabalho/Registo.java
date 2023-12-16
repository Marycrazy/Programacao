import java.util.Scanner;

public class Registo
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduza o seu nome: ");
    String nome = scanner.nextLine();

    System.out.print("Insira o seu email: ");
    String email = scanner.nextLine();

    System.out.println("Registro concluído, Bem-vindo, " + nome + "!");
}


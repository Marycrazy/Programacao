import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in); 
        
        do{
            System.out.println("Escolha uma opçao");
            System.out.println("1. ler ficheiro"); 
            System.out.println("2. registo");
            System.out.println("3. login");
            System.out.println("4. Sair");
            System.out.println("opcao:");
            opcao = entrada.nextInt();//espera que o utilizador digite um numero inteiro
            
            switch(opcao){
            case 1:
                leiturad leitura = new leiturad();
                leitura.realizarLeitura();
                break;
                
            case 2:
                Registo registo = new Registo();
                registo.realizarRegisto();
                break;
            
            case 3:
                login login = new login();
                login.realizarLogin();
                break;    
            /*case 4:
                if (utilizadores != null) 
                {
                    System.out.println("Até logo, " + login.getNome() + "!");
                } 
                else 
                {
                    System.out.println("Até logo!");
                }
                System.exit(0); // Encerra o programa
                break;*/
                
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}
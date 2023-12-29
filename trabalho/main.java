import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in); 
        
        do{
            System.out.println("Escolha uma opçao");
            System.out.println("1. ler ficheiro"); 
            System.out.println("2. registo");
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
                
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}
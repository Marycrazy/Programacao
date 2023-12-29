import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class leiturad {

    public void realizarLeitura() {
        try {
            File arquivo = new File("./Programacao/trabalho/credenciais_acesso.txt");
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }

            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler o arquivo");
            e.printStackTrace();
        }
    }
}

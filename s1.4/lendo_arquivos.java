import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class lendo_arquivos {
    public static void main(String[] args) {

        try {

            File arquivo = new File("C://Users//aluno//IdeaProjects//gestaoRH-GUI//out//production//prjGESTAO-RH//votos.txt");
            Scanner arquivo_lido = new Scanner(arquivo);
            ArrayList<Integer> votos = new ArrayList<>();

            while (arquivo_lido.hasNextLine()) {
                int valor = Integer.parseInt(arquivo_lido.next());
                votos.add(valor);
                System.out.println(valor);
            }

            for (int i = 0; i < votos.size(); i++) {
                System.out.printf("Time %d: %d votos%n", i+1, votos.get(i));
            }

            arquivo_lido.close();

        }
        catch (IOException e) {
            System.out.println("Erro na leitura" + e.getMessage());
            e.printStackTrace();
        }

    }
}
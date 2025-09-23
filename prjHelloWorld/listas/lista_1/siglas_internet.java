import java.util.Scanner;

public class siglas_internet {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in, "UTF-8");

        int num = input.nextInt();
        input.nextLine();

        String[] siglas = new String[num];
        String[] significados = new String[num];

        for (int i = 0; i < num; i++) {
            String linha = input.nextLine();

            String[] partes = linha.split(" ", 2); // Limite de 2 partes
            siglas[i] = partes[0];
            significados[i] = partes[1];
        }

        String frase = input.nextLine();

        String[] palavras = frase.split(" ");

        for (int i = 0; i < palavras.length; i++) {
            String palavraAtual = palavras[i];

            boolean encontrou = false;
            for (int j = 0; j < siglas.length; j++) {
                if (siglas[j].equalsIgnoreCase(palavraAtual)) {
                    palavras[i] = significados[j];
                    encontrou = true;
                    break;
                }
            }

        }

        String fraseTrauzida = "";
        for (int i = 0; i < palavras.length; i++) {
            fraseTrauzida += palavras[i];

            if (i < palavras.length - 1) {
                fraseTrauzida += " ";
            }
        }

        System.out.println(fraseTrauzida);

        input.close();
    }
}
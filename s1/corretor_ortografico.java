import java.util.Scanner;

public class corretor_ortografico {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        String[] dicionario = new String[n];

        for (int i = 0; i < n; i++) {
            String palavras = input.nextLine();
            dicionario[i] = palavras;
        }

        String palavra_consultada = input.nextLine();

        boolean tem = false;
        for (int i = 0; i < dicionario.length; i++) {
            if (dicionario[i].equals(palavra_consultada)) {
                tem = true;
                System.out.println("palavra correta");
                break;
            }
        }

        if (!tem) {
            System.out.println("palavra incorreta");

            String sugestao = null;

            for (int i = 0; i < palavra_consultada.length() - 1 && sugestao == null; i++) {

                char[] letras = palavra_consultada.toCharArray();

                char temp = letras[i];
                letras[i] = letras[i + 1];
                letras[i + 1] = temp;

                String palavra_transposta = new String(letras);

                for (int j = 0; j < dicionario.length; j++) {
                    if (dicionario[j].equals(palavra_transposta)) {
                        sugestao = dicionario[j];
                        break;
                    }
                }
            }

            if (sugestao != null) {
                System.out.println(sugestao + "?");
            } else {
                System.out.println("nenhuma sugestão");
            }
        }

    }
}
import java.util.Scanner;

public class controle_pessoas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char entrada = scan.next().charAt(0);
        int m = 0;
        int f = 0;
        float contador_m = 0;
        float contador_f = 0;

        while (true){
            if (entrada == 'q'){
                break;
            }
            else if(entrada == 'h'){
                contador_m += 12.50f;
                m+=1;
            } else if(entrada == 'm'){
                contador_f += 7.40f;
                f+=1;
            }

            entrada = scan.next().charAt(0);

        }

        System.out.println(m+" "+f);
        System.out.printf("%.2f %.2f %.2f", contador_m, contador_f, contador_m+contador_f);

    }
}

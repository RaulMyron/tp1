import java.util.Scanner;
public class calculo_iptu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int loteamento = 0;
        float iptu1 = 0;
        float iptu2 = 0;
        float area = 0;

        loteamento = scan.nextInt();
        area = scan.nextFloat();

        if (loteamento == 1 || loteamento == 2){
            if (area > 0 && area < 200 ){

                iptu1 = area;
                iptu2 = area * 1.1f;

                if (loteamento == 1){
                    System.out.println(iptu1);
                } else {
                    System.out.println(iptu2);
                }


            } else if (area >= 200) {
                iptu1 = area * 1.2f;
                iptu2 = area * 1.3f;

                if (loteamento == 1){
                    System.out.println(iptu1);
                } else {
                    System.out.println(iptu2);
                }

            } else {
                System.out.println("Entrada inválida!");
            }
        }
        else {
            System.out.println("Entrada inválida!");
        }




    }
}

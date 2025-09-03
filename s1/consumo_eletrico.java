import java.util.Scanner;

public class consumo_eletrico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float entrada = scan.nextFloat();
        float total = 0;
        float tarifa = 0;
        if (entrada <= 500){
            tarifa = 0.02f;
            total = tarifa*entrada;
        } else if (entrada > 500 && entrada <= 1000){
            total = (500*0.1f) + ((entrada - 500)*0.05f);
        } else if (entrada > 1000) {
            tarifa = 0.35f;
            total = (1000*tarifa) + ((entrada - 1000)*0.1f);
        }
        System.out.printf("%.2f %.2f %.2f", total, 5f, total+5);

    }
}
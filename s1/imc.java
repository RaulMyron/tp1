import java.util.Scanner;

public class imc {
    public static void main(String[] args) {

        float altura = 0;
        char sexo = ' ';

        Scanner leitura = new Scanner(System.in);;
        altura = leitura.nextFloat();
        sexo = leitura.next().charAt(0);

        if (altura <= 0) {
            System.out.println("Entrada inválida!");
        }
        else if (sexo != 'm' && sexo != 'f'){
            System.out.println("Entrada inválida!");
        }
        else if (sexo == 'm'){
            float peso_ideal = (72.7f*altura)-58f;
            System.out.printf("%.1f kg\n", peso_ideal);
        }
        else {
            float peso_ideal = (62.1f * altura) - 44.7f;
            System.out.printf("%.1f kg\n", peso_ideal);
        }



        }
    }

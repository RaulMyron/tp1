import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class op_vendas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Integer> mercado = new LinkedHashMap<>();

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            String name_id = scan.next();
            int qtd = scan.nextInt();
            mercado.put(name_id, qtd);

        }

        while (true){

            String consulta = scan.next();

            if (consulta.equals("fim")){

                for (String produto : mercado.keySet()) {
                    System.out.println(produto + " " + mercado.get(produto));
                }

                break;

            }
            else {

                Integer value = mercado.get(consulta);

                if (value == null){
                    System.out.println(consulta + " produto não encontrado");
                }
                else{

                    int valores = scan.nextInt();

                    System.out.println(consulta + " " + valores);

                    mercado.put(consulta, value-valores);

                }



            }





        }
    }
}

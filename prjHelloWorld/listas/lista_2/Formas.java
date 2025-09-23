package lista_2;

import java.util.Scanner;

class Retangulo{

     public int comprimento = 1;
     public int largula = 1;

    public int getPerimetro() {
        return 2*(comprimento+largula);
    }

    public int getArea() {
        return comprimento*largula;
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getLargula() {
        return largula;
    }

    public void setComprimento(int comprimento) {

        if (comprimento>0 && comprimento<20){
            this.comprimento = comprimento;
        }

    }

    public void setLargula(int largula) {

        if (largula>0 && largula<20){
            this.largula = largula;
        }
    }

}

public class Formas{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int comprimento = scanner.nextInt();
        int largura = scanner.nextInt();

        Retangulo obj1 = new Retangulo();

        obj1.setComprimento(comprimento);
        obj1.setLargula(largura);

        int comprimento2 = scanner.nextInt();
        int largura2 = scanner.nextInt();

        Retangulo obj2 = new Retangulo();

        obj2.setComprimento(comprimento2);
        obj2.setLargula(largura2);

        System.out.println(obj1.getComprimento() + " " + obj1.getLargula() + " " + obj1.getPerimetro() + " " + obj1.getArea());
        System.out.println(obj2.getComprimento() + " " + obj2.getLargula() + " " + obj2.getPerimetro() + " " + obj2.getArea());

    }

}

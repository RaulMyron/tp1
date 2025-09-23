package lista_2;

import java.util.Scanner;

class Temperatura {

    private double temperatura;

    public Temperatura(double temperaturaInicial) {
        this.temperatura = temperaturaInicial;
    }

    public String toString() {
        return String.valueOf(temperatura);
    }

    public void celsiusParaFahrenheit() {
        this.temperatura = temperatura * 9.0 / 5.0 + 32;
    }

    public void fahrenheitParaCelsius() {
        this.temperatura = (temperatura - 32) * 5.0 / 9.0;
    }
}

public class Converte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperaturaInicial = scanner.nextDouble();

        Temperatura temp = new Temperatura(temperaturaInicial);

        temp.celsiusParaFahrenheit();
        System.out.println("temperatura: " + temp.toString() + " graus fahrenheit");

        temp.fahrenheitParaCelsius();
        System.out.println("temperatura: " + temp.toString() + " graus celsius");

        scanner.close();
    }
}
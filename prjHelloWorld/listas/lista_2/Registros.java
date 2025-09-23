package lista_2;

import java.util.Scanner;

class Emergencia {

    public String nomeChamador;
    public String telefoneChamador;
    public String localEmergencia;
    public String dataHoraRelato;
    public String naturezaEmergencia;
    public String tipoResposta;
    public String statusResposta;
    public String chamadaCelular;
    public String coordenadasGPS;

    public void mostrarEmergencias() {
        System.out.println("--- Informações da Emergência ---");
        System.out.println();
        System.out.println("Nome do Chamador: " + nomeChamador);
        System.out.println("Telefone: " + telefoneChamador);
        System.out.println("Local da Emergência: " + localEmergencia);
        System.out.println("Data/Hora do Relato: " + dataHoraRelato);
        System.out.println("Natureza da Emergência: " + naturezaEmergencia);
        System.out.println("Tipo de Resposta: " + tipoResposta);
        System.out.println("Status da Resposta: " + statusResposta);

        String chamadaPadronizada = chamadaCelular.equalsIgnoreCase("sim") ? "Sim" : "Não";
        System.out.println("Chamada via celular: " + chamadaPadronizada);

        if (chamadaCelular.equalsIgnoreCase("Sim")) {
            System.out.println("Coordenadas GPS: " + coordenadasGPS);
        }
    }
}

public class Registros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeEmergencias = scanner.nextInt();
        scanner.nextLine();

        Emergencia[] emergencias = new Emergencia[quantidadeEmergencias];

        for (int i = 0; i < quantidadeEmergencias; i++) {
            emergencias[i] = new Emergencia();

            emergencias[i].nomeChamador = scanner.nextLine();
            emergencias[i].telefoneChamador = scanner.nextLine();
            emergencias[i].localEmergencia = scanner.nextLine();
            emergencias[i].dataHoraRelato = scanner.nextLine();
            emergencias[i].naturezaEmergencia = scanner.nextLine();
            emergencias[i].tipoResposta = scanner.nextLine();
            emergencias[i].statusResposta = scanner.nextLine();
            emergencias[i].chamadaCelular = scanner.nextLine();

            if (emergencias[i].chamadaCelular.equalsIgnoreCase("Sim")) {
                emergencias[i].coordenadasGPS = scanner.nextLine();
            }
        }

        for (int i = 0; i < quantidadeEmergencias; i++) {
            System.out.println("Emergência #" + (i + 1));
            System.out.println();
            emergencias[i].mostrarEmergencias();

            if (i < quantidadeEmergencias - 1) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
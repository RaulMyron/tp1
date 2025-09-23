package lista_2;

import java.util.Scanner;

class Conta{

    private int numeroConta;
    private int senha;
    private String nome;
    private double saldo;

    public Conta(int numeroConta, String nomeCliente, double saldo, int senha) {
        this.numeroConta = numeroConta;
        this.nome = nomeCliente;
        this.saldo = saldo;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo(int senhaInformada) {
        if (senhaInformada == this.senha) {
            return saldo;
        }
        return -1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSenha() {
        return senha;
    }

    public boolean sacar(double saque, int senha){
        if ((senha == this.senha) && (saque > 0) && (saque <= this.saldo)) {
            this.saldo -= saque;
            return true;
        }
        return false;

    }

    public boolean deposito(double deposito, int senha){
        if((senha == this.senha) && (deposito > 0)){
            this.saldo+=deposito;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, int senha, Conta conta2){
        if(senha == this.senha && valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            conta2.saldo += valor;
            return true;
        }
        return false;
    }

}


public class Banco {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        int numeroConta = Scan.nextInt();
        int senhaConta = Scan.nextInt();
        String Nome = Scan.next();
        double saldo = Scan.nextDouble();

        Conta conta1 = new Conta(numeroConta, Nome, saldo, senhaConta);


        int numeroConta2 = Scan.nextInt();
        int senhaConta2 = Scan.nextInt();
        String Nome2 = Scan.next();
        double saldo2 = Scan.nextDouble();

        Conta conta2 = new Conta(numeroConta2, Nome2, saldo2, senhaConta2);

        int opcao;
        do {
            opcao = Scan.nextInt();

            switch (opcao) {
                case 1:
                    int senha = Scan.nextInt();
                    double saldo_novo = conta1.getSaldo(senha);
                    if (saldo_novo != -1) {
                        System.out.printf("%.2f%n", saldo_novo);
                    } else {
                        System.out.println("senha incorreta");
                    }
                    break;

                case 2:
                    double saque = Scan.nextDouble();
                    int senha_temp = Scan.nextInt();
                    if (conta1.sacar(saque, senha_temp)) {
                        System.out.println("saque realizado");
                    } else {
                        System.out.println("saque não realizado");
                    }
                    break;

                case 3:
                    double deposito = Scan.nextDouble();
                    int senhaDep = Scan.nextInt();
                    if (conta1.deposito(deposito, senhaDep)) {
                        System.out.println("depósito realizado");
                    } else {
                        System.out.println("depósito não realizado");
                    }
                    break;

                case 4:
                    String transferenciaConta = Scan.next();
                    if (transferenciaConta.equals(conta2.getNome())) {
                        double valorTransferencia = Scan.nextDouble();
                        int senhaParaTransferencia = Scan.nextInt();
                        if (conta1.transferir(valorTransferencia, senhaParaTransferencia, conta2)) {
                            System.out.println("transferência realizada");
                        } else {
                            System.out.println("transferência não realizada");
                        }
                    } else {
                        System.out.println("nenhum usuário encontrado");
                    }
                    break;

                case 5:
                    break;
            }
        } while (opcao != 5);

    }
}

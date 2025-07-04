package br.com.desafios.contabanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Agora informe o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe o valor que deseja sacar:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia + ", e o valor de R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

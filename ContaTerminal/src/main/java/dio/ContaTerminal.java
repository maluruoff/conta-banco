package dio;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criar um Scanner para ler dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler o número da conta
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Solicitar e ler a agência
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        // Solicitar e ler o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        // Solicitar e ler o saldo
        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem final com as informações do cliente
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        // Fechar o Scanner
        scanner.close();
    }

}
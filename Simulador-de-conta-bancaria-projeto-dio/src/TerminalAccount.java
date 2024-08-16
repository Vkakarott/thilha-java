import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao JavaBank!");
        System.out.print("Digite seu nome: ");
        String name = input.nextLine();
        System.out.print("Por favor, digite o número da agência: ");
        int agency = input.nextInt();
        System.out.print("Digite o numero da conta: ");
        int account = input.nextInt();
        System.out.print("Deposito: ");
        double balance = input.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque.%n", name, agency, account, balance);

    }
}
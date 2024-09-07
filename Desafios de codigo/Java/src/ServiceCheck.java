import java.util.Scanner;

public class ServiceCheck {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do serviço: ");
        String serviceName = input.nextLine();

        System.out.print("Digite os dados do cliente: ");
        String clientData = input.nextLine().trim();

        String[] clientPieces = clientData.split(",");

        boolean found = false;

        for (int i = 1; i < clientPieces.length; i++) {
            if (serviceName.equals(clientPieces[i])) found = true; 
        }

        if (found) System.out.println("Sim");
        else System.out.println("Não");

        input.close();
    }
}

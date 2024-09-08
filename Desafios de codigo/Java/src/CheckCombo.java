import java.util.Scanner;

public class CheckCombo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] combo = {"movel", "banda larga", "tv"};

        String clientData = input.nextLine().trim();

        String[] clientPieces = clientData.split(",");

        System.out.print(clientPieces.length);
    }
}

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro parametro: ");
        int fistParameter =  input.nextInt();

        System.out.print("Digite o segundo parametro: ");
        int secondParameter = input.nextInt();

        try {
            count(fistParameter, secondParameter);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
        }

    }
    static void count(int fistParameter, int secondParameter) throws ParametrosInvalidosException {
        if(fistParameter > secondParameter) {
            throw new ParametrosInvalidosException();
        }

        int count = secondParameter - fistParameter;
        for (int i = 1; i <= count; i++) {
            System.out.printf("%d ", i);
        }
    }
}
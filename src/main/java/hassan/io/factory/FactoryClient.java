package hassan.io.factory;

import java.util.Scanner;

public class FactoryClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Bank code!");
        IBank bank = new BankFactory().getBank(scanner.nextLine());
        System.out.println(bank.withdraw());
    }
}

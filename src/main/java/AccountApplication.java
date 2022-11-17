import java.util.Scanner;

public class AccountApplication {

    public static void main(String[] args) {
        System.out.println("Account Application!");
        Account myAccount = new Account();
        char c = 'E';

        while (c != 'Q') {
            Scanner input = new Scanner(System.in);

            printMenu();

            //Grab the user input
            c = Character.toUpperCase(input.next().charAt(0));
            if (c == 'A') {
                System.out.printf("\nIn Option %c%n", c);
                Scanner input3 = new Scanner(System.in);
                System.out.println("How much to deposit?");
                double amount = input3.nextDouble();
                myAccount.deposit(amount);
                System.out.printf("\nNew Balance: %s%n", myAccount.getBalance());

            } else if (c == 'B') {
                System.out.printf("\nIn Option %c", c);
                Scanner input4 = new Scanner(System.in);
                System.out.println("How much to withdraw?");
                double amount = input4.nextDouble();
                myAccount.debit(amount);
                System.out.printf("\nNew Balance: %s%n", myAccount.getBalance());

            } else if (c == 'C') {
                System.out.printf("\nResetting account balance to 0");
                myAccount.reset();
                System.out.printf("\nNew Balance: %s%n", myAccount.getBalance());

            }
        }

    }
    private static void printMenu() {
        System.out.println("\n\nMake a choice");
        System.out.println("(A) Deposit");
        System.out.println("(B) Withdraw");
        System.out.println("(C) Reset");
        System.out.println("(Q) Quit");
    }
}





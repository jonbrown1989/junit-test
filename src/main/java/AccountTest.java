public class AccountTest {
    public static void main(String[] args) {

        Account myAccount = new Account();
        myAccount.setName("Debit Don");
        myAccount.debit(50);    //Should cause insufficient funds error
        myAccount.debit(-50);   //Should cause value error
        myAccount.deposit(-50); //Should cause value error
        myAccount.deposit(100);
        myAccount.debit(50);   //Balance should print 50

        System.out.println();
        System.out.printf("Balance: %s%n", myAccount.getBalance());
    }
}

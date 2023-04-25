import Inheritance.Masina;
import Inheritance.Vehicul;

public class Main {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount(56675765, 765, "Ana Vicneanscaia");
//        Integer accountNumber = bankAccount.getAccountNumber();
//        Integer accountBalance = bankAccount.getAccountBalance();
//        String accountHolder = bankAccount.getAccountHolder();
//        System.out.println("This account number is " + accountNumber);
//        System.out.println("This balance has " + accountBalance);
//        System.out.println("Account belongs to " + accountHolder);


        Masina masina = new Masina("BMW");
        masina.showVehicleDetails();

        Vehicul vehicul  = new Vehicul();
        vehicul.showVehicleDetails();

    }
}


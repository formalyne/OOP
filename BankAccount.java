public class BankAccount {
    private String Bankname;
    private String AccountHolder;
    private Integer AccountNumber;
    private Integer AccountBalance = 100423;


    BankAccount(Integer accountNumber,
                Integer accountBalance,
                String accountHolder) {
        this.AccountNumber = accountNumber;
        this.AccountBalance = accountBalance;
        this.AccountHolder = accountHolder;
    }


    public static void BankNameq() {
        System.out.println("I am using Raffeizen Bank");
    }

    public static void Whoisholder() {
        System.out.println("Ana Vicneanscaia is Account master");
    }

    public static void BalanceStatus() {
        System.out.println("Am I broke?");
    }

    public static void MoneyTransfer() {
        System.out.println("Please choose receiver");
    }

    public static void MoneyAreComing() {
        System.out.println("Pray to God, you received your life subscription");
    }


    public String getBankname() {
        return Bankname;
    }

    public void setBankname(String bankname) {
        Bankname = bankname;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        AccountHolder = accountHolder;
    }

    public Integer getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        AccountNumber = accountNumber;
    }

    public Integer getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        AccountBalance = accountBalance;
    }
}




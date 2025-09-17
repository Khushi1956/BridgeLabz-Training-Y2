class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;  // using this
        this.accountNumber = accountNumber;          // final
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Holder: " + accountHolderName + ", Account#: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Amit", 101);
        acc1.displayDetails();
        BankAccount.getTotalAccounts();
    }
}

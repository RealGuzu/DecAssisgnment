class BankAccount {
    private int accountNumber;
    private Double accountBalance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double newAccountBalance) {
        this.accountBalance = newAccountBalance;
    }

    public static void main(String[] args) {
        BankAccount myObj = new BankAccount();
        myObj.setAccountNumber(123456789);
        myObj.setAccountBalance( 4000.0);
    System.out.println("Your account number is: " + myObj.accountNumber);
    System.out.println("Your Account balance is $"+myObj.accountBalance + " USD");

    }
}

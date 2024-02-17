package bank_application;

interface Customer {
//    double dailyWithdrawalLimit = 100000;

    double getBalance();

    double getDepositsDetails();

    //it will return current balance after money deposited
    void deposit(double amount);

    //it will return current balance after money withdraw;

    void withdraw(double amount);

}


class RegularUser implements Customer{

    RegularUser(String name,double currentBalance,double totalDepositsAmount,String accountType){

        this.name = name;
        this.currentBalance = currentBalance;
        this.totalDepositsAmount = totalDepositsAmount;
        this.accountType = accountType;
        accountDetails = new Account(accountType);
    }
    //all variables
    private String name;
//    private String AccountNo;
    private double currentBalance;
    private double totalDepositsAmount;
    private String accountType;
    final private double DAILY_WITHDRAWAL_LIMIT = 1000000;

    private Account accountDetails;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getTotalDepositsAmount() {
        return totalDepositsAmount;
    }

    public void setTotalDepositsAmount(double totalDepositsAmount) {
        this.totalDepositsAmount = totalDepositsAmount;
    }


    @Override
    public double getBalance() {
        return currentBalance;
    }

    @Override
    public double getDepositsDetails() {
        return totalDepositsAmount;
    }

    @Override
    public void deposit(double amount) {
//        Transcations transit = new Transcations();
//        currentBalance = transit.deposit(currentBalance,amount);
        currentBalance += amount;
        System.out.println("Current balance: " + currentBalance);
    }

    @Override
    public void withdraw(double amount) {
//        Transcations transit = new Transcations();
//        currentBalance = transit.withdraw(currentBalance,amount);
          currentBalance-=amount;
        System.out.println("Current balance:"+currentBalance);
    }


    public void display() {
        System.out.println("RegularUser{" +
                "name='" + name + '\'' +
                ", currentBalance=" + currentBalance +
                ", totalDepositsAmount=" + totalDepositsAmount +
                ", accountType='" + accountType + '\'' +
                ", DAILY_WITHDRAWAL_LIMIT=" + DAILY_WITHDRAWAL_LIMIT +
                ", accountDetails=" + accountDetails.displayAccountDetails()+
                '}');
    }
}

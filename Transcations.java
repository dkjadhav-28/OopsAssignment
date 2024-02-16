package bank_application;

public class Transcations {

    public double deposit(double currentBalance,double amount)
    {
        return currentBalance+=amount;
    }

    public double withdraw(double currentBalance,double amount)
    {
        return currentBalance-=amount;
    }
}

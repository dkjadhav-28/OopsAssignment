package bank_application;
import java.util.*;
public class Account {


    Account(String type){
        accountType = type;
        accountNumber = "SBIN"+generateAccountNumber();
    }
    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    private String accountType;




    public int generateAccountNumber() {
        Random random = new Random();
        return random.nextInt(1001) + 1000;  // Generates a random number between 1000 and 2000 (inclusive)
    }


    public String displayAccountDetails() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}

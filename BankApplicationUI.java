package bank_application;

import java.awt.*;

//this is main entry point or UI for bank data
public class BankApplicationUI {


    public static void main(String[] args) {
        RegularUser customer_1 = new RegularUser("Dhananjay",0,0,"regular");
        customer_1.deposit(1000);
        customer_1.withdraw(100);

        customer_1.display();
    }










}

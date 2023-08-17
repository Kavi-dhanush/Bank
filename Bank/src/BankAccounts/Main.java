package BankAccounts;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to bank");
        System.out.println("to create savings account enter 1");
        System.out.println("to create current account enter 2");
        System.out.println("to create loan account enter 3");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
           if (a == 1) {
            savingsAccount acc1 = new savingsAccount();
            acc1.start();
            acc1.success();
            acc1.interestRate();
            }
        if (a == 2) {
            currentAccount acc1 = new currentAccount();
            acc1.start();
            acc1.success();
            acc1.interestRate();
        }
        if(a == 3){
            loanAccount acc1 = new loanAccount();
            acc1.start();
            acc1.success();
            acc1.interestRate();
        }

    }
}

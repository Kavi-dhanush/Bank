package BankAccounts;

import java.util.Scanner;

public interface account {
    default void start(){
        System.out.println("enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("enter your mobile number:");
        String num = sc.nextLine();
        System.out.println("enter your aadhar number:");
        String aadhar = sc.nextLine();
        System.out.println("enter your PAN number:");
        String PAN = sc.nextLine();
        System.out.println("---------------------");
        System.out.println("Name as in bank account: "+name);
        System.out.println("Registered number for account: "+num);
        System.out.println("---------------------");
    }
    default void success(){}
    default void interestRate(){}
}

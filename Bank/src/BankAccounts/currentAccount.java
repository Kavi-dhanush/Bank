package BankAccounts;

import java.util.Scanner;

public class currentAccount implements account{
    @Override
    public void success(){
        System.out.println("Your current account has been successfully created");
    }

    @Override
    public void interestRate(){
        System.out.println("Interest rate for current account is 7%");
        System.out.println("enter the principal amount");
        Scanner sc = new Scanner(System.in);
        int principal = Integer.parseInt(sc.nextLine());
        double rate = principal*0.07;
        System.out.println("Interest rate is:"+rate);

    }
}

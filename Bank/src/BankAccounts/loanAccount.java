package BankAccounts;

import java.util.Scanner;

public class loanAccount implements account{
    @Override
    public void success() {
        System.out.println("Your loan account has been successfully created");
    }

    @Override
    public void interestRate(){
        System.out.println("Interest rate for loan account is 10%");
        System.out.println("enter the principal amount");
        Scanner sc = new Scanner(System.in);
        int principal = Integer.parseInt(sc.nextLine());
        double rate = principal*0.1;
        System.out.println("Interest rate is:"+rate);

    }
}

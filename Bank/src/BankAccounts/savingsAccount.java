package BankAccounts;

import java.util.Scanner;

public class savingsAccount implements account {
     @Override
    public void success(){
         System.out.println("Your savings account has been successfully created");
     }

    @Override
    public void interestRate(){
        System.out.println("Interest rate for savings account is 6%");
        System.out.println("enter the principal amount");
        Scanner sc = new Scanner(System.in);
        int principal = Integer.parseInt(sc.nextLine());
        double rate = principal*0.06;
        System.out.println("Interest rate is:"+rate);

    }

}

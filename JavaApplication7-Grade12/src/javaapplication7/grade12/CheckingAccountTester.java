package javaapplication7.grade12;
import java.util.Scanner;

/**
 *
 * @author Vedant
 */
public class CheckingAccountTester {

    public static void main(String[] args) {
        CheckingAccount[] checkingAccounts;
        System.out.println("Welcome to Checking Account Tracker!");
        
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number of checking accounts: ");
        int num = sc1.nextInt();
        checkingAccounts = new CheckingAccount[num];
        Scanner sc2 = new Scanner(System.in);
        
        int i = 1;
        for(int counter1 = 0; counter1 < num; counter1++){
            System.out.println("Enter information for check account #" + i + ": ");
            System.out.print("Account Number: ");
            int accNum = sc1.nextInt();
            System.out.print("\nName of Account Holder: ");
            String accName = sc2.nextLine();
            System.out.print("\nCurrent Balance: ");
            double accCurBalance = sc1.nextDouble();
            checkingAccounts[counter1] = new CheckingAccount(accNum, accName, accCurBalance);
            i++;
        }
        
        CheckingAccount higherBalance = checkingAccounts[0];
        for(int counter1 = 0; counter1 < checkingAccounts.length; counter1++){
            higherBalance = higherBalance.higerBalance(checkingAccounts[counter1]);
        }
        System.out.println("\nThe account with the higher balance:" + "\nAccount Number: " + higherBalance.getAccountNum() + " \nName of Account Holder: " + higherBalance.getAccountholder() + " \nCurrent Balance: " + higherBalance.getCurBalance());
        
        System.out.print("Deposit to account #: ");
        int accNum = sc1.nextInt();
        System.out.print("\nDeposit amount: ");
        double deposit = sc1.nextDouble();
        checkingAccounts[accNum - 1].deposit(deposit);
        
        System.out.print("\nProcess check from account #: ");
        accNum = sc1.nextInt();
        System.out.print("\nCheck amount: ");
        double amt = sc1.nextDouble();
        checkingAccounts[accNum - 1].processCheck(amt);
        
        System.out.print("\nSplit account #: ");
        accNum = sc1.nextInt();
        System.out.print("\nAmount to be taken out from account #" + accNum + ": ");
        double splitMoney = sc2.nextDouble();
        CheckingAccount newAccount = checkingAccounts[accNum - 1].splitAccount(splitMoney);
        System.out.println("\nOriginal Account: \nAccount Number: " + checkingAccounts[accNum - 1].getAccountNum() + " \nName of Account Holder: " + checkingAccounts[accNum - 1].getAccountholder() + " \nCurrent Balance: " + checkingAccounts[accNum - 1].getCurBalance());
        System.out.println("\n\nNew Account: \nAccount Number: " + newAccount.getAccountNum() + " \nName of Account Holder: " + newAccount.getAccountholder() + " \nCurrent Balance: " + newAccount.getCurBalance());
        
        System.out.println("Account(s) with overdraft: ");
        for(int counter1 = 0; counter1 < checkingAccounts.length; counter1++){
           if(checkingAccounts[counter1].overdraft())
               System.out.println(checkingAccounts[counter1].toString());
        }
    }
}
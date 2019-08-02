package javaapplication11.grade12;

/**
 *
 * @author Vedant Shah
 */
public class Account {

    private char accType; //Account type the customer has(cchequing, ssavings, rRSP).
    private double balance; //Balance in the account
    private int acctID; //The account's ID number
    
    //Constuctor that constructs an account object.
    public Account(int acctID, double amount, char type){
        this.accType = type;
        this.acctID = acctID;
        this.balance = amount;
    }
    
    //Withdraws money from the account only if there is enough balance in the account for the withdraw. It returns false if there is not enough balance in the account and true otherwise.
    public boolean withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
            return true;
        }
        else
            return false;
    }
    
    //Deposits money in the specified account. It then lets the customer know that the deposit was complete.
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("The deposit was complete. Congratulations! This account is now $" + amount + " richer.\n");
    }
    
    /**
     * @return the accType
     */
    public char getAccType() {
        return accType;
    }

    /**
     * @param accType the accType to set
     */
    public void setAccType(char accType) {
        this.accType = accType;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the acctID
     */
    public int getAcctID() {
        return acctID;
    }

    /**
     * @param acctID the acctID to set
     */
    public void setAcctID(int acctID) {
        this.acctID = acctID;
    }
}

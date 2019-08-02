package javaapplication11.grade12;
import java.util.*;

/**
 *
 * @author Vedant Shah
 */
public class Customer {

    private int custID; //Customer ID
    public Account[] accounts = new Account[3]; //Three types of accounts for each customer
    private String firstName; //Customer first name
    private String lastName; //Customer last name
    private int numOfAccounts; //Keeps check of how many accounts the customer has
    private Date DOB; //Date of Birth of the customer
    
    //Constructor that initializes a Customer object.
    public Customer(int cID, String fname, String lname, Date DOB){
        this.custID = cID;
        this.firstName = fname;
        this.lastName = lname;
        this.DOB = DOB;
    }
    
    //Returns the account matching the account type.
    public Account getAccount(char type){
        Account getAccount = accounts[0];
        for(int counter1 = 0; counter1 < accounts.length; counter1++){
            if(type == accounts[counter1].getAccType()){
                getAccount = accounts[counter1];
                return getAccount;
            }
        }
        return getAccount;
    }
     
    //Adds an Account to the Customer. Since a customer can only have 1 of each type of account, it will return true if they don’t already have one account of this type and false otherwise. It also increases the number of accounts the Customer has.
    public boolean addAccount(int acctID, double balance, char type){
        boolean b = true;
        
        if(numOfAccounts == 3) 
            b = false;
        
        if(numOfAccounts == 0){ 
            accounts[0] = new Account(acctID, balance, type);
            b = true;
            numOfAccounts++;
        }
        
        if(numOfAccounts == 1) {
            if(accounts[0].getAccType() != type){
                accounts[1] = new Account(acctID, balance, type);
                b = true;
                numOfAccounts++;
            }
        }
        if(numOfAccounts == 2) {
            if(accounts[0].getAccType() != type && accounts[1].getAccType() != type){
                accounts[2] = new Account(acctID, balance, type);
                b = true;
                numOfAccounts++;
            }
        }
        return b;
    }
    
    //Removes the account identified by the account type.
    public boolean removeAccount(char type){
        for(int counter1 = 0; counter1 < accounts.length; counter1++){
            if(type == accounts[counter1].getAccType()){
                accounts[counter1] = null;
                return true;
            }
        }
        return false;
    }
    
    //Returns all the following information: Name, Customer ID, Date of Birth, and each account’s type, ID, and balance. 
    public String toString(){
        String str = "Name: " + this.firstName + " " + this.lastName + " Customer ID: " + this.custID + " Date of Birth: " + this.DOB + "\n";
        for(int counter1 = 0; counter1 < accounts.length; counter1++){
            str += "Account Type: " + accounts[counter1].getAccType() + " Account ID: " + accounts[counter1].getAcctID() + " Balance: " + accounts[counter1].getBalance() + "\n";
        }
        return str;
    }

    /**
     * @return the custID
     */
    public int getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(int custID) {
        this.custID = custID;
    }

    /**
     * @return the accounts
     */
    public Account[] getAccounts() {
        return accounts;
    }

    /**
     * @param accounts the accounts to set
     */
    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the numOfAccounts
     */
    public int getNumOfAccounts() {
        return numOfAccounts;
    }

    /**
     * @param numOfAccounts the numOfAccounts to set
     */
    public void setNumOfAccounts(int numOfAccounts) {
        this.numOfAccounts = numOfAccounts;
    }

    /**
     * @return the DOB
     */
    public Date getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }   
}
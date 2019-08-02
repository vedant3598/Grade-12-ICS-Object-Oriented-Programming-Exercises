package javaapplication7.grade12;

/**
 *
 * @author Vedant Shah
 */
public class CheckingAccount {

    private int accountNum;
    private String Accountholder;
    private double curBalance;
    
    private static final double MIN_BALANCE = 1000;
    private static final double CHARGE_PER_CHECK = 0.15;
    
    public CheckingAccount(){
        accountNum = 0;
        Accountholder = null;
        curBalance = 0;
    }
    
    public CheckingAccount(int num, String holder, double balance){
        accountNum = num;
        Accountholder = holder;
        curBalance = balance;
    }
    
    public void deposit(double amount){
        this.curBalance += amount;
    }
    
    public void processCheck(double amount){
        if(this.curBalance - amount < MIN_BALANCE){
            this.curBalance -= CHARGE_PER_CHECK;
            this.curBalance -= amount;
        }
        else
            this.curBalance -= amount;
    }
    
    public boolean overdraft(){
        if(this.curBalance < 0)
            return true;
        else
            return false;
    }
    
    public CheckingAccount higerBalance (CheckingAccount other){
        CheckingAccount ca1 = new CheckingAccount();
        if(this.getCurBalance() <= other.getCurBalance())
            ca1 = other;
        else
            ca1 = this;
        return ca1;
    }
    
    public CheckingAccount splitAccount(double moneyTransferred){
        String accountPerson = Accountholder;
        String newAccountNum = this.accountNum + "0";
        int newAccountNumInteger = Integer.parseInt(newAccountNum);
        double newAccountMoney = moneyTransferred;
        this.curBalance -= moneyTransferred;
        CheckingAccount newAccount = new CheckingAccount(newAccountNumInteger, accountPerson, newAccountMoney); 
        return newAccount;
        
    }  
    
    public boolean equals(CheckingAccount other){
        if(this.getAccountholder().equals(other.getAccountholder()))
            return true;
        else
            return false;
    }
    
    public String toString(){
        return "Account Number: " + this.getAccountholder() + " Account Number: " + this.getAccountNum() + " Current Balance: " + this.getCurBalance(); 
    }

    /**
     * @return the MIN_BALANCE
     */
    public static double getMIN_BALANCE() {
        return MIN_BALANCE;
    }

    /**
     * @return the CHARGE_PER_CHECK
     */
    public static double getCHARGE_PER_CHECK() {
        return CHARGE_PER_CHECK;
    }

    /**
     * @return the accountNum
     */
    public int getAccountNum() {
        return accountNum;
    }

    /**
     * @param accountNum the accountNum to set
     */
    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    /**
     * @return the Accountholder
     */
    public String getAccountholder() {
        return Accountholder;
    }

    /**
     * @param Accountholder the Accountholder to set
     */
    public void setAccountholder(String Accountholder) {
        this.Accountholder = Accountholder;
    }

    /**
     * @return the curBalance
     */
    public double getCurBalance() {
        return curBalance;
    }

    /**
     * @param curBalance the curBalance to set
     */
    public void setCurBalance(double curBalance) {
        this.curBalance = curBalance;
    }
}


package javaapplication11.grade12;

/**
 *
 * @author Vedant Shah
 */
public class BankHelper {
    
    //Finds the array position of the object whose value matches a target Customer ID and returns row position in the 1-D array that matches the Customer’s custID.
    public static Customer findCustomer(Customer[] customer, int cID){
        Customer findCustomer = customer[0];
        for(int counter1 = 0; counter1 < customer.length; counter1++){
            if(customer[counter1].getCustID() == cID){
               findCustomer = customer[counter1];
            }
        }
        return findCustomer;
    }
    
    //Finds the array position of the object whose value matches a target Account ID and returns that Customer object.
    public static Customer findCustomerMatchingAcctNum(Customer[] customer, int accountID){
        Customer findCustomer = customer[0];
        char[] accountArray = {'c', 's', 'r'};
        for(int counter1 = 0; counter1 < customer.length; counter1++){
            if(customer[counter1].getAccount(accountArray[counter1]).getAcctID() == accountID){
                findCustomer = customer[counter1];
            }
        }
        return findCustomer;
    }
    
    //Finds the array position of the object whose value matches a target Account ID and returns that Account object.
    public static Account findAccount(Customer[] customer, int accountID){
        Customer findCustomer = customer[0];
        Account findCustomerOfAccountType;
        char[] accountArray = {'c', 's', 'r'};
        int x = 0;
        for(int counter1 = 0; counter1 < customer.length; counter1++){
            if(customer[counter1].getAccount(accountArray[counter1]).getAcctID() == accountID){
                return findCustomerOfAccountType = customer[counter1].getAccount(accountArray[counter1]);
            }
            x++;
        }
        return findCustomerOfAccountType = customer[x].getAccount(accountArray[x]);
    }
}
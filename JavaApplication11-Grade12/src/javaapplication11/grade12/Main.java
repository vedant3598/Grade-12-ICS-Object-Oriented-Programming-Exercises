package javaapplication11.grade12;
import java.text.*;
import java.util.*;

/**
 *
 * @author Vedant Shah
 * Course Code: ICS4U Teacher: Ms. Navabi
 * Program Description: This is an assignment that I have created using the UML diagrams and Specifications my teacher has provided me with.
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        //Creates three Date objects for each customer's birth date.
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse("09/12/1985");
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse("10/1/1970");
        Date date3 = new SimpleDateFormat("dd/MM/yyyy").parse("01/29/1978");
        
        //Declares and initializes an array of Customer objects, which will contain three elements, and in this case, Customer objects.
        Customer[] customers = new Customer[3];

        //Creates the first Customer object and adds the accounts this customer has.
        customers[0] = new Customer(971354658, "Victor", "Hong", date1);
        customers[0].addAccount(1235, 1220.23, 'c');
        customers[0].addAccount(1236, 5023.15, 's');
        customers[0].addAccount(1237, 15020.23, 'r');
        
        //Creates the second Customer object and adds the accounts this customer has.
        customers[1] = new Customer(897515312, "Jame", "Lee", date2);
        customers[1].addAccount(3421, 1220.23, 'c');
        customers[1].addAccount(3422, 23.15, 's');
        customers[1].addAccount(3423, 45312.12, 'r');
        
        //Creates the third Customer object and adds the accounts this customer has.
        customers[2] = new Customer(123456465, "James", "Brown", date3);
        customers[2].addAccount(2124, 1220.23, 'c');
        customers[2].addAccount(2121, 1210.12, 'r');
        
        //Withdraws $200.00 from account 1235
        System.out.println("The withdraw transaction from account 1235 is: " + customers[0].getAccount('c').withdraw(200.00) + ".\n");
        //Deposits $1000.00 into account 1236
        customers[0].getAccount('s').deposit(1000.00);
        //Withdraws $200.00 from account 3422
        System.out.println("The withdraw transaction from account 3422 is: " + customers[1].getAccount('s').withdraw(40.00) + ".\n");
        
        //Transfers $1200.50 from account 2124 to 2121 if and only if athere is enough balance in the account for the withdraw.
        Boolean enoughMoney = customers[2].getAccount('c').withdraw(1200.50);
        if(enoughMoney)
            System.out.println("The transaction from account 2124 to account 2121 is not possible due to insufficient funds!\n");
        else 
            System.out.println("The transaction from account 2124 to account 2121 is: " + enoughMoney + ".\n");
        
        //Transfers all the money from account 3422 into 3423 and closes the account.
        customers[1].getAccount('r').deposit(customers[1].getAccount('s').getBalance());
        customers[1].removeAccount('s');
        customers[0].getAccount('s').withdraw(customers[0].getAccount('s').getBalance());
        customers[0].removeAccount('s');
        
        //Adds a new Savings account to Customer 971354658 with a balance of $3050.00 if this customer does not already have a Savings account.
        boolean addNewAccount1 = customers[0].addAccount(1238, 3000.00, 's');
        System.out.println("A new Savings account to Customer 971354658 with a balance of $3050.00 is: " + addNewAccount1 + ".\n");
        //Adds a new Savings account to Customer 123456465 with a balance of $100.00 if this customer does not already have a Savings account.
        boolean addNewAccount2 = customers[2].addAccount(5000, 100.00, 's');
        System.out.println("A new Savings account to Customer 123456465 with a balance of $100.00 is: " + addNewAccount2 + ".\n");    
    }
}
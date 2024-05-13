
package codesoft_Tasks;

import java.util.Scanner;
//user's bank account
class Account
{
    int balance=100000;
}

class ATM extends Account
{
    Account x=new Account();// object of class "Account" to access data inside this class
    int withdraw,deposit,checkbalance;
    
    Scanner r=new Scanner(System.in);
    
    void withdraw()
    {
        System.out.print("Enter money to withdraw ");
         withdraw=r.nextInt();
      if(x.balance>=withdraw)
      {
         x.balance=x.balance-withdraw;
         System.out.println("Please collect your money");
      }
      else
      {
          System.out.println("Insufficient money");
      }
      
     }
    
    void deposit()
    {
     System.out.print("Enter money to deposit ");
     deposit=r.nextInt();
     
     x.balance=x.balance+deposit;
     
    }
    void checkbalance()
    {
        System.out.println("Total balance "+x.balance);
    }
}
public class ATM_Machine 
{
 public static void main(String args[])       
 {
     ATM y=new ATM();
     
     System.out.println("choose 1 for withdraw");
     System.out.println("choose 2 for deposit");
     System.out.println("choose 3 for check balance");
     System.out.println("choose 4 For exit");
     
     Scanner t=new Scanner(System.in);
     
     System.out.println("Please! Enter your choice");
      int choice=t.nextInt();
      
    switch(choice)
    {
        case 1: y.withdraw();
                y.checkbalance();
                break;
        case 2: y.deposit();
               System.out.println("Your money has been successfully deposited");
               y.checkbalance();
               break;
        case 3: y.checkbalance();
               break;
        case 4: System.exit(0);
    }
 }
 }

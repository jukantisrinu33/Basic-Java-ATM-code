
import java.util.Scanner;
public class Atm
{
    int x;
    double balance=1000;
    int pin = 8466; 
    Scanner sc = new Scanner(System.in);   
    public static void main(String args[])
    {
        System.out.println("Please insert your card");
        System.out.println("Your Transaction is Being Processed \nplease Dont remove your card");
        Atm atm=new Atm();
        atm.start();
     
    }
    void banking()
    {
        System.out.println("enter any number between 10 to 99\nfor eg.25 ");
        int num = sc.nextInt();
        if(num > 10 && num < 99)
        {
            System.out.println("Please enter your Pin:");
            correctPin();

        }
        else

            banking();
    }

    void fastCash()
    {
        int q;
        System.out.println("Please select the Amount to be withdraw");
        System.out.println("1.500\n2.1000\n3.1500\n4.2000\n5.5000");
        q=sc.nextInt();
        if(q==1)
        {
            if(balance>=500)
            { 
                System.out.println("Please collect your rs:500 cash");
                balance=balance-500;
                choice1();
            }
            else
            { 
                System.out.println("Insufficient balance");
                choice1();
            }
        }
        else if(q==2)
        { 
            if(balance>=1000)
            { 
                System.out.println("Please collect your rs:500 cash");
                balance=balance-1000;
                choice1();
            }
            else
            { 
                System.out.println("Insufficient balance");
                choice1();
            }
        }
        else if(q==3)
        { 
            if(balance>=1500)
            { 
                System.out.println("Please collect your rs:1500 cash");
                balance=balance-500;
                choice1();
            }
            else
            { 
                System.out.println("Insufficient balance");
                choice1();
            }
        }
        else if(q==4)
        { 
            if(balance>=2000)
            { 
                System.out.println("Please collect your rs:2000 cash");
                balance=balance-500;
                choice1();
            }
            else
            { 
                System.out.println("Insufficient balance");
                choice1();
            }
        }
        else if(q==5)
        {
            if(balance>=5000)
            { 
                System.out.println("Please collect your rs:5000 cash");
                balance=balance-500;
                choice1();
            }
            else
            { 
                System.out.println("Insufficient balance");
                choice1();
            }
        }
        else
        { 
            System.out.println("Please Enter a valid Input");
            fastCash();
        }
    
    }
    void cashWithdrawal()
    {
        while(true)
        {
        System.out.println("1.current\n2.Savings");
            int w = sc.nextInt();
              if(w==1||w==2)
                {
                   System.out.println("Please enter the Amount to withdraw");
                    int e=sc.nextInt();
                    if(e%100==0)
                    {
                        if(e<=balance)
                        {
                            System.out.println("Please collect your cash "+e);
                            balance=balance-e;
                            choice1();
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                            choice1();
                        }
                    }
                    else
                        System.out.println("Please enter the Denoms in mutliples of 100 or 200 or 500");
                
              }
            else
                System.out.println("Enter a valid Input");
            
        }      
    }
    void balanceEnquiry()
    {
        int r,t;
        int fun = 0;
        while(true)
        { 
            System.out.println("Please enter your Pin");
            r=sc.nextInt();
            if(r==pin)
            {
            while(true)
            { 
                System.out.println("1.current\n2.Savings");
                t=sc.nextInt();
                if(t==1||t==2)
                {
                    System.out.println("your account Balance is "+balance);
                    choice2();
                }
                else
                { 
                    System.out.println("Please enter a valid input");
                }
            }

        }
        else
        {
            
            fun++;
            int y=3-fun;
                if(fun<=2)
                {
                    System.out.println("Please enter correct Pin\nYou have only " + y +"chances left");
                }
                else
                {
                    System.out.println("you have reached maximum limit please try again\nafter 24 hours");
                    System.exit(0);
                }
        }
        }
        

    }
    void deposit()
    {
        int y;
        System.out.println("Deposit for Transaction limit is 2,00,000");
        System.out.println("Please Enter the amount to Deposit");

        while(true)
        {
        y=sc.nextInt();
        if(y>=200000)
        {
            System.out.println("Enter amount less than 2,00,000");
        }
        else
        { 
            if(y%100==0)
            { 
                balance=balance+y;
                System.out.println("Amount Deposited is"+y);
                choice1();
            }
            else
                System.out.println("Enter amount in the Demons of 100/500/1000/2000");
        }
        }

    }
    void pinChange()
    {
        int sum=0;
        System.out.println("Please Enter your old pin");
        while(true)
        { 
            int v=sc.nextInt();
            if(v==pin)
            {
                System.out.println("Please enter new pin");
                int y=sc.nextInt();
                pin=y;
                System.out.println("Your pin is changed successfully");
                choice1();
            }
            else
            {
                System.out.println("Please Enter your old pin Correctly");
                sum++;
                if(sum==3)
                {
                    System.out.println("You have Reached the maximum Limit Please check again after 24 hours");
                    System.exit(0);
                }
                else
                {
                    int y = 3-sum;
                    System.out.println("Please enter correct Pin\nYou have only " +y  +"chances left");
                }
            } 
        }
    }
    void correctPin()
    {
        int fun1=0;
        while(true)
        {
        x = sc.nextInt();
        if(x == pin)
        {
            while(true)
            {
                System.out.println("1.Deposit\n2.change Pin\n3.Fast Cash\n4.cash Withdrawal\n5.Balance Enquiry");
                int p = sc.nextInt();
                switch(p)
                {
                    case 1:
                        deposit();
                        choice1();
                        break;
                    case 2:
                        pinChange();
                        break;
                    case 3:
                        fastCash();
                        System.exit(0);
                    case 4:
                        cashWithdrawal();
                        System.exit(0);
                    case 5:
                        balanceEnquiry();
                        break;
                    default :
                        System.out.println("enter avalid input ");
                        
                        
                    }
                }
            }
            else
            {
                fun1++;
                int y=3-fun1;
                if(fun1==3)
                { 
                    System.out.println("You have Reached the maximum Limit Please check again after 24 hours");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please enter correct Pin\nYou have only " + y +"chances left");
                }
                
            }
        }
    }
    void choice1()
    {
        while(true)
        {
            System.out.println("1.Main Menu\n2.exit");
            int choice1=sc.nextInt();
            switch(choice1)
            {
                case 1:
                    banking();
                case 2:
                    System.out.println("Thank you for Using our ATM");
                    System.exit(0);
                default:
                    System.out.println("Enter a valid input");
            }
        }
    }

    void choice2()
    { 
    
        while(true)
        {
            System.out.println("1.Main Menu\n2.exit");
            int choice1=sc.nextInt();
            switch(choice1)
            {
                case 1:
                    start();
                case 2:
                    System.out.println("Thank you for Using our ATM");
                    System.exit(0);
                default:
                    System.out.println("Enter a valid input");
            }
        }
    }
    void start()
    {
        int choice;
        //Thread.sleep(7000);
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("1.Banking\n2.Balance Enquiry\n3.Exit");
            
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    banking();
                    break;
                case 2:
                    balanceEnquiry();
                    choice2();  
                    break;
                case 3:
                    System.out.println("Thank you for Using our ATM");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Enter a valid input");                
            }
        
        }
    }  
}

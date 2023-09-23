/* 
import java.util.*;

public class ATM_project {
    public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("Welcome to SBI Atm....");
       System.out.println("Please insert your Debit card");
       System.out.println("Press enter for insert card.........");
       String user_pin=obj.nextLine(); 
       System.out.println("Please Wait while we are fetching your Details.....");
       System.out.println();
       boolean Atm=true;
       int total_amount=50000;
    
       while( Atm==true){
       System.out.println("please select your option");
       System.out.println("Withdraw- press 1");
       System.out.println("Deposit- press 2");
       System.out.println("Check Balance- press 3");
       System.out.println("Generate Pin- press 4");
       System.out.println("Exit-press 5");
       int number=obj.nextInt();

       switch(number){     
         case 1:
           System.out.println("Please Enter your Amount : ");
           int amount=obj.nextInt();
           System.out.print("Please Enter your PIN number : ");
           char pin=obj.next().charAt(0);
           
           if(amount>100000){
                System.out.println("you have not sufficient balance");
                System.out.println("your transaction has been declined....");           
            }
            else{
                total_amount=total_amount-amount;
                System.out.println("Please Wait while your transaction is being processed....");
                System.out.println("Please collect your cash");
                System.out.println("your transaction has been succesful....");
            }
            break;
         
         case 2:
            System.out.println("please enter your amount to be deposited : ");
            amount=obj.nextInt();
            System.out.print("Please Enter your PIN number : ");
            pin=obj.next().charAt(0);
            total_amount=total_amount+amount;
            System.out.println("Please Wait while your transaction is being processed....");
            System.out.println("Your amount has been successfully deposited");
            break;

         case 3:
            System.out.println("Please Enter your PIN number : ");
            int m=obj.nextInt();
            
            if(m==1234)
            {
               System.out.println("your Available balance is : "+total_amount);
            }
            else
            {
               System.out.println("your enter wrong pin...");
            }
           
            break;

         case 4:
            System.out.println("Pleas insert your card number : ");
            int n;
            n=obj.nextInt();

            if(n==1234567890)
            {
              System.out.println("Please Enter six digit green pin : ");
              int y;
              y=obj.nextInt();

              if(y==123456)
              {
              System.out.println("Please Enter four digit New pin : ");
              int x;
              x=obj.nextInt();
              System.out.println("Please confirm four digit pin :   ");
              int w;
              w=obj.nextInt();
// t.equals("string")

                if(x==w)
                {
                System.out.println("Wait....");
                System.out.println("Your password is now created......");
                System.out.println("Please Remove your Debit Card...");
                }
                else
                {
                System.out.println("New pin and Confirm pin are not same..");
                System.out.println("Recheck confirm pin....");
                }
                break;
                }

              else
              {
                System.out.println("You enter wrong green pin....");
              }
           }

          
          else
          {
            System.out.println("You enter wrong card number....");
          }

         case 5:
            System.out.println("Please Remove your Debit Card...");
            Atm=false;
            }
            System.out.println();
        }

    }
}
*/
import java.util.Scanner;
class amount{
    private float a;
    private Scanner s=new Scanner(System.in);
    public void withdraw(float bal){
        System.out.println("Enter a amount to Withdraw:");
        float wa=s.nextFloat();
        if(wa>bal)
           System.out.println("there is only"+" "+bal+" "+"t0 withdraw. Enter a valid amount.");
        else
         { a=bal-wa;
          System.out.println("Withdraw successfull");
          System.out.printf("Your current balance is Rs %.2f\n",a);}
     }
     public void deposit(float bal){
        System.out.println("Enter a amount to Deposit:");
        float wa=s.nextFloat();
        a=bal+wa;
        System.out.println("Deposit successfull");
        System.out.printf("Your current balance is Rs %.2f\n",a);
     }
     public void balance(float bal){
        System.out.printf("Your current balance is Rs %.2f\n",bal);
    
     }
     public float getA() {
         return a;
     }  
}
public class ATM {
    public static void main(String[] args) {
        int c=0;
        float bal=1000;
        Scanner scan=new Scanner(System.in);
        System.out.println("Insert a card");
        amount obj=new amount();
        while(c!=4){
        System.out.println("====ATM Menu====\n1.Withdraw\n2.Deposit\n3.Check balance\n4.Exit");
        c=scan.nextInt();
        if(c==1)
         { obj.withdraw(bal);
          bal=obj.getA();}
        else if(c==2)
          {obj.deposit(bal);
          bal=obj.getA();}
        else if(c==3)
         { obj.balance(bal);
          bal=obj.getA();}
        else if(c==4)
          System.out.println("Thank you for using ATM");
        else
          System.out.println("Invalid. Enter a valid option");
        }
        scan.close();
        
    }
    
}

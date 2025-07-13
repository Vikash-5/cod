import java.util.Scanner;
public class School{
    public static void main(String[] args) {
      Scanner g=new Scanner(System.in);
      int c;
      StudentManagementSystem s=new StudentManagementSystem();
      do
       {System.out.println("------Menu------");
       System.out.println("1.Add student\n2.search student\n3.Display all student\n4.Remove student\n5.Exit");
       c=g.nextInt();
       switch (c) {
         case 1:
            s.addstudent(g);
            break;
         case 2:
            s.searchstudent(g);
            break;
         case 3:
            s.displaystudent();
            break;
         case 4:
            s.removestudent(g);
            break;
         case 5:
             System.out.println("Thank You");
             break;
         default:
            System.out.println("Invalid input. Enter a valid input");
            break;
         }
     }while(c!=5);
     g.close();
    }
}

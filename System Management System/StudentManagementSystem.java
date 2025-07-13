import java.util.Scanner;
import java.util.ArrayList;
public class StudentManagementSystem
{
  ArrayList<Student> st=new ArrayList<Student>(); 
  public void  addstudent(Scanner g)
  {   g.nextLine();
      System.out.println("Enter Student name:");
      String n=g.nextLine();
      System.out.println("Enter Student roll no:");
      String r=g.nextLine();
      System.out.println("Enter Student grade:");
      String G=g.nextLine();
      Student s=new Student(n,r,G);
      st.add(s);
      System.out.println("Added sucessfully");
  }
  public void searchstudent(Scanner g){
    g.nextLine();
    System.out.println("Enter the roll no:");
    String h=g.nextLine();
    boolean t=false;
    for(Student c: st)
    {
        if(c.roll.equalsIgnoreCase(h))
        {
            c.displayId();
            t=true;
            break;
        }
    }
    if(!t)
      System.out.println("Not found");
  }
  public void displaystudent()
  {
    if(st.isEmpty())
      System.out.println("Nothing found");
    else{  
    System.out.println("Displaying All Students");
    for(Student c:st){
       System.out.println("------------");
       c.displayId();
    }
    }
  }
  public void removestudent(Scanner g)
  { g.nextLine();
    System.out.println("Enter the roll no: ");
    String h=g.nextLine();
    boolean t=false;
    for(Student c: st)
    {
        if(c.roll.equalsIgnoreCase(h))
        {
            st.remove(c);
            t=true;
            System.out.println("Removed Successfuly");
            break;
        }
    }
    if(!t)
      System.out.println("Not found");
  }
}

import java.util.*;
class details
{
   public float percentage(float p,int n)
   {
    return (p/(n*100));
   }

   public String grade(float t)
    {
        if(90<=t && t<=100)
           return "S";
        else if(80<=t && t<90)
           return "A+";
        else if(70<=t && t<80)
           return "A";
        else if(60<=t && t<70)
           return "B+";
        else if(0<=t && t<60)
           return "B";
        else
           return "U";
    }
   
}
public class StudentGradeCalculator {
    public static void main(String arg[])
    {
        int m=0;
        System.out.println("Total Subjects");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the mark");
            int mark = s.nextInt();
            if (mark < 0 || mark > 100) 
                {System.out.println("Invalid mark. Please enter a mark between 0 and 100.");
                i--;}
            s.nextLine();
            System.out.println("Enter the Subject");
            String sub = s.nextLine();
            System.out.println(sub + "=" +mark);
            m+=mark;
        }
        System.out.println("total marks" +": "+ m);
        details obj = new details();
        float per= obj.percentage(m,n)*100;
        String b= obj.grade(per);
        System.out.printf("Percentage"+" "+"%.2f%%",per);
        System.out.println(); 
        System.out.println("Grade"+" "+b);
        s.close();
    }  
}

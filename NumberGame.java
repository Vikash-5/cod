import java.util.Scanner;
class GameConcept{
  public int play(int a,int score,int lr,int ur, Scanner s)
  {
    int cn= (int)(Math.random() * 100)+1;
    int i=0;
    while(0<a){
        System.out.println("You Have a attempt:"+a);
        System.out.println("Enter a guess between "+ lr+ " to "+ ur+" : ");
        int guessed= s.nextInt();
        if(cn==guessed)
        {
          System.out.println("You win!");
          score++;
          i++;
          break;
        }
        else if(cn<guessed)
          System.out.println("Too High");
        else
          System.out.println("Too Low");
        a--;
        i++;
      }
      System.out.println("The Correct Number is :"+cn);
      System.out.println("score:"+score+",Attempts:"+i);
      System.out.println("playagain? yes:no  ");
      return score;
  }
}   
public class Game{
 public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      int lr=1,ur=100;
      int a=4,score=0;
      GameConcept obj=new GameConcept();
      score=obj.play(a,score,lr,ur,s);
      String cl=s.next();
      while(cl.equals("yes")){
       if(cl.equals("yes"))
        { score=obj.play(a,score,lr,ur,s);
          String v=s.next();
          cl=v;       
        }
      }
      if (cl.equals("no"))
         System.out.println("Thanks for Playing");
      s.close();
    }
} 

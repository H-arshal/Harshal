import java.util.Random;
import java.util.Scanner; 
public class CWH_20_RPS_Game 
{
    public static void main(String[] args) 
    {
        int i=1,ysb=0,csb=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to our Rock,Paper,Scissor Game!!!");
        while(i<6)
        {
            System.out.println("Choose Your Action!!!!");
            System.out.print("Press 1 for Rock\nPress 2 for Paper\nPress 3 for Scissor\n4.Exit\nYour Action - ");
            int act=sc.nextInt();
            System.out.println("---------------------------------------------");
         
            Random rnd=new Random();
            int upperBond=3;
            int bot=rnd.nextInt(upperBond);          
        
        if(bot==0)
        {
            System.out.println("Computer - Rock");
            if(act==1)
            {
                System.out.println("Yours - Rock");
                System.out.println("Oops!!Similar Action,Please try again!!!");
                System.out.println("---------------------------------------------");
            }
            else if(act==2)
            {
                System.out.println("Yours - Paper");
                System.out.println("You Wins!!!!!!!");
                ysb++;
                System.out.println("---------------------------------------------");
            }
            else if(act==3)
            {
                System.out.println("Yours - Scissor");
                System.out.println("Computer Wins!!!!!!");
                csb++;
                System.out.println("---------------------------------------------");
            }
        }
        else if(bot==1)
        {
            System.out.println("Computer - Paper");
            if(act==1)
            {
                System.out.println("Yours - Rock");
                System.out.println("Computer wins!!!!!!!");
                csb++;
                System.out.println("---------------------------------------------");
            }
            else if(act==2)
            {
                System.out.println("Yours - Paper");
                System.out.println("Oops!!Similar Action,Please try again!!!");
                System.out.println("---------------------------------------------");
            }
            else if(act==3)
            {
                System.out.println("Yours - Scissor");
                System.out.println("You win!!!!!!!!");
                ysb++;
                System.out.println("---------------------------------------------");
            }
        }
        else if(bot==2)
        {
            System.out.println("Computer - Scissor");
            if(act==1)
            {
                System.out.println("Yours - Rock");
                System.out.println("You wins!!!!!!!");
                ysb++;
                System.out.println("---------------------------------------------");
            }
            else if(act==2)
            {
                System.out.println("Yours - Paper");
                System.out.println("Computer wins!!!!!!!");
                csb++;
                System.out.println("---------------------------------------------");
            }
            else if(act==3)
            {
                System.out.println("Yours - Scissor");
                System.out.println("Oops!!Similar Action,Please try again!!!");
                System.out.println("---------------------------------------------");
            }
            
        }
        if(act==4)
            {
                break;
            }
        
        System.out.println("Score Board\nComputer Score - "+csb+"\nYour Score - "+ysb);
        System.out.println("---------------------------------------------\n");
        i++;
    }
    
    {sc.close();}
}
}

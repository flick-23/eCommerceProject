import java.io.*;
import java.util.*;
import java.lang.*;

class Feedback
{
    String email,name,add,food,ans,serve,comp;
    long con1,con2,rate;
    BufferedReader venki = new BufferedReader(new InputStreamReader(System.in));
        void data()throws IOException
        {
            System.out.println("\n\t\t\t\tIT WILL BE GREATFUL IF YOU LEAVE US A FEEDBACK FOR OUR IMPROVEMENT");
            System.out.println("\nYOUR NAME:");
            name=venki.readLine();
            System.out.println("\nADDRESS:");
            add=venki.readLine();
            System.out.println("\nCONTACT NO.1:");
            con1=Long.parseLong(venki.readLine());
            System.out.println("\nCONTACT NO.2:");
            con2=Long.parseLong(venki.readLine());
            System.out.println("\nEMAIL ID:");
            email=venki.readLine();
            System.out.println("HOW WAS OUR FOOD:-");
            food=venki.readLine();
            System.out.println("\nWHAT DO YOU FEEL ABOUT OUR SERVICE:-");
            serve=venki.readLine();
            System.out.println("ON A SCALE OF 1 TO 10 HOW MUCH WOULD YOU RATE YOUR OVERALL EXPERIENCE WITH US ?");
            rate = Integer.parseInt(venki.readLine());
            System.out.println("\nIF ANY COMPLAIN:-");
            comp=venki.readLine();
            System.out.println("\n\t\t\t\t\t\t***THANK YOU***");
            System.out.println("\t\t\tTO EXIT THE MULTI CUISINE RESTAURANT, ENTER THE WORD 'QUIT' OR JUST PRESS 'Q'");
            ans=venki.readLine();
            if(ans.equalsIgnoreCase("quit")||ans.equalsIgnoreCase(" quit")||ans.equalsIgnoreCase("quit ")||ans.equalsIgnoreCase("q"))
            {
                System.out.println("\t\t\t\t"+name+" THANKS FOR VISITING MULTI CUISINE COYA RESTAURANT!!!");
                  
                System.out.println("\t\t\t\t\tYOUR PLEASURE OUR COMFORT!!!");
                  
                System.out.println("\t\t\t\t\tPLEASE VISIT AGAIN!!!");
                System.exit(0);
            }
            else 
            {
                System.out.println("WRONG INPUT!");
                  
                System.out.println("TO EXIT THE MULTI CUISINE RESTAURANT, ENTER THE WORD 'QUIT' OR JUST PRESS 'Q'");
                ans= venki.readLine();
                System.out.println("\t\t\t\t"+name+" THANKS FOR VISITING MULTI CUISINE COYA RESTAURANT!!!");
                System.out.println("\t\t\t\t\tYOUR PLEASURE OUR COMFORT!!!");
                  
                System.out.println("\t\t\t\t\tPLEASE VISIT AGAIN!!!");
                System.exit(0);
            }
        }   
}

class Projectmc
{
    public static void main(String[]args)throws IOException
    {
        Feedback f = new Feedback();
        f.data();
    }
}
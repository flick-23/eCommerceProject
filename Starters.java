import java.io.*;
import java.util.*;
import java.lang.*;
class Starters
{
    int mainChoice;
    int veg,nonVeg,papad,soup;
    int qveg,qnonVeg,qpapad,qsoup;
    Scanner venki = new Scanner(System.in);
    int amount=0;
    void mainDisplay()
    {
        System.out.println("Welcome to the Starters Menu!");
        System.out.println("Choose your item from the below menu-");
        System.out.println("1.Veg Starters");
        System.out.println("2.Non Veg Starters");
        System.out.println("3.Papads");
        System.out.println("4.Soups");
        System.out.println("5.EXIT Starters Menu");
    }

    void vegDisplay()
    {
        System.out.println("Welcome to the Veg starters");
        System.out.println("STARTERS:\t\t\t\t Rs.");
        System.out.println("1.PANEER TIKKA\t\t\t\t 130");   
        System.out.println("2.VEG SEEKH KEBAB\t\t\t 120"); 
        System.out.println("3.HARA BHARA KEBAB\t\t\t 110");
        System.out.println("4.SHANGHAI SPRING ROLL\t\t\t 150");
        System.out.println("5.AMERICAN CORN BALL\t\t\t 150");
        System.out.println("6.CRISPY AMERICAN CORN\t\t\t 140");
        System.out.println("7.CRISPY BABY CORN\t\t\t 140");
        System.out.println("8.CRISPY MUSHROOM\t\t\t 125");
        System.out.println("9.CRISPY CHILLY POTATO\t\t\t 120");
        System.out.println("10.CRISPY CHILLY CHANA\t\t\t 150");
        System.out.println("0.EXIT Veg starters");
    }

    void nonVegDisplay()
    {
        System.out.println("Welcome to the Non-Veg starters");
        System.out.println("STARTERS:\t\t\t\t Rs.");
        System.out.println("1.CHICKEN TIKKA\t\t\t\t 170");
        System.out.println("2.MURG RESHMI KEBAB\t\t\t 170");
        System.out.println("3.MURG CHILLI KEBAB\t\t\t 160");
        System.out.println("4.CHICKEN SEEKH KEBAB\t\t\t 180");
        System.out.println("5.TANGDI KEBAB\t\t\t\t 180");
        System.out.println("6.MURG TANDOORI\t\t\t\t 190");
        System.out.println("7.FISH AJWANI TIKKA\t\t\t 190");
        System.out.println("8.CHILLI CHICKEN\t\t\t 160");
        System.out.println("9.DRUMS OF HEAVEN\t\t\t 180");
        System.out.println("10.SHANGHI CHICKEN\t\t\t 180");
        System.out.println("0.EXIT the Non Veg starters");
    }

    void papadDisplay()
    {
        System.out.println("Welcome to the Papad starters");
        System.out.println("STARTERS:\t\t\t\tRs.");
        System.out.println("1.PLAIN PAPAD\t\t\t\t20");
        System.out.println("2.MASALA PAPAD\t\t\t\t30");
        System.out.println("3.PAPADI CHAT\t\t\t\t30");
        System.out.println("4.GARLIC PAPAD\t\t\t\t25");
        System.out.println("5.SADBAHAR PAPAD\t\t\t30");
        System.out.println("0.EXIT the Papad starters");
    }

    void soupsDisplay()
    {
        System.out.println("Welcome to the Soup starters");
        System.out.println("STARTERS:\t\t\t\tRs.");
        System.out.println("1.MANCHOW SOUP\t\t\t\t90");
        System.out.println("2.HOT N SOUR SOUP\t\t\t80");
        System.out.println("3.TOMATO SOUP\t\t\t\t75");
        System.out.println("4.SWEET CORN SOUP\t\t\t80");
        System.out.println("5.BABY CORN SOUP\t\t\t90");
        System.out.println("0. EXIT the Soup Menu");
    }
    int calculate(int quantity,int price[],int item)
    {
        System.out.println("Do you want to order more veg startes?");
        System.out.println("Enter the item number to order OR Press 0 to EXIT the veg starters menu!");
        int amt = quantity*price[item];
        return amt;
    }
    int order(int x)
    {
        mainDisplay();
       do{
            mainChoice = venki.nextInt();
            switch(mainChoice)
            {
                case 1:
                     vegDisplay();
                    do{
                        int vprice[]={130,120,110,150,150,140,140,125,120,150};
                        veg = venki.nextInt();
                        if(veg==0)
                            break;
                        System.out.println("Enter the quantity of the item");
                        qveg = venki.nextInt();
                        amount += calculate(qveg,vprice,veg-1);
                    }while(veg!=0);
                    mainDisplay();
                break;

                case 2:
                    nonVegDisplay();
                    do{
                        int nvprice[]={170,170,160,180,180,190,190,160,180,180};    
                        nonVeg = venki.nextInt();
                        if(nonVeg==0)
                            break;
                        System.out.println("Enter the quantity of the item");
                        qnonVeg = venki.nextInt();
                        amount += calculate(qnonVeg,nvprice,nonVeg-1);
                    }while(nonVeg!=0);
                    mainDisplay();
                break;
                
                case 3:
                     papadDisplay();
                    do{
                        int pprice[]={20,30,30,25,30};
                        papad = venki.nextInt();
                        if(papad==0)
                            break;
                        System.out.println("Enter the quantity of the item");
                        qnonVeg = venki.nextInt();
                        amount += calculate(qpapad,pprice,papad-1);
                    }while(papad!=0);
                    mainDisplay();
                 break;

                 case 4:
                  soupsDisplay();
                    do{
                            int psoup[]={90,80,75,80,90};
                            soup = venki.nextInt();
                            if(soup==0)
                                break;
                            System.out.println("Enter the quantity of the item");
                            qsoup = venki.nextInt();
                            amount += calculate(qsoup,psoup,soup-1);
                        }while(soup!=0);
                    mainDisplay();
                break;
                case 5:
                    System.out.println("STARTERS COMPLETED! Do checkout our Main Courses & Beverages");
                break;
                default:
                    System.out.println("INVALID INPUT!!! Kindly enter the item number only.");
            }
       }while(mainChoice!=5);
       return amount+x;
    }

}
class projectmc{
    public static void main(String[] args) {
        System.out.println("Main class!");
        int totalamount = 0;
        Starters s = new Starters();
        totalamount = s.order(totalamount);
        System.out.println("BILL : "+totalamount);
    }
}
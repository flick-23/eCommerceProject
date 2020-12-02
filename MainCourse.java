import java.util.Scanner;

//Maincourse Class
class mainCourse{
    Scanner in=new Scanner(System.in);
    int dishNo,dishQuantity=1,amount=0,choice;

    void courseDisplay(){
        System.out.println("\t\t\t\t\t**\"WELCOME TO MAIN COURSE\"**");
        System.out.println("Choose your item from the below menu-");
        System.out.println("1.Vegetarian Main Course.");
        System.out.println("2.Non Vegetarian Main Course.");
        System.out.println("3.EXIT Main Course Menu.");
    }
    void vegMenu(){
        System.out.println("\t\tHere is our Indian Vegetarian Main course menu:");
            System.out.println("\nINDIAN VEG DISHES:\t\t\t\t\tRs.");
            System.out.println("1. SHAHI PANEER\t\t\t\t\t\t200");
            System.out.println("2. NAVRATAN KORMA\t\t\t\t\t180");
            System.out.println("3. KADAHI PANEER\t\t\t\t\t190");
            System.out.println("4. MALAI KOFTA\t\t\t\t\t\t170");
            System.out.println("5. KADAHI VEGETABLES\t\t\t\t\t165");
            System.out.println("6. VEGETABLE PAKEEZA\t\t\t\t\t160");
            System.out.println("7. SHABNAM CURRY\t\t\t\t\t170");
            System.out.println("8. MAKAI CORN PALAK\t\t\t\t\t165");
            System.out.println("9. VEG PULAO\t\t\t\t\t\t175");
            System.out.println("10.KASHMIRI PULAO\t\t\t\t\t190");
            System.out.println("11.BUTTER NAAN\t\t\t\t\t\t60");
            System.out.println("12.STUFFED KULCHA\t\t\t\t\t165");
            System.out.println("0.EXIT Vegetarian Main course menu");
    }
    void nvegMenu(){
        System.out.println("\t\tHere is our Indian Non-Vegetarian Main course menu:");
            System.out.println("\nINDIAN NON VEG DISHES:\t\t\t\t\tRs.");
            System.out.println("1.CHICKEN TIKKA MASALA\t\t\t\t\t210");
            System.out.println("2.CHICKEN TIKKA LABADAR\t\t\t\t\t230");
            System.out.println("3.CHICKEN BHARTA\t\t\t\t\t200");                
            System.out.println("4.KADAHI CHICKEN\t\t\t\t\t235");
            System.out.println("5.MUGHLAI CHICKEN\t\t\t\t\t250");
            System.out.println("6.MURG NAVRATAN KURMA\t\t\t\t\t250");
            System.out.println("7.CHICKEN DO PYAZA\t\t\t\t\t240");
            System.out.println("8.MURG MASALLAM\t\t\t\t\t\t215");
            System.out.println("9.MUTTON ROGAN JOSH\t\t\t\t\t200");
            System.out.println("10.PRON MALAI CURRY\t\t\t\t\t260");
            System.out.println("11.FISH SARSOWALA\t\t\t\t\t220");
            System.out.println("12.FISH DHANIAWALA\t\t\t\t\t210");
            System.out.println("0.EXIT Non-Vegetarian Main course menu");
    }
    int calculate(int quantity,int price[],int item){
        System.out.println("Do you want to order more ?");
        System.out.println("Enter the item number to order OR Press 0 to EXIT the menu!");
        int amt = quantity*price[item];
        return amt;
    }
    //Method for ordering maincourse
    int order(int totalamount){
        courseDisplay();
        do{
             choice = in.nextInt();
             switch(choice)
             {
                 case 1:
                      vegMenu();
                     do{
                         int vprice[]={200,180,190,170,165,160,170,165,175,190,60,165};
                         System.out.println("Enter the item number you would like order: ");
                         dishNo = in.nextInt();
                         if(dishNo==0)
                             break;
                         System.out.println("Enter the quantity of the item");
                         dishQuantity = in.nextInt();
                         amount += calculate(dishQuantity,vprice,dishNo-1);
                     }while(dishNo!=0);
                     courseDisplay();
                 break;
 
                 case 2:
                     nvegMenu();
                     do{
                         int nvprice[]={210,230,200,235,250,250,240,215,200,260,220,210};    
                         System.out.println("Enter the item number you would like order: ");
                         dishNo = in.nextInt();
                         if(dishNo==0)
                             break;
                         System.out.println("Enter the quantity of the item");
                         dishQuantity = in.nextInt();
                         amount += calculate(dishQuantity,nvprice,dishNo-1);
                     }while(dishNo!=0);
                     courseDisplay();
                 break;
                 case 3:
                    System.out.println("Do checkout our Desserts & Beverages!!");
                break;
                default:
                    System.out.println("INVALID INPUT!!! Kindly enter the item number only.");
            }
       }while(choice!=3);
       return (amount+totalamount);
    }
}


public class projectmc{
    public static void main(String[] args) {
        //totalamount is the amount got from starters!!
        int totalamount=0;
        mainCourse mc=new mainCourse();
        totalamount=mc.order(totalamount);
        System.out.println(totalamount);
    }
}

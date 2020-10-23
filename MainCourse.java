import java.util.Scanner;

//Maincourse Class
class mainCourse{
    int dishNo,dishQuantity=1,amount;
    String typeofCourse,choice="Y";
    //Method for ordering maincourse
    int order(int totalamount){
        Scanner in=new Scanner(System.in);
        System.out.println("\t\t\t\t\t**\"WELCOME TO MAIN COURSE\"**");
        System.out.println("\t\t\tENTER 'V' FOR INDIAN VEG DISHES, 'NV' FOR INDIAN NON VEG DISHES");;   
        typeofCourse=in.nextLine();
        //Veg maincourse
        if(typeofCourse.equalsIgnoreCase("V")){
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
            while(choice.equalsIgnoreCase("Y")){
                System.out.println("\nCHOOSE YOUR MAIN VEG COURSE FROM THE LIST BY ENTERING NO. ");
                dishNo=in.nextInt();
                System.out.println("\nEnter the quantity of the dish you selected:");
                dishQuantity=in.nextInt();
                if(dishNo==1)
                    amount=dishQuantity*200;
                if(dishNo==2)
                    amount=dishQuantity*180;
                if(dishNo==3||dishNo==10)
                    amount=dishQuantity*190;
                if(dishNo==4||dishNo==7)
                    amount=dishQuantity*170;
                if(dishNo==5||dishNo==8||dishNo==12)
                    amount=dishQuantity*165;
                if(dishNo==6)
                    amount=dishQuantity*160;
                if(dishNo==9)
                    amount=dishQuantity*175;
                if(dishNo==11)
                    amount=dishQuantity*160;
                totalamount+=amount;
                System.out.println("DO YOU WANT TO PLACE MORE ORDER ? ENTER Y/N");
                choice=in.next();
            }
        }
        //Nonveg maincourse
        if(typeofCourse.equalsIgnoreCase("NV")){
            System.out.println("\t\tHere is our Indian Vegetarian Main course menu:");
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
             while(choice.equalsIgnoreCase("Y")){
                System.out.println("\nCHOOSE YOUR MAIN VEG COURSE FROM THE LIST BY ENTERING NO. ");
                dishNo=in.nextInt();
                System.out.println("\nEnter the quantity of the dish you selected:");
                dishQuantity=in.nextInt();
                if(dishNo==1||dishNo==12)
                    amount=dishQuantity*210;
                if(dishNo==2)
                   amount=dishQuantity*230;
                if(dishNo==3||dishNo==9)
                    amount=dishQuantity*200;
                if(dishNo==4)
                    amount=dishQuantity*235;
                if(dishNo==5||dishNo==6)
                    amount=dishQuantity*250;
                if(dishNo==7)
                    amount=dishQuantity*240;
                if(dishNo==8)
                    amount=dishQuantity*215;
                if(dishNo==10)
                    amount=dishQuantity*260;
                if(dishNo==11)
                    amount=dishQuantity*220;
                totalamount+=amount;
                System.out.println("DO YOU WANT TO PLACE MORE ORDER ? ENTER Y/N");
                choice=in.next();
             }
        }
        return totalamount;
    }
}

public class projectmc{
    public static void main(String[] args) {
        //totalamount is the amount got from starters!!
        int totalamount=0;
        mainCourse mc=new mainCourse();
        totalamount=mc.order(totalamount);
    }
}
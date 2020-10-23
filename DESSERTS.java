
package javaproject;

import java.util.Scanner;

//Desserts Class
class Desserts{
    int dishNo,dishQuantity=1,amount;
    String typeofCourse,choice="Y";
    //Method for ordering maincourse
    int order(int totalamount){
        Scanner in=new Scanner(System.in);
        System.out.println("\t\t\t\t\t**\"WELCOME TO DESSERTS MENU\"**");
        System.out.println("\t\t\tENTER 'I' FOR ICE CREAMS, 'P' FOR PIE, 'C' FOR CAKES, 'S' FOR SWEETS");
        typeofCourse=in.nextLine();
        //Ice Creams
        if(typeofCourse.equalsIgnoreCase("I")){
            System.out.println("\t\tHere is our ICE CREAMS menu:");
            System.out.println("\nICE CREAMS:\t\t\t\t\t\tRs.");
            System.out.println("1. BUTTERSCOTCH\t\t\t\t\t\t40");
            System.out.println("2. CHOCOLATE ICE CREAM\t\t\t\t\t30");
            System.out.println("3. STRAWBERRY ICE CREAME\t\t\t\t50");
            System.out.println("4. VANILLA ICE CREAM\t\t\t\t\t45");
            System.out.println("5. MANGO ICE CREAM\t\t\t\t\t30");
            System.out.println("6. MINT CHOCOLATE CHIP\t\t\t\t\t40");
            System.out.println("7. BANANA PEANUT BUTTER RIPPLE\t\t\t\t50");
            
            while(choice.equalsIgnoreCase("Y")){
                System.out.println("\nCHOOSE YOUR ICE CREAM FROM THE LIST BY ENTERING NO. ");
                dishNo=in.nextInt();
                System.out.println("\nEnter the quantity of the dish you selected:");
                dishQuantity=in.nextInt();
                if(dishNo==1||dishNo==6)
                    amount=dishQuantity*40;
                if(dishNo==2||dishNo==5)
                    amount=dishQuantity*30;
                if(dishNo==3||dishNo==7)
                    amount=dishQuantity*50;
                if(dishNo==4)
                    amount=dishQuantity*45;
                totalamount+=amount;
                System.out.println("DO YOU WANT TO PLACE MORE ORDER ? ENTER Y/N");
                choice=in.next();
            }
        }
        //Pie Dishes
        if(typeofCourse.equalsIgnoreCase("P")){
            System.out.println("\t\tHere is our PIE menu:");
            System.out.println("\nPIE DISHES:\t\t\t\t\tRs.");
            System.out.println("1.EGG PIE\t\t\t\t\t70");
            System.out.println("2.STRAWBERRY PIE\t\t\t\t\t90");
            System.out.println("3.CHERRY PIE\t\t\t\t\t80");                
            System.out.println("4.BLUEBERRY PIE\t\t\t\t\t90");
            System.out.println("5.PUMPKIN PIE\t\t\t\t\t70");
            System.out.println("6.APPLE PIE\t\t\t\t\t60");
             while(choice.equalsIgnoreCase("Y")){
                System.out.println("\nCHOOSE YOUR PIE FROM THE LIST BY ENTERING NO. ");
                dishNo=in.nextInt();
                System.out.println("\nEnter the quantity of the dish you selected:");
                dishQuantity=in.nextInt();
                if(dishNo==1||dishNo==5)
                    amount=dishQuantity*70;
                if(dishNo==6)
                   amount=dishQuantity*60;
                if(dishNo==2||dishNo==4)
                    amount=dishQuantity*90;
                if(dishNo==3)
                    amount=dishQuantity*80;
                totalamount+=amount;
                System.out.println("DO YOU WANT TO PLACE MORE ORDER ? ENTER Y/N");
                choice=in.next();
             }
        }
         if(typeofCourse.equalsIgnoreCase("C")){
            System.out.println("\t\tHere is the CAKES menu:");
            System.out.println("\nCAKES:\t\t\t\t\tRs.");
            System.out.println("1. CRANBERRY COFFEE CAKE\t\t\t\t\t\t150");
            System.out.println("2. CHOCOLATE CAKE\t\t\t\t\t180");
            System.out.println("3. STRAWBERRY CAKE\t\t\t\t\t160");
            System.out.println("4. CARROT CAKE\t\t\t\t\t\t150");
            System.out.println("5. SPONGE CAKE\t\t\t\t\t160");
            System.out.println("6. PUMPKIN DUMP CAKE\t\t\t\t\t170");
            System.out.println("7. BISCUIT CAKE\t\t\t\t\t180");
            
            while(choice.equalsIgnoreCase("Y")){
                System.out.println("\nCHOOSE YOUR CAKE FROM THE LIST BY ENTERING NO. ");
                dishNo=in.nextInt();
                System.out.println("\nEnter the quantity of the dish you selected:");
                dishQuantity=in.nextInt();
                if(dishNo==1||dishNo==4)
                    amount=dishQuantity*150;
                if(dishNo==2||dishNo==7)
                    amount=dishQuantity*180;
                if(dishNo==3||dishNo==5)
                    amount=dishQuantity*160;
                if(dishNo==6)
                    amount=dishQuantity*170;
                totalamount+=amount;
                System.out.println("DO YOU WANT TO PLACE MORE ORDER ? ENTER Y/N");
                choice=in.next();
            }
        }
          if(typeofCourse.equalsIgnoreCase("S")){
            System.out.println("\t\tHere is our SWEETS menu:");
            System.out.println("\nSWEETS:\t\t\t\t\tRs.");
            System.out.println("1. GULAB JAMUN\t\t\t\t\t\t80");
            System.out.println("2. KAJU BARFI\t\t\t\t\t50");
            System.out.println("3. SHRIKHAND\t\t\t\t\t50");
            System.out.println("4. RASGULLA\t\t\t\t\t\t65");
            System.out.println("5. GAJAR HALWA\t\t\t\t\t70");
            System.out.println("6. MYSORE PAK\t\t\t\t\t50");
            System.out.println("7. SHEER KORMA\t\t\t\t\t80");
            
            while(choice.equalsIgnoreCase("Y")){
                System.out.println("\nCHOOSE YOUR SWEETS FROM THE LIST BY ENTERING NO. ");
                dishNo=in.nextInt();
                System.out.println("\nEnter the quantity of the dish you selected:");
                dishQuantity=in.nextInt();
                if(dishNo==1||dishNo==7)
                    amount=dishQuantity*80;
                if(dishNo==2||dishNo==3||dishNo==6)
                    amount=dishQuantity*50;
                if(dishNo==4)
                    amount=dishQuantity*65;
                if(dishNo==5)
                    amount=dishQuantity*70;
                totalamount+=amount;
                System.out.println("DO YOU WANT TO PLACE MORE ORDER ? ENTER Y/N");
                choice=in.next();
            }
        }
        return totalamount;
    }
}

public class JavaProject{
    public static void main(String[] args) {
        //totalamount is the amount got from Desserts!!
        int totalamount=0;
        Desserts ds=new Desserts();
        totalamount=ds.order(totalamount);
    }
}
import java.io.*;
import java.lang.*;
import java.util.*;

//This class handles all the queries for choice of beverages
class Beverages {

	
	int amount,dishquantity=1,dishno;
	String Choice;
	int order(int totalamount) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("\t\t\t\t\tWELCOME TO BEVERAGE MENU");
		System.out.println("\t\t\tENTER J FOR JUICE , C FOR COFFE ,TEA AND WATER ,S FOR SOFT DRINKS , W FOR WINE , B FOR  BEER , E FOR ENERGY DRINKS , COCKTAILS AND CHAMPAGNE AND P FOR SPIRIT DRINKS");
		String typeofCourse = in.nextLine();
		
		//juice menu
		if(typeofCourse.equalsIgnoreCase("J"))
		{
			System.out.println("\t\tHere is our juice menu :\n");
			System.out.println("\nJUICES : \t\t\t\t\t Rs :");
			System.out.println("1.      Freshly squeesed orange , grapefruit juice\t\t\t\t\t24"); 
			System.out.println("2.      Chilled apple , cranberry , pineapple , tomato , pomogrante\t\t\t\t\t21");
			System.out.println("3.      Watermelon juice\t\t\t\t\t24");
			System.out.println("4.      veggie cocktail\t\t\t\t\t8");
			System.out.println("\nMINERAL WATER : \t\t\t\t\t Rs :");
			System.out.println("5.      Small bottle\t\t\t\t\t4");
			System.out.println("6.      Large bottle\t\t\t\t\t7");
			do {
			System.out.println("Choose your juice from the list by entering no :");
			dishno=in.nextInt();
			System.out.println("\nEnter the quantity of the dish you selected :");
			dishquantity=in.nextInt();
			if(dishno==1 || dishno==3)
			{
				amount=dishquantity*24;
			}
			if(dishno==2)
			{
				amount=dishquantity*21;
			}
			if(dishno==4)
			{
				amount=dishquantity*8;
			}
			if(dishno==5)
			{
				amount=dishquantity*4;
			}
			if(dishno==6)
			{
				amount=dishquantity*7;
			}
			totalamount=totalamount+amount;
			System.out.println("DO YOU WANT TO PLACE MORE ORDERS ? ENTER Y FOR YES AND N FOR NO");
			Choice =in.next();
			}
			while(Choice.equalsIgnoreCase("Y"));
		}
		
		if(typeofCourse.equalsIgnoreCase("C"))
		{
			System.out.println("\t\tHere is our coffee menu :\n");
			System.out.println("COFFEE : \t\t\t\t\t Rs :");
			System.out.println("1.      small size cup\t\t\t\t\t9");
			System.out.println("2.      large size cup\t\t\t\t\t11");
			System.out.println("3.      French coffee press\t\t\t\t\t12");
			System.out.println("TEA  : \t\t\t\t\t Rs :");
			System.out.println("4.      small size cup\t\t\t\t\t6");
			System.out.println("5.      large size cup\t\t\t\t\t8");
			System.out.println("HOT OR COLD CHOCOLATE : \t\t\t\t\t Rs :");
			System.out.println("6.      small size cup\t\t\t\t\t7");
			System.out.println("7.      large size cup\t\t\t\t\t9");
			do
			{
				System.out.println("choose ur drink from the list by entering no :");
				dishno=in.nextInt();
				System.out.println("\nEnter the quantity of the drink you selected :");
				dishquantity=in.nextInt();
				if(dishno==1 || dishno==7)
				{
					amount=dishquantity*9;
				}
				if(dishno==2)
				{
					amount=dishquantity*11;
				}
				if(dishno==3)
				{
					amount=dishquantity*12;
				}
				if(dishno==4)
				{
					amount=dishquantity*6;
				}
				if(dishno==5)
				{
					amount=dishquantity*8;
				}
				if(dishno==6)
				{
					amount=dishquantity*7;
				}
				totalamount=totalamount+amount;
				System.out.println("DO YOU WANT TO PLACE MORE ORDERS ? ENTER Y FOR YES AND N FOR NO");
				Choice =in.next();
			}
			while(Choice.equalsIgnoreCase("Y"));
		}
		
		if(typeofCourse.equalsIgnoreCase("S"))
		{
			System.out.println("\t\tHere is our soft drinks menu :\n");
			System.out.println("SOFT DRINKS : \t\t\t\t\t Rs :");
			System.out.println("1.     Coca cola\t\t\t\t\t4");
			System.out.println("2.     Diet coke\t\t\t\t\t4");
			System.out.println("3.     Ginger ale\t\t\t\t\t4");
			System.out.println("4.     Sprite\t\t\t\t\t4");
			System.out.println("5.     Tonic\t\t\t\t\t4");
			System.out.println("6.     Club soda\t\t\t\t\t4");
			do
			{
				System.out.println("choose ur drink from the list by entering no :");
				dishno=in.nextInt();
				System.out.println("\nEnter the quantity of the drinks you selected :");
				dishquantity=in.nextInt();
				if(dishno==1 || dishno==2 || dishno==3 || dishno==4 || dishno==5 || dishno==6 )
				{
					amount=dishquantity*4;
				}
				totalamount=totalamount+amount;
				System.out.println("DO YOU WANT TO PLACE MORE ORDERS ? ENTER Y FOR YES AND N FOR NO");
				Choice =in.next();
			}
			while(Choice.equalsIgnoreCase("Y"));
		}
		
		if(typeofCourse.equalsIgnoreCase("W"))
		{
			System.out.println("\t\tHere is our wine drinks menu :\n");
			System.out.println("WHITE WINE : \t\t\t\t\t Rs :");
			System.out.println("1.     Riesling\t\t\t\t\t40");
			System.out.println("2.     Squvignan Blanc\t\t\t\t\t50");
			System.out.println("3.     Chordamay\t\t\t\t\t40");
			System.out.println("4.     Pinot Griglo\t\t\t\t\t38");
			System.out.println("RED WINE : \t\t\t\t\t Rs :");
			System.out.println("5.     Carbernet Savvignan\t\t\t\t\t40");
			System.out.println("6.     Meriot\t\t\t\t\t40");
			System.out.println("7.     Bardeaux\t\t\t\t\t62");
			System.out.println("8.     Malbex\t\t\t\t\t46");
			System.out.println("9.     Pinot Noir\t\t\t\t\t54");
			System.out.println("ROSE WINE : \t\t\t\t\t Rs :");
			System.out.println("10.    Bordeaux\t\t\t\t\t48");
			do
			{
				System.out.println("choose ur drink from the list by entering no :");
				dishno=in.nextInt();
				System.out.println("\nEnter the quantity of the drinks you selected :");
				dishquantity=in.nextInt();
				if(dishno==1 || dishno==3 || dishno==5 || dishno==6)
				{
					amount=dishquantity*40;
				}
				if(dishno==2)
				{
					amount=dishquantity*50;
				}
				if(dishno==4)
				{
					amount=dishquantity*38;
				}
				if(dishno==7)
				{
					amount=dishquantity*62;
				}
				if(dishno==8)
				{
					amount=dishquantity*46;
				}
				if(dishno==9)
				{
					amount=dishquantity*54;
				}
				if(dishno==10)
				{
					amount=dishquantity*48;
				}
				totalamount=totalamount+amount;
				System.out.println("DO YOU WANT TO PLACE MORE ORDERS ? ENTER Y FOR YES AND N FOR NO");
				Choice =in.next();
			}
			while(Choice.equalsIgnoreCase("Y"));
		}
		
		if(typeofCourse.equalsIgnoreCase("B"))
		{
			System.out.println("\t\tHere is our Beer drinks menu :\n");
			System.out.println("BEER : \t\t\t\t\t Rs :");
			System.out.println("1.     Corona\t\t\t\t\t80");
			System.out.println("2.     Stella Artois\t\t\t\t\t80");
			System.out.println("3.     Heineken\t\t\t\t\t80");
			System.out.println("4.     BLue Moon\t\t\t\t\t80");
			System.out.println("5.     Racer 5 IPA\t\t\t\t\t80");
			System.out.println("6.     Amstel Light\t\t\t\t\t80");
			System.out.println("7.     Budweiser\t\t\t\t\t70");
			System.out.println("8.     Budweiser Light\t\t\t\t\t70");
			System.out.println("9.     O'Douls Non Alcholic\t\t\t\t\t70");
			do
			{
				System.out.println("choose ur drink from the list by entering no :");
				dishno=in.nextInt();
				System.out.println("\nEnter the quantity of the drinks you selected :");
				dishquantity=in.nextInt();
				if(dishno==1 || dishno==2 || dishno==3 || dishno==4 || dishno==5 || dishno==6)
				{
					amount=dishquantity*80;
				}
				if(dishno==7 || dishno==8 || dishno==9)
				{
					amount=dishquantity*70;
				}
				totalamount=totalamount+amount;
				System.out.println("DO YOU WANT TO PLACE MORE ORDERS ? ENTER Y FOR YES AND N FOR NO");
				Choice =in.next();
			}
			while(Choice.equalsIgnoreCase("Y"));
		}
		
		if(typeofCourse.equalsIgnoreCase("E"))
		{
			System.out.println("\t\tHere is our drinks menu :\n");
			System.out.println("ENERGY DRINKS : \t\t\t\t\t Rs :");
			System.out.println("1.     Red Bull\t\t\t\t\t60");
			System.out.println("COCKTAIL : \t\t\t\t\t Rs");
			System.out.println("2.     Burban\t\t\t\t\t12");
			System.out.println("3.     Simple Syrup\t\t\t\t\t12");
			System.out.println("4.     Orange\t\t\t\t\t12");
			System.out.println("5.     Ongostura Bitter\t\t\t\t\t12");
			System.out.println("6.     Rum\t\t\t\t\t12");
			System.out.println("7.     Mint\t\t\t\t\t12");
			System.out.println("8.     Lime\t\t\t\t\t12");
			System.out.println("9.     Soda\t\t\t\t\t12");
			System.out.println("10.    Tequilla\t\t\t\t\t14");
			System.out.println("11.    Vodka\t\t\t\t\t16");
			do
			{
				System.out.println("choose ur drink from the list by entering no :");
				dishno=in.nextInt();
				System.out.println("\nEnter the quantity of the drinks you selected :");
				dishquantity=in.nextInt();
				if(dishno==1)
				{
					amount=dishquantity*60;
				}
				if(dishno==2 || dishno==3 || dishno==4 || dishno==5 || dishno==6 || dishno==7 || dishno==8 || dishno==9 )
				{
					amount=dishquantity*12;
				}
				if(dishno==10)
				{
					amount=dishquantity*14;
				}
				if(dishno==11)
				{
					amount=dishquantity*16;
				}
				totalamount=totalamount+amount;
				System.out.println("DO YOU WANT TO PLACE MORE ORDERS ? ENTER Y FOR YES AND N FOR NO");
				Choice =in.next();
			}
			while(Choice.equalsIgnoreCase("Y"));
		}
		
		if(typeofCourse.equalsIgnoreCase("P"))
		{
			System.out.println("\t\tHere is our drinks menu :\n");
			System.out.println("SPIRIT DRINKS : \t\t\t\t\t Rs :");
			System.out.println("1.     Ketel One Vodka\t\t\t\t\t15");
			System.out.println("2.     Grey Goose Vodka\t\t\t\t\t15");
			System.out.println("3.     Bombay Sapphire Gin\t\t\t\t\t15");
			System.out.println("4.     Don Julio Tequilla\t\t\t\t\t15");
			System.out.println("5.     Patron Silver Tequilla\t\t\t\t\t14");
			System.out.println("6.     Jameson 12 yr Whiskey\t\t\t\t\t16");
			System.out.println("7.     Gentleman Black Bourbon\t\t\t\t\t16");
			System.out.println("8.     Jahmie Walker Black Scotch\t\t\t\t\t16");
			System.out.println("9.     Hemessy VSOP\t\t\t\t\t16");
			System.out.println("10.    Ron Zaeaqa\t\t\t\t\t16");
			System.out.println("11.    Jack Daniels Single Barrel Whiskey\t\t\t\t\t18");
			System.out.println("12.    Hemessy\t\t\t\t\t49");
			System.out.println("13.    Bacardi Rum\t\t\t\t\t15");
			do
			{
				System.out.println("choose ur drink from the list by entering no :");
				dishno=in.nextInt();
				System.out.println("\nEnter the quantity of the drinks you selected :");
				dishquantity=in.nextInt();
				if(dishno==1 || dishno==2 || dishno==3 || dishno==4 || dishno==13)
				{
					amount=dishquantity*15;
				}
				if(dishno==5)
				{
					amount=dishquantity*14;
				}
				if(dishno==6 || dishno==7 ||  dishno==8 ||  dishno==9 ||  dishno==10  )
				{
					amount=dishquantity*16;
				}
				if(dishno==11)
				{
					amount=dishquantity*18;
				}
				if(dishno==12)
				{
					amount=dishquantity*49;
				}
				totalamount=totalamount+amount;
				System.out.println("DO YOU WANT TO PLACE MORE ORDERS ? ENTER Y FOR YES AND N FOR NO");
				Choice =in.next();
			}
			while(Choice.equalsIgnoreCase("Y"));
		}
		return totalamount;
	}
	
}


//This class handles all the queries related to bills

class Bill{
    String validThru,fullName,bankName,cardNo,remark;
    float vat=0.18f,enteredAmount,payableAmount;
    int choice,cvv,OTP,enteredOTP;
    long fromAccount,toAccount;
    double generateOTP;
    Scanner in =new Scanner(System.in);
    void paymentDetails(int totalamount){
        System.out.println("\t\t\t\t\t\tThanks For Ordering with us..!");
        System.out.println("Your amount: "+totalamount);
        System.out.println("GST - 18%");
        payableAmount=totalamount+totalamount*vat;
        payableAmount=Math.round(payableAmount);
    }

    void details(int starters,int mainCourse,int desserts,int beverages)
    {
        if(starters!=0)
            System.out.println("Total amount for STARTERS : "+starters);
        if(mainCourse!=0)
            System.out.println("Total amount for MAIN COURSE : "+mainCourse);
        if(desserts!=0)
            System.out.println("Total amount for DESSERTS : "+desserts);
        if(beverages!=0)
            System.out.println("Total amount for BEVERAGES : "+beverages);
        
    }

    void paymentConfimation(){
        do{
            System.out.println("Enter the amount you have to pay:");
            enteredAmount=in.nextFloat();
            if(enteredAmount!=(payableAmount)){
                System.out.println("ERROR!!");
                System.out.println("Wrong amount entered!!");
            }
        }while(enteredAmount!=(payableAmount));
    }
    void paymentoptions(){
        System.out.println("\nTotal amount to be paid: "+ payableAmount);
        System.out.println("\n\nHow would you like to pay-");
        System.out.println("1.Cash on Delivery");
        System.out.println("2.Card payment.");
        System.out.println("3.Net Banking.");
        System.out.println("Enter your Choice of payment method: ");
    }
    void cashPayment(){
        System.out.println("Amount PAID.");
        System.out.println("Thank You.. Visit Again..");
    }
    void cardPayment(){
        System.out.println("Enter your Card Number(XXXXXXXXXXXX): ");
        cardNo=in.next();
        System.out.println("Valid THRU: ");
        validThru=in.next();
        System.out.println("CVV: ");
        cvv=in.nextInt();
        System.out.println("Name on your card: ");
        fullName=in.next();
        System.out.println("An OTP is sent to you.");
        generateOTP=Math.random();
        while(generateOTP<=1000)
	    {
		generateOTP=generateOTP*10;
            }
        OTP=(int)generateOTP;
        System.out.println("Your OTP is "+OTP);
        do{
            System.out.println("Enter the OTP sent to you: ");
            enteredOTP=in.nextInt();
        }while(OTP!=enteredOTP);
        System.out.println("Please Wait......");
        System.out.println("Transaction Successful.");
        System.out.println("Thank You.. Visit Again..");
    }
    void netBanking(){
        System.out.println("Enter your Bank Name in short form: ");
        bankName=in.next();
        System.out.println("From Account: ");
        fromAccount=in.nextLong();
        System.out.println("To Account: ");
        toAccount=in.nextLong();
        System.out.println("Transaction Date: "+java.time.LocalDate.now());
        System.out.println("Remark : ");
        remark=in.next();
        System.out.println("Please Wait......");
        System.out.println("Transaction Successful.");
        System.out.println("Thank You.. Visit Again..");
    }
    void payment(int totalamount,int starters,int mainCourse,int desserts,int beverages){
        details(starters, mainCourse,desserts, beverages);
        paymentDetails(totalamount);
        paymentoptions();
        choice=in.nextInt();
        switch(choice){
            case 1: paymentConfimation();
                    cashPayment();
                    break;        
            case 2: paymentConfimation();
                    cardPayment();
                    break;
            case 3: paymentConfimation();
                    netBanking();
                    break;
            default: System.out.println("Invalid input! Kindly make a proper input.");
                        payment(totalamount,starters, mainCourse,desserts, beverages);            
        }
    }
}

//This class handles all the queries related to Dessert
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

//This class handles the calls related to feedback
class Feedback{
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

//This class handles all the calls related to main course
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

//This class handles all the calls related to starters
class Starters{
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

class Ecommerce{
    public static void main(String []args)
    {
        Scanner venki = new Scanner(System.in);
        int totalStarterAmount = 0, totalMainCouseAmount = 0, totalDessertsAmount = 0, totalBeveragesAmount = 0;

        int mainChoice;
        System.out.println("\n\n****************************************** WELCOME TO OUR RESTAURANT ******************************************");
        System.out.println("What would you like to start with ?");
        do{
            System.out.println("\n1.Starters\n.2.Main Course\n3.Desserts\n4.Beverages\n5.EXIT");
            mainChoice = venki.nextInt();
            switch(mainChoice)
            {
                case 1:
                totalStarterAmount = 0;
                Starters s = new Starters();
                totalStarterAmount = s.order(totalStarterAmount);
                break;

                case 2:
                mainCourse mc=new mainCourse();
                totalMainCouseAmount=mc.order(totalMainCouseAmount);
                break;

                case 3:
                Desserts ds=new Desserts();
                totalDessertsAmount  = ds.order(totalDessertsAmount );
                break;

                case 4:
                Beverages bv=new Beverages();
                totalBeveragesAmount = bv.order(totalBeveragesAmount);
            }
        }while(mainChoice!=5);

        Billing b=new Billing();
        int totalamount = totalStarterAmount + totalMainCouseAmount+ totalDessertsAmount + totalBeveragesAmount;
        b.payment(totalamount,totalStarterAmount, totalMainCouseAmount, totalDessertsAmount, totalBeveragesAmount);

        
    }
}
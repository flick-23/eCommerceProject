package projectmc;
import java.util.Scanner;

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
			System.out.println("choose ur juice from the list by entering no :");
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

public class beverages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int totalamount=0;
           Beverages bv=new Beverages();
           totalamount=bv.order(totalamount);
           
	}

}

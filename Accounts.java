package bill;
import java.util.Scanner;
import java.lang.Math;

class Account {
	 
	 Scanner in=new Scanner(System.in);
	 String userid , password,address,email,name;
	 double phoneNo;
	 int OTP;
	 int enteredotp,flag;
	 double generateotp;

	Account( String userid, String password, String address, String email, String name,double phoneNo) {
		
		this.userid = userid;
		this.password = password;
		this.address = address;
		this.email = email;
		this.name = name;
		this.phoneNo = phoneNo;
	}
	 
}


public class Accounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       Account[] a=new Account[10];
       int flag=1,enteredotp,count=0,i;
       System.out.println("\tEnter Y if account is already present and N to create a new account");
       String choice=in.next();
       if(choice.equalsIgnoreCase("Y"))
       {
    	   for(int j=0;flag!=1;j++)
    	   {
    		   System.out.println("\tEnter userid");
    		   String userid=in.next();
    		   System.out.println("\tEnter password");
    		   String password=in.next();
    		   System.out.println("\tAccount Login Succesful");  
    	   }
       }
       
       if(choice.equalsIgnoreCase("N"))
       {
    	    System.out.println("\tEnter your mobile number");
		    long  phoneNo=in.nextInt();
		    System.out.println("\tEnter your email id");
		    String email=in.next();
		    System.out.println("\tone OTP is generated and sent to the entered mobile number ");
		    double generateotp=Math.random();
		    while(generateotp<=1000)
		    {
		    	generateotp=generateotp*10;
		    }
		    int OTP=(int)generateotp;
		    System.out.println("\tYour OTP is :" +OTP);
		    do
		    {
		    	System.out.println("\tEnter the OTP sent to u");
		    	enteredotp=in.nextInt();
		    }
		    while(OTP!=enteredotp);
		    System.out.println("\tEntered OTP is correct");
		    System.out.println("\tEnter name");
		    String name=in.next();
		    System.out.println("\tEnter user id");
			String userid=in.next();
			System.out.println("\tEnter password , password should be more than 8 characters");
			String password=in.next();
			System.out.println("\tEnter your location");
			String address=in.next();
		    do 
		    {
		    	i=count;
				a[i]=new Account(userid,password,address,email,name,phoneNo);
				System.out.println("Account created succesfully");
				count++;
			}
		    while(i>count);
       }
	}
	}




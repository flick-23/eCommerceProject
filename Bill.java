import java.util.Scanner;

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
        System.out.println("Total amount to be paid: "+ payableAmount);
        System.out.println("How would you like to pay-");
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
    void payment(int totalamount){
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
                        payment(totalamount);            
        }
    }
}
public class projectBill {
    public static void main(String[] args) {
        int totalamount=450;
        Bill b=new Bill();
        b.payment(totalamount);
    }
}

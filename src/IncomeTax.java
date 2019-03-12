import java.util.Scanner;

class IncomeTax{
	public static void main(String args[]){

        	Scanner input=new Scanner(System.in);
      		float ctc;
     		float tax;
    		System.out.println("Enter your per month salary or ctc");
   		ctc=input.nextFloat();
     		input.close();
     		if(ctc*12>0 && ctc*12<180000){

     			System.out.println("you do not have to pay tax");

      		}

     		else  if(ctc*12>181001 && ctc*12<300000){

     			tax=(ctc*12*10)/100;
     			System.out.println("Tax: "+tax);

    		}

   	  	else if(ctc*12>300001 && ctc*12<500000){

       			tax=(ctc*12*20)/100;
     			System.out.println("Tax: "+tax);

    		}

     		else if(ctc*12>500001 && ctc*12<1000000){

        		tax=(ctc*12*30)/100;
        		System.out.println("Tax: "+tax);

     	  	}

     		else
    			System.out.println("");
       }


 }
import java.util.Scanner;
class Interest{
	public static void main(String args[]){
   		Scanner input=new Scanner(System.in);
   		double principle;
  		double rate;
  		double time;

   		System.out.println("Enter principle");
   		principle=input.nextDouble();
  		System.out.println("Enter rate of interest");
  		rate=input.nextDouble();
  		System.out.println("Enter principle");
  		time=input.nextDouble();

    		input.close();

     		double simpleInterest=(principle*rate*time)/100;
     		System.out.println("Simple Interest="+simpleInterest);
   
    		double compoundInterest=principle*Math.pow((1+rate/100),time);
    		 System.out.println("Compound Interest="+ compoundInterest);
 
 	 }

}


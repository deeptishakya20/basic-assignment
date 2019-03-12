import java.util.Scanner;
class Result{

	public static void main(String args[]){

   		Scanner input=new Scanner(System.in);
   		float maths;
  		float sicence;
  		float hindi;

  		System.out.println("Enter subject1 marks:");
    		maths=input.nextFloat(); 
     		System.out.println("Enter subject2 marks:");
      		sicence=input.nextFloat();
      		System.out.println("Enter subject3 marks:");
       		hindi=input.nextFloat();

       		 input.close();

  		 if((maths>60 && sicence>60)){

      			if(hindi>60){
      				System.out.println("Passed");
      		}

     		else{
      			System.out.println("Promoted");
      		}
     	}

   		 else if((sicence>60 && hindi>60)||(maths>60 && hindi>60))

     			System.out.println("Promoted");

     		else

    			 System.out.print("Failed");


	}
}
    
     
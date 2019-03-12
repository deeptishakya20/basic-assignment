import java.util.Scanner;
class ArraySearch{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
     		System.out.println("Enter the size of an array:");
     		int size=input.nextInt();
  		int[] array=new int[size];
  		System.out.println("Enter the elements of an array:");
   
   		for(int i=0;i<array.length; i++){
    			array[i]=input.nextInt();
   	    } 

   		System.out.println("Enter the search element:");
  		int search=input.nextInt();
		input.close();
  		int count=0;
   		for(int i=0;i<array.length;i++){
   			if(array[i]==search){
   				count++;
  		 		break;
         		}
   		}

   		if(count!=0)
  			 System.out.println("Found the search element");
   		else
  			System.out.print("Search element not found");
 
	 }

}
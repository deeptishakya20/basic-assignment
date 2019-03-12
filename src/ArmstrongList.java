
class ArmstrongList{

	public static void main(String args[]){
		System.out.println("Aramstrong number between 100 to 999 are:");
		int number=100;
		for(number=100;number<1000;number++){
			int local=number; 
                 	int count=0;
                 	int remainder;
                 	int result=0; 
                      
                	for(int temporary=number;temporary>0;temporary=temporary/10){
                        	count++;
               }
                    while(local!=0){
                    remainder=local%10;
                    result=result+(int)Math.pow(remainder, count);
                    local=local/10;
               }
                	if(number==result){

                	 System.out.println(number);
              }

        }
    }
}
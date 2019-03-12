
import java.util.Scanner;

	public class ArmstrongPower {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int number;
			System.out.println("Enter any number");
			number = input.nextInt();

			int temporaryVariable;
			int remainder;
			int realNumber = 0;
			temporaryVariable = number;
			int temp=number;
			int count=0;
			while(temp!=0{
				temp=temp/10;
				count++;
		}

			while (temporaryVariable != 0) {
			remainder = temporaryVariable % 10;
			realNumber =(int)Math.pow(remainder, count) + realNumber;
			temporaryVariable = temporaryVariable / 10;
		}
		if (realNumber == number) {
			System.out.println(number + " " + "is a armstrong number");
		} else {
			System.out.println(number + " " + "is not a armstrong number");
		}
	}
}

import java.util.Scanner;

	public class ArmtsrongFunction {
		public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Enter any number");
		number = input.nextInt();
		checkArmstrong(number);

	}

		public static void checkArmstrong(int number){
			int originalNumber = number;
			int temporary = originalNumber;
			int remainder;
			int result = 0;

			while (temporary != 0) {
				remainder = temporary % 10;
				result = remainder * remainder * remainder + result;
				temporary = temporary / 10;

		}

		if (result == originalNumber)

			System.out.println("Aramstrong number");
		else
			System.out.println("not armstrong number");

	}

}
import java.util.Scanner;

public class Calculatorwithinterface {


	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		Scanner Scan1 = new Scanner(System.in);
		Scanner Scan2 = new Scanner(System.in);
		Scanner Scan3 = new Scanner(System.in);
		Scanner Scan4 = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = Scan.nextInt();
		System.out.println("enter a second number");
		int number1 = Scan.nextInt();
		System.out.println("What operator would you like to use?");
		System.out.println("1 = +");
		System.out.println("2 = -");
		System.out.println("3 = *");
		System.out.println("4 = /");
		System.out.println("5 = ^2");
		System.out.println("6 = ^");
		int number2 = Scan.nextInt();

		switch (number2) {
		case 1:
			System.out.println("Answer:" + add(number, number1));
			break;
		case 2:
			System.out.println("Answer:" + subtract(number, number1));
			break;
		case 3:
			System.out.println("Answer:" + multply(number, number1));
			break;
		case 4:
			System.out.println("Answer:" + devide(number, number1));
			break;
		case 5:
			System.out.println("Answer:" + square(number));
			break;
		case 6:
			System.out.println("Answer:" + exponentiation(number, number1));
			break;
		default:
			System.out.println("I believe that was not an option...");
		}
		Scan.close();
		Scan1.close();
		Scan2.close();
		Scan3.close();
		Scan4.close();

	}

	public static int add(int x, int y) {

		return x + y;
	}

	public static int subtract(int x, int y) {

		return x - y;
	}

	public static int multply(int X, int Y) {

		int result = 0;
		for (int i = 0; i < X; i++) {

			result += Y;
		}

		return result;

	}

	public static int square(int X) {

		int result = 0;
		for (int i = 0; i < X; i++) {

			result += X;

		}
		return result;
	}

	public static int devide(int X, int Y) {
		int result = 0;
		while (Y <= X) {
			X -= Y;
			result++;
		}
		return result;
	}

	static int exponentiation(int X, int Y) {
		if (Y == 0)
			return 1;

		int answer = X;
		int increment = X;
		int i, j;

		for (i = 1; i < Y; i++) {
			for (j = 1; j < X; j++) {
				answer += increment;
			}
			increment = answer;
		}

		return answer;
	}
}

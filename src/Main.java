import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double price = input.nextDouble();
		double discount;
		
		if(price < 20.0) {
			discount = price * 0.1;
		}
		else {
			discount = price * 0.05;
		}
		
		System.out.printf("Price %.2f\n", price);
		System.out.printf("Discount %.2f\n", discount);
		
		input.close();
	}

}

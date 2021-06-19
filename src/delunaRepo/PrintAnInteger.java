package delunaRepo;
import java.util.Scanner;

public class PrintAnInteger {
	
	    public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter a digit: ");

	        int number = scan.nextInt();

	        System.out.println("You entered: " + number);
	}
}

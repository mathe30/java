package helloObjectsAndStuff;
import java.util.InputMismatchException;
import java.util.Scanner;
public class JavaScanner {

	public static void main(String[] args) {
		System.out.print("Enter your double : _ ");
		Scanner namesc = new Scanner(System.in);
		try {
				double d = namesc.nextDouble();
				System.out.println("");
				System.out.printf("\n\n %s\n", d);
				
			}
		catch (InputMismatchException e) {
			System.out.println("Well , enter a fucking double or don't enter anything other !");
		}
		namesc.close();
		System.out.println("scanner closed..");
	}

}

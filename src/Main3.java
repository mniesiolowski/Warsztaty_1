import java.util.Random;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		System.out.println("Pomysl liczbe w zakresie 0-100");
		Scanner s = new Scanner(System.in);
		int max = 101;
		int min = 0;
		int a=0;
		int gess;
		for (int i = 0; i < 10; i++) {
			gess = ((max - min) / 2) + min;
			System.out.println("Zgaduje " + gess);
			System.out.println("1 Mało ");
			System.out.println("2 Duzo ");
			System.out.println("3 Zgadles ");
			a = s.nextInt();
			if (a == 1) {
				min = gess;
			} else if (a == 2)
				max = gess; 

			else if (a == 3) {
				System.out.println("Brawo");
				break;
			}
		} System.out.println("Oszukujesz !");
	} 

}

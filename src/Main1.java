import java.util.Random;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Random r = new Random();

		int liczba = r.nextInt(100);
		for (; true;) {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Podaj liczbe");
				int podana = s.nextInt();
				if (liczba > podana) {
					System.out.println("Za malo" + "\n");
				} else if (liczba < podana) {
					System.out.println("Za duzo !" + "\n");
				} else {
					System.out.println("Brawo !");
					break; 
				}
			} catch (Exception e) {
				System.out.println("To nie liczba !"+ "\n");
			}
		}
	}
}

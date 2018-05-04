import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		int j = 0;
		int traf=0;
		Scanner s = new Scanner(System.in);
		int[] skreslone = new int[6];
		int[] wylosowane = new int[6];
		int a = 0;
		Integer[] arr = new Integer[49];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		} 
		// System.out.println(Arrays.toString(arr));
		Collections.shuffle(Arrays.asList(arr));
		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < wylosowane.length; i++) {
			wylosowane[i] = arr[i];
		}
		Arrays.sort(wylosowane);
		//System.out.println(Arrays.toString(wylosowane));
		System.out.println("Podaj liczbe");
		for (j = 0; j < skreslone.length; j++) {
			a = s.nextInt();
			while (a > 50 || a<1) {
				System.out.println("Liczba jest niepoprawna");
				a = s.nextInt();
			}
			skreslone[j] = a;
			
		}
		
		System.out.println(Arrays.toString(skreslone));
		for (int i=0; i<wylosowane.length;i++) {
			for (int k=0;k<skreslone.length;k++) {
				if (skreslone[k]==wylosowane[i]) {
					traf++;
				}
			}
		} System.out.println("Trafiles : " + traf + " liczby");
		System.out.println(Arrays.toString(wylosowane));
	}
}

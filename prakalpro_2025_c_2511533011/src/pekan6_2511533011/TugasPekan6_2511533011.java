package pekan6_2511533011;
import java.util.Random;
import java.util.Scanner;

public class TugasPekan6_2511533011 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int lemparan = 0;
		int sum = 0;
		String jawab = "ya";
		
		while (jawab.equalsIgnoreCase("ya")) {
			int dadu1 = rand.nextInt(6) + 1;
			int dadu2 = rand.nextInt(6) + 1;
			sum = dadu1 + dadu2;
			lemparan++;
			System.out.println("Lemparan ke - " + lemparan + ": ");
			System.out.println( dadu1 + " + " + dadu2 + " = " + sum);
			

		if (sum == 7) {
			System.out.println("Kamu menemukan hasil yang dicari!");
			break;
		} else {
			System.out.println("Mau mencoba lagi?(ya/tidak)");
			jawab = scan.nextLine();
			
		if (jawab.equalsIgnoreCase("tidak")) {
			System.out.println("Yahh kamu gagal");
		}
			
		}	
		
		}

	}

}



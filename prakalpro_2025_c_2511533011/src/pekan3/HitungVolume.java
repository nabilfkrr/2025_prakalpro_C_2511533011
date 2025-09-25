package pekan3;
import java.util.Locale;
import java.util.Scanner;
public class HitungVolume {

	public static void main(String[] args) {
		double PHI = 3.14;
		double r;
		double volume;
		Scanner keyboard = new Scanner(System.in);
		 keyboard.useLocale(Locale.US);
		 System.out.println("Masukkan jari jari bola: ");
		 r = keyboard.nextDouble();
		 keyboard.close();
		 volume = (4.0 / 3.0 * PHI * r * r * r);
		 System.out.println("Volume bola adalah: " + volume);

	}

}

package pekan7_2511533011;
import java.util.Scanner;
public class tugasAlproPekan7_2511533011 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("====== REGISTRASI AKUN BARU ======");
		System.out.print("Masukkan Username : ");
		String Username = input.nextLine();
		System.out.print("Masukkan Password : ");
		String Password = input.nextLine();
		System.out.print("Masukkan Email : ");
		String Email = input.nextLine();
		System.out.println("Masukkan PIN (angka 6 digit) : ");
		int pin = input.nextInt();
		
		Akun_2511533011 n= new Akun_2511533011();
        n.setUsername(Username);
        n.setPassword(Password);
        n.setEmail(Email);
        n.setPinAngka(pin);
        
        if (!n.isPasswordValid()) {
        	System.out.println("*** REGISTRASI GAGAL ***");
        	System.out.println("Password invalid : Password harus mengandung minimal 8 karakter");
            return;
        }
        if (!n.isEmailValid()) {
            System.out.println("*** REGISTRASI GAGAL ***");
            System.out.println("Email anda \""+ Email +"\" invalid (harus mengandung '@' dan '.')");
            return;
        }
        System.out.println();
        System.out.println("--- REGISTRASI BERHASIL ---");
        System.out.println("Akun anda \""+ Username +"\" telah berhasil dibuat.");
        System.out.println();
        System.out.println("--- Detail Akun ---");
        System.out.println("Username (Lowercase) : " + Username.toLowerCase());
        System.out.println("Email (Uppercase) : " + Email.toUpperCase());
        System.out.println("ID Pengguna (Gabungan) : " + Username + pin);
        System.out.println();
        System.out.println("--- Uji Tipe Data (Pin Anda: " + pin + ") ---");
        System.out.println("PIN (int) + 10 = " + (pin + 10));
        System.out.println("PIN (String) \""+ 10 +"\" = " + (String.valueOf(pin) + 10));
        
        }

}

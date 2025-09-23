package pekan3;

import java.util.Scanner;

public class OperatorAritmatika {

	public static void main(String[] args) {
		int A1;
		int A2;
		int hasil;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.println("Input angka-2: ");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.println("operatoer Penjumlahan");
		hasil = A1 + A2; //Penjumlahan
		System.out.println("Hasil = " + hasil);
		System.out.println("operator Pengurangan");
		hasil = A1 - A2; //Pengurangan
		System.out.println("Hasil =" + hasil);
		System.out.println("operator Perkalian");
		hasil = A1 * A2; //Perkalian
		System.out.println("Hasil =" + hasil);
		System.out.println("opeator Pembagian");
		hasil = A1 / A2; //Pembagian
		System.out.println("Hasil =" + hasil);
		System.out.println("operator sisa bagi");
		hasil = A1 % A2; //Sisa bagi
		System.out.println("Hasil =" + hasil);
	}

}

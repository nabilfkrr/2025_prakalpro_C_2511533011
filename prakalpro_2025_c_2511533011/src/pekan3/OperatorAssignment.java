package pekan3;

import java.util.Scanner;

public class OperatorAssignment {

	public static void main(String[] args) {
		int A1;
		int A2;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Input angka-1:");
		A1 = keyboard.nextInt();
		System.out.println("Input angka-2");
		A2 = keyboard.nextInt();
		keyboard.close();//input 5
		System.out.println("Assignment Penambahan");
		A1 += A2;//Penambahan, sekaranag A1 = 15
		System.out.println("Penambahan :" + A1);
		System.out.println("Assignment Pengurangan");
		A1 -= A2;//Pengurangan, sekarang A1 = 10
		System.out.println("Pengurangan:" + A1);
		System.out.println("Assignment Perkalian");
		A1 *= A2;//Perkalian, sekarang A1 = 50
		System.out.println("Pertkalian:" + A1);
		System.out.println("Assignment Pembagian");
		A1 /= A2;//Pembagian, sekarang A1 =10
		System.out.println("Pembagian:" + A1);
		System.out.println("Assignment Sisa bagi");
		A1 %= A2;//Sisa bagi, sekarang A1 = 0
		System.out.println("Sisa bagi:" + A1);
	}

}

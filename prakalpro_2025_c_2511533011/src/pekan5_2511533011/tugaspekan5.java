package pekan5_2511533011;

public class tugaspekan5 {

	public static void main(String[] args) {
		int x = 4;
		 
		System.out.print("#");
		for ( int i= 1; i<=x*4; i++) {
			System.out.print("=");
		}
		System.out.println("#");
		
		for (int i= 1; i<=x; i++) {
			System.out.print("|");
			for (int j=1; j<=4-i; j++) {
				System.out.print("  ");
			}
			System.out.print("<>");
			for (int j=1; j<=(i-1)*4; j++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for (int j=1; j<= 4-i; j++) {
				System.out.print("  ");
			}
			System.out.println("|");
		}
		
		for (int i= x; i>=1; i--) {
			System.out.print("|");
			for (int j=1; j<=4-i; j++) {
				System.out.print("  ");
			}
			System.out.print("<>");
			for (int j=1; j<=(i-1)*4; j++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for (int j=1; j<= 4-i; j++) {
				System.out.print("  ");
			}
			System.out.println("|");
		}
		
		System.out.print("#");
		for ( int i= 1; i<=x*4; i++) {
			System.out.print("=");
		}
		System.out.println("#");
		
			}
		}
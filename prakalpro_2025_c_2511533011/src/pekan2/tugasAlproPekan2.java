package pekan2;

public class tugasAlproPekan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tahunpembuatan = 2021;
		int kilometer = 9499;
		float kapasitasbensin  = 3.5f;
		char tipemotor = 'M';
		boolean efektif = kilometer < 1000;
		
		System.out.println("=== Data Motor ===");
		System.out.println("Tahun		:" + tahunpembuatan);
		System.out.println("Bensin		:" + kapasitasbensin);
		System.out.println("Tipe		:" + tipemotor);
		System.out.println("Kilometer	:" + kilometer);
		System.out.println("Efektif		:" + efektif);
		
		if (efektif) {
			System.out.println("Kesimpulan : Motor jarang digunakan");
		} else {
			System.out.println("Kesimpulan : Motor sering digunakan");
		}
		
		
		
	}

}

package id.web.alexanderbryanwiratman;

import java.util.Scanner;

public class Prak4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner A = new Scanner(System.in);
		int n, i;
		float rata = 0;
		
		System.out.print("Menghitung Rata-rata");
		System.out.print("Masukkan jumlah data = ");
		
		n = A.nextInt();
		
		int jumlah = 0;
		for(i=1; i<=n; i++){
			System.out.printf("\nNilai ke-%d = %d", i, i);
			jumlah = jumlah + i;
			rata = (float)(rata+i);
		}
		rata = rata/n;
		System.out.printf("\nJumlah data adalah = %d\n", jumlah);
		System.out.printf("Nilai rata-rata = %.1f ", rata);
	}

}

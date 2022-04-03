package id.web.alexanderbryanwiratman;

import java.util.Scanner;

public class Prak4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner A = new Scanner(System.in);
		int n, i, j;
		int jumlah = 0;

		System.out.print("Masukkan Banyaknya Batas Bilangan Prima = ");
		n = A.nextInt();

		for (i = 2; i <= n; i++) {
			boolean Prima = true;

			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					Prima = false;
					break;
				}
			}
			if(Prima==true){
				System.out.printf("%d ",i);
				jumlah = jumlah + i;
			}
		}
		System.out.printf("\nHasil dari penjumlahan seluruhnya adalah: %d", jumlah);
	}
}
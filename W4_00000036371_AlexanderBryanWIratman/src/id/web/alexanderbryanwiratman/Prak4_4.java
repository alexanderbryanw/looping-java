package id.web.alexanderbryanwiratman;

import java.util.Scanner;

public class Prak4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("==== SEGITIGA ====\n");
		System.out.print("Masukkan Tinggi Setengah Segitiga = ");
		int n = scan.nextInt();
		int i, j, k;
		for (i = 1; i <= 2*n; i=i+2) {
			for (j = 1; j <= (2*n)-i; j++) {
				System.out.print(" ");
			}
				for(k=1; k<=i; k++){
					System.out.print('*');
				}
				System.out.println();
		}
	}
}

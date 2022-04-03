package id.web.alexanderbryanwiratman;

import java.util.Scanner;

public class Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i, j, k, l, baris;
		int pilihan = 0;
		while (pilihan != 5) {
			pilihan = 0;
			System.out.println("Selamat Datang di Program Tebar Bintang UMN\n");
			System.out.print("Banyak Baris? : ");
			baris = scan.nextInt();
			while (pilihan != 4 && pilihan != 5) {
				System.out.println("=============================================");
				System.out.println("1. Tebar Silang");
				System.out.println("2. Tebar Kotak Bolong");
				System.out.println("3. Tebar Piramida Berkesan");
				System.out.println("4. Kembali");
				System.out.println("5. Keluar");
				System.out.print("Pilih : ");
				pilihan = scan.nextInt();
				switch (pilihan) {
				case 1:
					for (i = 0; i < baris; i++) {

						for (j = 0; j < baris; j++) {

							if (i == j || i + j == baris - 1) {

								System.out.print("*");
							}

							else {
								System.out.print(" ");
							}
						}
						System.out.println("");
					}
					break;
				case 2:
					for (i = 1; i <= baris; i++) {
						for (j = 1; j <= baris; j++) {
							if (i == 1 || i == baris || j == 1 || j == baris) {
								System.out.print("*");
							} else {
								System.out.print(" ");
							}
						}
						System.out.println();
					}
					break;
				case 3:
					for (i = 1; i <= baris; i++) {
						for (j = i; j <= baris; j++) {
							System.out.print(" ");
						}

						for (k = 0; k <= (i * 2) - 2; k++) {

							System.out.print("*");
						}
						System.out.println();
					}
					break;
				case 4:
					break;
				case 5:
					System.out.println("=============================================");
					System.out.println("Terima Kasih dan");
					System.out.println("Tebarkan Selalu Pesona Bintang UMN!!");
					break;
				}
			}
		}
	}
}
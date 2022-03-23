//Nama   : Muh. Wahyu Hidayat
//Nim    : 13020200028
//Tanggal: 23 Maret 2022
//Kelas  : A1
import java.util.Scanner;

/* contoh membaca integer menggunakan Class Scanner*/

public class BacaData {

	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kamus */
		
		int a;
		Scanner masukan;
		/* Program */
		
		System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
		masukan = new Scanner(System.in);
		a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); ;
		
		/*Apa akibatnya ?*/
		System.out.print ("Nilai yang dibaca : "+ a);
	}
}
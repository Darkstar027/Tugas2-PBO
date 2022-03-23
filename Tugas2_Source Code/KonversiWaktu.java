//Nama   : Muh. Wahyu Hidayat
//Nim    : 13020200028
//Tanggal: 23 Maret 2022
//Kelas  : A1
import java.util.Scanner;

public class KonversiWaktu {


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int totJam, jam, totMen, menit, detik, konversi;

        System.out.print("Masukkan total detik : ");
        konversi = input.nextInt();


        detik = konversi % 60;
        totMen = konversi / 60;
        menit = totMen % 60;
        totJam = totMen / 60;
        jam = totJam % 24;


        System.out.println("Detik sekarang  : " +detik+ " detik");
        System.out.println("Total menit     : " +totMen+ " menit");
        System.out.println("Menit sekarang  : " +menit+ " menit");
        System.out.println("Total jam       : " +totJam+ " jam");
        System.out.println("Jam sekarang    : " +jam+ " jam");
        System.out.println("Tampil waktu    : " + jam + ":" + menit + ":" + detik);
    }
}

/*
output:
Masukan detik :
13456
3 Jam 44 menit 16 detik.
penjelasan
untuk membuat inputan datik bertipe data int pada java maka pada program ini membuat terlebih dahulu 
class Scanner, class yang berfungsi untuk inputan pada java.dan jangan lupa mengimpornya agar dapat di gunakan.
membuat scanner baru dan menyimpannya ke dalam variabel detik yang gunakan di sini adalah totalDetik = detik.nextInt();.
nextInt() untuk yang bertipe data integer seperti detik. kemudia setelah masukan detik untuk menkonversikannya ke jam 
menit dan detik sekarang maka proses perhitungan untuk mencari detikSekarang adalah dengan total%60, 
mencari totalMenit adalah dengan totalDetik/60, mencari menitSekarang adalhag dengan
totalMenit%60, mencari totalJam adalah dengan totalMenit/60, mencari jamSekarang adalah dengan totalJam%24;
kemudian setelah proses perhitungan maka tampilkan hasil dari pehitungan itu mulai dari jam 
*/
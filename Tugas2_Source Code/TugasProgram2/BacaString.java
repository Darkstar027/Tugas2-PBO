//Nama   : Muh. Wahyu Hidayat
//Nim    : 13020200028
//Tanggal: 23 Maret 2022
//Kelas  : A1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;
public class BacaString {
    /**
    * @param args
    * @throws IOException 
    */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        /* Kamus */ 

        String str; 
        BufferedReader datAIn = new BufferedReader(new 
        InputStreamReader(System.in));

        /* Program */

        System.out.print ("\nBaca string dan Integer: \n"); 
        System.out.print("masukkan sebuah string: "); 
        str= datAIn.readLine();
        System.out.print ("String yang dibaca : "+ str);
    }
}

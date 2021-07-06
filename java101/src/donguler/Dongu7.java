package donguler;

import java.util.Scanner;

/**
 * Java ile girilen sayının harmonik serisini bulan program
 */
public class Dongu7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int n = scan.nextInt();

        double sonuc = 0;
        while (n > 0){
            sonuc += (1.0/n);
            n--;
        }

        System.out.println("Harmoik ortalama : " + sonuc);
    }
}

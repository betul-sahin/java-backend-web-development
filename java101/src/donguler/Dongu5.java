package donguler;

import java.util.Scanner;

public class Dongu5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = scan.nextInt();
        System.out.print("Üssünü giriniz : ");
        int us = scan.nextInt();

        int sonuc = 1;
        for(int i=0; i<us; i++){
            sonuc *= sayi;
        }

        System.out.println(sayi+" üzeri " + us + " = " + sonuc);
    }
}

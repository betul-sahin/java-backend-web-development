package donguler;

import java.util.Scanner;

public class Dongu6 {
    public static int kuvvetiniAl(int x, int n){
        int kuvveti = 1;
        for(int i=0; i<n; i++){
            kuvveti *= x;
        }
        return kuvveti;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = scan.nextInt();
        int basamakToplam = 0;

        //basamak sayisini bulma
        int gecici = sayi;
        int basamakSayisi = 0;
        while(gecici != 0){
            gecici /= 10;
            basamakSayisi++;
        }

        int toplam = 0;
        gecici = sayi;
        while(gecici != 0){
            //sayinin birler basamagi degerini almak
            int basamakDegeri = gecici % 10;
            basamakToplam += basamakDegeri;

            int kuvveti = kuvvetiniAl(basamakDegeri, basamakSayisi);
            toplam += kuvveti;

            gecici = gecici / 10;
        }

        System.out.println((sayi == toplam) ? "armstrong" : "degil");
        System.out.println(sayi + " sayisinin basamaklari toplami : " + basamakToplam);
    }
}

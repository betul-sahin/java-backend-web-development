package metotlar;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static Scanner scan = new Scanner(System.in);

    static void toplama(){
        System.out.print("1. sayiyi giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.print("2. sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        int toplam = sayi1 + sayi2;
        System.out.println(sayi1 + " + " + sayi2 + " = "  + toplam);
    }

    static void cikarma(){
        System.out.print("1. sayiyi giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.print("2. sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        int cikarma = sayi1 - sayi2;
        System.out.println(sayi1 + " - " + sayi2 + " = " + cikarma);
    }

    static void carpma(){
        System.out.print("1. sayiyi giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.print("2. sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        int carpim = sayi1 * sayi2;
        System.out.println(sayi1 + " x " + sayi2 + " = " + carpim);
    }

    static void bolme(){
        System.out.print("1. sayiyi giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.print("2. sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        if(sayi2 != 0){
            int bolum = sayi1 / sayi2;
            System.out.println(sayi1 + " / " + sayi2 + " = " + bolum);
        }else{
            System.out.println("Böleni 0 giremezsiniz! ");
        }
    }

    static void usAl(){
        System.out.print("Taban degerini giriniz : ");
        int taban = scan.nextInt();

        System.out.print("Üs degerini giriniz : ");
        int us = scan.nextInt();

        int sonuc = 1;
        for(int i=1; i<=us; i++){
            sonuc = sonuc * taban;
        }

        System.out.println(taban + " üssü " + us + " = " + sonuc);
    }

    static void faktoriyelAl(){
        System.out.print("Sayi giriniz : ");
        int sayi = scan.nextInt();

        int sonuc = 1;
        for(int i=1; i<sayi; i++){
            sonuc = sonuc * i;
        }

        System.out.println(sayi + "! " +  " = " + sonuc);
    }

    static void modAl(){
        System.out.print("Sayi giriniz : ");
        int sayi = scan.nextInt();

        System.out.print("Mod degerini giriniz : ");
        int mod = scan.nextInt();

        int sonuc = sayi % mod;
        System.out.println(sayi + " % " + mod + " = " + sonuc);
    }

    static void dikdortgenAlanCevreHesapla(){
        System.out.print("Dikdörtgenin kisa kenarini giriniz : ");
        int a = scan.nextInt();

        System.out.print("Dikdörtgenin uzun kenarini giriniz  : ");
        int b = scan.nextInt();

        System.out.println("Cevresi : " + (2 * (a + b)));
        System.out.println("Alani : " + (a * b));
    }

    public static void main(String[] args) {
        System.out.println("~ HESAP MAKİNESİ ~");
        System.out.println("1- Toplama İşlemi");
        System.out.println("2- Çıkarma İşlemi");
        System.out.println("3- Çarpma İşlemi");
        System.out.println("4- Bölme işlemi");
        System.out.println("5- Üslü Sayı Hesaplama");
        System.out.println("6- Faktoriyel Hesaplama");
        System.out.println("7- Mod Alma");
        System.out.println("8- Dikdörtgen Alan ve Çevre Hesabı");

        int select;
        do{
            System.out.print("Lütfen bir islem seciniz : ");
            select = scan.nextInt();

            switch (select){
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usAl();
                    break;
                case 6:
                    faktoriyelAl();
                    break;
                case 7:
                    modAl();
                    break;
                case 8:
                    dikdortgenAlanCevreHesapla();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlıs bir deger girdiniz!");
            }
        }while (select != 0);
    }
}

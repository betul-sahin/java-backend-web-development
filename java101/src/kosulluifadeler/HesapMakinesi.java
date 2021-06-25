package kosulluifadeler;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.println("Hangi işlemi yapmak istiyorsunuz ?");
        System.out.println("1 : Toplama");
        System.out.println("2 : Çıkarma");
        System.out.println("3 : Çarpma");
        System.out.println("4 : Bölme");
        int secim = scan.nextInt();

        switch (secim){
            case 1:
                System.out.println("Sonuç : " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Sonuç : " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Sonuç : " + (sayi1 * sayi2));
                break;
            case 4:
                if(sayi2 != 0){
                    System.out.println("Sonuç : " + (sayi1 / sayi2));
                }
                else{
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız!");
        }
    }
}

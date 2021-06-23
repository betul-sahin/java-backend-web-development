package temelkavramlar;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5;

        System.out.print("Armut Kaç Kilo ? : ");
        int armut = scan.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        int elma = scan.nextInt();

        System.out.print("Domates Kaç Kilo ? : ");
        int domates = scan.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        int muz = scan.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? :");
        int patlican = scan.nextInt();

        double tutar = (armut * armutFiyati) +
                (elma * elmaFiyati) + (domatesFiyati * domates) +
                (muz * muzFiyati) + (patlican * patlicanFiyati);
        System.out.print("Toplam Tutar : " + tutar + "TL");
    }
}

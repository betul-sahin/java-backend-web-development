package temelkavramlar;

import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args){
        double tutar;
        double kdvOran18 = 0.18;
        double kdvOran8 = 0.8;

        Scanner scan = new Scanner(System.in);
        System.out.print("Tutar giriniz: ");
        tutar = scan.nextDouble();

        System.out.println("KDV'siz Fiyat = " + tutar);
        System.out.println("KDV'li Fiyat = " +
                (tutar<1000?tutar+(tutar*kdvOran18):tutar+(tutar*kdvOran8)));
        System.out.println("KDV tutarı = " +
                (tutar<1000?tutar*kdvOran18:tutar*kdvOran8));
    }
}

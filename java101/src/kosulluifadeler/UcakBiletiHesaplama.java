package kosulluifadeler;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        double mesafeUcreti = 0.10;
        double mesafe = 0.0;
        int yas = 0;
        int yolculukTipi = 0;
        double tutar = 0.0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Mesafe giriniz: ");
        mesafe = scan.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        yas = scan.nextInt();
        System.out.print("Yolculuk tipini giriniz: \n 1 : Tek Yön \n 2 : Gidiş-Dönüş\n");
        yolculukTipi = scan.nextInt();

        if(yas<0 || mesafe<0 ||
                (yolculukTipi<=0 || yolculukTipi>2)){
            System.out.println("Hatalı Veri Girdiniz !");
        }
        else{
            tutar = mesafe * mesafeUcreti;
            if(yas<12){
                double indirim = tutar * 0.5;
                tutar = tutar - indirim;
            }
            else if(yas>=12 && yas<=24){
                double indirim = tutar * 0.1;
                tutar = tutar - indirim;
            }
            else if(yas>65){
                double indirim = tutar * 0.3;
                tutar = tutar - indirim;
            }

            if(yolculukTipi == 2){
                double indirim = tutar * 0.2;
                tutar = (tutar - indirim) * 2;
                System.out.println("Toplam tutar = " + tutar);
            }
            else{
                System.out.println("Toplam tutar = " + tutar);
            }
        }
    }
}

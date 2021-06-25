package kosulluifadeler;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, muzik;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ders sayisini ve " +
                "sirasiyla notlarinizi(matematik, fizik, kimya, turkce, tarih, muzik) giriniz...");
        int n = scan.nextInt();
        scan.nextLine();
        matematik = scan.nextInt();
        fizik = scan.nextInt();
        kimya = scan.nextInt();
        turkce = scan.nextInt();
        muzik = scan.nextInt();

        double ortalama = 0.0;
        if((matematik>0 && matematik<=100) || (fizik>0 && fizik<=100) ||
                (kimya>0 && kimya <=100) || (turkce>0 && turkce<=100) || (muzik>0 && muzik<=100))
            ortalama = (matematik + fizik + kimya + turkce + muzik) / n;

        if(ortalama <= 55){
            System.out.println("Sınıfta kaldınız.");
        }
        else{
            System.out.println("Tebrikler geçtiniz!");
        }

        System.out.print("Ortalamanız : " + ortalama);
    }
}

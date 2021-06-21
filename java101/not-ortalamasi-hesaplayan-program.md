#### Not Ortalaması Hesaplayan Program  
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı
yazın.

#### Ödev  
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...

```import java.util.Scanner;

public class NotOrtalamasiHesaplama {

    public static void main(String[] args){
        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ders sayisini ve " +
                "sirasiyla notlarinizi(matematik, fizik, kimya, turkce, tarih, muzik) giriniz...");
        int n = scan.nextInt();
        scan.nextLine();
        matematik = scan.nextInt();
        fizik = scan.nextInt();
        kimya = scan.nextInt();
        turkce = scan.nextInt();
        tarih = scan.nextInt();
        muzik = scan.nextInt();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / n;
        System.out.println("Ortalamanız: "+ ortalama);
        System.out.println(ortalama>=60?"Sınıfı Geçti":"Sınıfta Kaldı");
    }
}
```

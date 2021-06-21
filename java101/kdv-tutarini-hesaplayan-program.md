#### KDV Tutarı Hesaplayan Program   
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

#### Ödev   
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
      
#### Çözüm   

```
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
```

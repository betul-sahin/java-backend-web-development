#### Taksimetre Programı   
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.

Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.

Taksimetre açılış ücreti 10 TL'dir.

#### Çözüm

```
import java.util.Scanner;

public class TaksimetreHesaplayanProgram {

    public static void main(String[] args){
        double taksimetreOrani = 2.20;
        int acilisUcreti = 10;

        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz: ");
        int km = scan.nextInt();

        double tutar = acilisUcreti + (km*taksimetreOrani);
        tutar = (tutar<20) ? 20 : tutar;
        System.out.println("Tutar = " + tutar);
    }

```

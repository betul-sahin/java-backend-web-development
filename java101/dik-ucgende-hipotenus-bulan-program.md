#### Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

#### Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

#### Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)


#### Çözüm  

```
import java.util.Scanner;

public class DikUcgendeHipotenusBulma {

    public static void main(String[] args){
        int a, b;
        double c;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ucgenin kenarlarini giriniz: ");
        a = scan.nextInt();
        b = scan.nextInt();

        // hipotenus hesapliyoruz
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus = " + c);
    }
}
```

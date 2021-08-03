package metotlar;

import java.util.Scanner;

public class RecursiveUsHesabi {
    static int usAl(int taban, int us){
        if(us == 0){
            return 1;
        }
        if(us % 2 == 0){
            return usAl(taban, us/2) * usAl(taban, us/2);
        }else{
            return taban * usAl(taban, us/2) * usAl(taban, us/2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban degerini giriniz : ");
        int taban = scan.nextInt();

        System.out.print("Üs degerini giriniz : ");
        int us = scan.nextInt();

        System.out.println("Sonuc : " + usAl(taban, us));
    }
}

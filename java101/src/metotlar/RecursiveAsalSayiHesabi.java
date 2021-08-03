package metotlar;

import java.util.Scanner;

public class RecursiveAsalSayiHesabi {
    static boolean asalMi(int sayi, int k){
        if(sayi < 2){
            return false;
        }
        if(sayi == 2){
            return true;
        }
        if(sayi % k == 0){
            return false;
        }
        if(k * k > sayi){
            return true;
        }

        return asalMi(sayi, k+1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int sayi = scan.nextInt();

        System.out.print(asalMi(sayi, 2)?"Asal":"Asal degil");
    }
}

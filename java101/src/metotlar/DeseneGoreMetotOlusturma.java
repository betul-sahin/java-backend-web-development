package metotlar;

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {

    static void desenCiz(int sayi) {
        System.out.print(sayi + " ");

        if(sayi > 0)
            desenCiz(sayi - 5);

        return;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int sayi = scan.nextInt();

        desenCiz(sayi);
    }
}

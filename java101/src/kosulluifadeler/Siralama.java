package kosulluifadeler;

import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1. sayiyi giriniz ");
        int sayi1 = scan.nextInt();

        System.out.print("2. sayiyi giriniz ");
        int sayi2 = scan.nextInt();

        System.out.print("3. sayiyi giriniz ");
        int sayi3 = scan.nextInt();

        if(sayi1 < sayi2){
            if (sayi2 < sayi3) {
                System.out.println(sayi1+"<"+sayi2+"<"+sayi3);
            }else{
                System.out.println(sayi1+"<"+sayi3+"<"+sayi2);
            }
        }else if(sayi1 < sayi3){
            System.out.println(sayi2+"<"+sayi1+"<"+sayi3);
        }else{
            if (sayi2 < sayi3) {
                System.out.println(sayi2+"<"+sayi3+"<"+sayi1);
            }else{
                System.out.println(sayi3+"<"+sayi2+"<"+sayi1);
            }
        }

    }
}

package donguler;

import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        int n = scan.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i = 1;
        while(i <= n){
            System.out.print(i + ". Sayıyı giriniz: ");
            int sayi = scan.nextInt();

            if(sayi < min){
                min = sayi;
            }

            if(sayi > max){
                max = sayi;
            }

            i++;
        }

        System.out.print("En büyük sayı: " + max);
        System.out.println();
        System.out.println("En küçük sayı: " + min);
    }
}

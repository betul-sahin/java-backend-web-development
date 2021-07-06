package donguler;

import java.util.Scanner;

public class Dongu12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = scan.nextInt();

        int toplam = 0;
        for(int i=1; i<sayi; i++){
            if(sayi%i == 0){
                toplam +=i;
            }
        }

        if(sayi == toplam){
            System.out.println("Mükemmel sayidir.");
        }
        else{
            System.out.println("Degildir.");
        }
    }
}

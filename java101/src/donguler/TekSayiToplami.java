package donguler;

import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        int sum = 0;
        do{
            System.out.print("Sayi giriniz : ");
            sayi = scanner.nextInt();
            if(sayi % 4 == 0){
                sum += sayi;
            }
        }while(sayi % 2 == 0 );

        System.out.println("Toplami : " + sum);
    }
}

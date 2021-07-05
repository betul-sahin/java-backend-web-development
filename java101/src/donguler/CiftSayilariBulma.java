package donguler;

import java.util.Scanner;

public class CiftSayilariBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        int sum = 0;
        int count = 0;
        while(sayi > 1){
            if(sayi % 12 == 0){
                sum += sayi;
                count++;
            }
            sayi--;
        }

        double avg = sum / count;
        System.out.println("Ortalama : " + avg);
    }
}

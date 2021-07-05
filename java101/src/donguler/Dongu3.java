package donguler;

import java.util.Scanner;

/**
 * Problem: Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program.
 */
public class Dongu3 {
    public static int kuvvetiniAl(int x, int n){
        int kuvveti = 1;
        for(int i=0; i<n; i++){
            kuvveti *= x;
        }
        return kuvveti;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kuvvet giriniz : ");
        int kuvvet = scan.nextInt();

        System.out.println("4'ün " + kuvvet + ". kuvveti = " + kuvvetiniAl(4, kuvvet));
        System.out.println("4'ün " + kuvvet + ". kuvveti = " + kuvvetiniAl(5, kuvvet));

    }
}

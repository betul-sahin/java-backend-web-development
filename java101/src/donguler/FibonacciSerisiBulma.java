package donguler;

import java.util.Scanner;

public class FibonacciSerisiBulma {
    static void printFibonacci(int elemanSayisi){
        int f1 = 0, f2 = 1, i=0;
        do{
            System.out.print(f1 + " ");
            int nextFib = f1 + f2;
            f1 = f2;
            f2 = nextFib;
            i++;
        }while (i < elemanSayisi);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Eleman sayisi giriniz : ");
        int sayi = scan.nextInt();

        printFibonacci(sayi);
    }
}

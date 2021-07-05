package donguler;

import java.util.Scanner;

/**
 * Problem: Java ile kombinasyon hesaplayan program yazınız.
 */
public class Dongu4 {
    public static int faktoriyel(int n){
        if(n <= 1){
            return 1;
        }
        else{
            return n * faktoriyel(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = scan.nextInt();
        System.out.print("r = ");
        int r = scan.nextInt();

        int kombinasyonu = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n-r));
        System.out.println("C(n,r) = n! / (r! * (n-r)!)");
        System.out.println("Sonuc : " + kombinasyonu);
    }
}

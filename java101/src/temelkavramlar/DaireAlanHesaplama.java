package temelkavramlar;

import java.util.Scanner;

public class DaireAlanHesaplama {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        double pi = 3.14;

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alani: " + alan);
        System.out.println("Dairenin cevrei: " + cevre);
    }
}

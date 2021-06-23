package temelkavramlar;

import java.util.Scanner;

public class DikUcgendeHipotenusBulma {
    public static void main(String[] args){
        int a, b;
        double c;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ucgenin kenarlarini giriniz: ");
        a = scan.nextInt();
        b = scan.nextInt();

        // hipotenus hesapliyoruz
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus = " + c);
    }
}

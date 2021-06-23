package temelkavramlar;

import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args){
        double taksimetreOrani = 2.20;
        int acilisUcreti = 10;

        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz: ");
        int km = scan.nextInt();

        double tutar = acilisUcreti + (km*taksimetreOrani);
        tutar = (tutar<20) ? 20 : tutar;
        System.out.println("Tutar = " + tutar);
    }
}

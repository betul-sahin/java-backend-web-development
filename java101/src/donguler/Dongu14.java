package donguler;

import java.util.Scanner;

public class Dongu14 {
    public static boolean asalMi(int sayi){
        boolean sonuc = true;
        for(int i=2; i<sayi; i++){
            if(sayi%i == 0){
                sonuc = false;
                break;
            }
        }
        return sonuc;
    }

    public static void main(String[] args){
        for(int i=2; i<100; i++){
            if(asalMi(i)){
                System.out.print(i + " ");
            }
        }
    }
}

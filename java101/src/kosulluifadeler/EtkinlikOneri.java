package kosulluifadeler;

import java.util.Scanner;

public class EtkinlikOneri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sicaklikDegeri = scan.nextInt();

        if(sicaklikDegeri < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }

        if(sicaklikDegeri>=5 && sicaklikDegeri<15){
            System.out.println("Sinemaya gitmek için güzel bir hava!");
        }

        if(sicaklikDegeri>=10 && sicaklikDegeri<=25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }

        if(sicaklikDegeri>25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}

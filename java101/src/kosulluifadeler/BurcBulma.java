package kosulluifadeler;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ay = scan.nextInt();
        int gun = scan.nextInt();

        //gecersiz deger kontrolu
        if(ay<0 || gun<0){
            System.out.println("Gün veya ay negatif deger olamaz.");
        }

        if(ay == 1){
            if(gun<=21){
                System.out.println("Oğlak");
            }
            else if(gun>22){
                System.out.println("Kova");
            }
        }
        else if(ay == 2){
            if(gun>20){
                System.out.println("Balık");
            }
            else if(gun<=19){
                System.out.println("Kova");
            }
        }
        else if(ay == 3){
            if(gun<=20){
                System.out.println("Balık");
            }
            else if(gun>20){
                System.out.println("Koç");
            }
        }
        else if(ay == 4){
            if(gun<=20){
                System.out.println("Koç");
            }
            else if(gun>20){
                System.out.println("Boğa");
            }
        }
        else if(ay == 5){
            if(gun<=21){
                System.out.println("Boğa");
            }
            else if(gun>21){
                System.out.println("İkizler");
            }
        }
        else if(ay == 6){
            if(gun<=22){
                System.out.println("İkizler");
            }
            else if(gun>22){
                System.out.println("Yengeç");
            }
        }
        else if(ay == 7){
            if(gun<=22){
                System.out.println("Yengeç");
            }
            else if(gun>22){
                System.out.println("Aslan");
            }
        }
        else if(ay == 8){
            if(gun<=22){
                System.out.println("Aslan");
            }
            else if(gun>22){
                System.out.println("Başak");
            }
        }
        else if(ay == 9){
            if(gun<=22){
                System.out.println("Başak");
            }
            else if(gun>22){
                System.out.println("Terazi");
            }
        }
        else if(ay == 10){
            if(gun<=22){
                System.out.println("Terazi");
            }
            else if(gun>22){
                System.out.println("Akrep");
            }
        }
        else if(ay == 11){
            if(gun<=21){
                System.out.println("Akrep");
            }
            else if(gun>21){
                System.out.println("Yay");
            }
        }
        else if(ay == 12){
            if(gun<=21){
                System.out.println("Yay");
            }
            else if(gun>21){
                System.out.println("Oğlak");
            }
        }
    }
}

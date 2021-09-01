package diziler;

import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    static void bubbleSort(int[] dizi){
        int n = dizi.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(dizi[j] > dizi[j+1]){
                    int temp = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz : ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];
        System.out.println("Dizinin elemanlarını giriniz : ");

        int i = 0;
        while (i < boyut){
            dizi[i] = scanner.nextInt();
            i++;
        }

        bubbleSort(dizi);

        System.out.print("Sıralama : ");
        for (int eleman : dizi ){
            System.out.print(eleman + " ");
        }
    }
}

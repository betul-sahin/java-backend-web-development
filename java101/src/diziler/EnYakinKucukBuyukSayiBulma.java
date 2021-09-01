package diziler;

import java.util.Arrays;

public class EnYakinKucukBuyukSayiBulma {
    public static void main(String[] args) {
        int girilenSayi = 5;
        int enKucukEnYakin=0, enBuyukEnYakin=0;

        int[] dizi = new int[]{15,12,788,1,-1,-778,2,0};

        Arrays.sort(dizi);

        // girilen sayinin dizide olmayacagini varsaydim.
        int j = 0;
        for(int i=0; i<dizi.length; i++){
            if(dizi[i] > girilenSayi){
                enBuyukEnYakin = dizi[i];
                j = i;
                break;
            }
        }

        for(int i=j; i>=0; i--){
            if((dizi[i] < enBuyukEnYakin)
                    && (dizi[i] < girilenSayi)){
                enKucukEnYakin = dizi[i];
                break;
            }
        }

        System.out.println("Girilen Sayı : " + girilenSayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + enKucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + enBuyukEnYakin);
    }
}

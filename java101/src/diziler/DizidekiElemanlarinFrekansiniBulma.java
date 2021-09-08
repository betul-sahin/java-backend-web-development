package diziler;

import java.util.HashMap;
import java.util.Map;

public class DizidekiElemanlarinFrekansiniBulma {
    private static void frekansGetir(int[] dizi, int n){
        Map<Integer, Integer> mapFrekans = new HashMap<>();
        for(int eleman : dizi){
            if(mapFrekans.containsKey(eleman)){
                mapFrekans.put(eleman, mapFrekans.get(eleman) + 1);
            }else{
                mapFrekans.put(eleman, 1);
            }
        }

        System.out.println("Tekrar Sayıları");

        for(Map.Entry<Integer, Integer> entry : mapFrekans.entrySet()){
            System.out.println(entry.getKey() + " sayisi " + entry.getValue() + " kere tekrar edildi.");
        }
    }

    public static void main(String[] args) {
        int[] dizi = new int[]{10, 20, 20, 10, 10, 20, 5, 20};

        frekansGetir(dizi, dizi.length);
    }
}

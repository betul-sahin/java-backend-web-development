package donguler;

public class TersUcgen {
    public static void main(String[] args) {
        int n = 10;
        int i, j;

        System.out.println("Basamak Sayısı : 10");
        for (i=n; i>=1; i--){

            for (j=i; j<n; j++){
                System.out.print(" ");
            }

            for (j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

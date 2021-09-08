package diziler;

public class MatrisinTranspozu {
    public static void main(String[] args) {
        int[][] matris = new int[][]
                {{2, 3, 4 },
                {5, 6, 4}};

        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        System.out.println("Matris :");
        for (int[] satir : matris){
            for (int eleman : satir){
                System.out.print(eleman + " ");
            }
            System.out.println();
        }

        System.out.println();

        // satir ve sutunlar ile i ve j yer degisti.
        System.out.println("Transpozu :");
        for(int i=0; i<sutunSayisi; i++){
            for(int j=0; j<satirSayisi; j++){
                System.out.print(matris[j][i] + " ");
            }
            System.out.println();
        }

    }
}

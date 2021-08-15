package diziler;

public class HarmonikOrtalamaHesaplayanProgram {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicSum = 0;
        int i = numbers.length-1;

        while (i >= 0) {
            harmonicSum += 1.0 / numbers[i];
            i--;
        }

        System.out.println("Harmonik ortalamasi : " + harmonicSum);
    }
}

package metotlar;

public class PalindromSayiBulma {
    static boolean isPalindrom(int number){
        int temp = number;
        int reverseNumber = 0;
        while(temp > 0){
            reverseNumber = reverseNumber*10 + temp%10;
            temp = temp/10;
            /**
             * number = 43234
             * reverseNumber = 0 + 4
             * reverseNumber = 40 + 3
             * reverseNumber = 430 + 2
             * reverseNumber = 4320 + 3
             * reverseNumber = 43230 + 4
             */
        }

        return (reverseNumber == number);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(43234)?"Palindrom bir sayidir":"degildir");
        System.out.println(isPalindrom(432734)?"Palindrom bir sayidir":"degildir");
    }
}

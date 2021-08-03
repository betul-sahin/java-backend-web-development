package metotlar;

// 1 1 2 3 5 8 13 21
// f(n) = f(n-1) + f(n-2)
// f(6) = f(5) + f(4)
// f(5) = f(4) + f(3)
// f(4) = f(3) + f(2)
// f(3) = f(2) + f(1)
public class FibonacciSerisiBulma {
    static int getFibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return getFibonacci(number-1) + getFibonacci(number-2);
    }

    public static void main(String[] args) {
        System.out.println("f(7) : " + getFibonacci(7));
    }
}

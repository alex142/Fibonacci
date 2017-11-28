public class Fibonacci {
    private static void printFibonacciNumbers(int r) {
        int f0 = 0;
        int f1 = 1;
        if(r > 0){
            int fib = 0;
            for(int i = 0; i < r; i++){
                System.out.println(fib);
                f0 = f1;
                f1 = fib;
                fib = f0 + f1;
            }
        }
        else{
            System.out.println("Please insert valid r");
        }
    }

    public static void main(String[] args){
        printFibonacciNumbers(8);
        printFibonacciNumbers(0);
        printFibonacciNumbers(-1);
    }
}

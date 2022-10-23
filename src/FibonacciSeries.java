public class FibonacciSeries {
    static void fibonacci(int range) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        for (int i = 1; i < (range - 1); i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }
    }

    static void multiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + i * num);
        }
    }
        static void increasingStarPattern(){
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    static void decreasingStarPattern(){
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("fahrenheit is "+fahrenheit);
    }
    public static void main(String[] args) {
        //fibonacci(10);
        //System.out.println();
        //multiplicationTable(5);
        //increasingStarPattern();
        //System.out.println("____________");
        //decreasingStarPattern();
        //pattern1_rec(9);
        celsiusToFahrenheit(40);
    }
}
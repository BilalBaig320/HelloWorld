public class Recursion
{
    static int factorial(int num)
    {
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("The factorail of 5 is "+factorial(5));
    }
}

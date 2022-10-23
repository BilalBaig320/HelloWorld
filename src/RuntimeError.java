import java.util.InputMismatchException;
import java.util.Scanner;
public class RuntimeError {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please entr any number");
            int num = input.nextInt();
            System.out.println("Please entr Second number to divide any number");
            int num2 = input.nextInt();
            System.out.println("your number is " + num/num2);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception Occured ");
        }
        catch (InputMismatchException e){
            System.out.println("Please Enter any interger");
        }
        catch (Exception e){
            System.out.println("Some Exception Occured "+e);
        }

    }

}

import java.util.Scanner;
public class Factorail {
    public static void main(String[] args) {
        //           Factrail
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Any number to find Factorail");
        int num = s1.nextInt();
        int fact = 1;
        for(int i=num;i>=1;i--){
            fact = fact*i;
        }
        System.out.println(fact);

    }
}

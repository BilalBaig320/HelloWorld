import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        int math,chemistry,pyhsics,english,urdu;
        float obtained;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your math marks");
        math = input.nextInt();
        System.out.println("Enter your chemistry marks");
        chemistry = input.nextInt();
        System.out.println("Enter your pyhsics marks");
        pyhsics = input.nextInt();
        System.out.println("Enter your english marks");
        english = input.nextInt();
        System.out.println("Enter your urdu marks");
        urdu = input.nextInt();
        obtained = math+chemistry+pyhsics+english+urdu;
        float percentage = ((obtained/500)*100);
        System.out.println("Total percentage is "+percentage);

    }
}

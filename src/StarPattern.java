import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        /*
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");

        }
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print("* ");
            }
            System.out.print("\n");

        }

         */
        int i = 0;
        while(i<5){
            int j = i;
            while(j<5){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}

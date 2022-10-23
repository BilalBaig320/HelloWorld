import java .util.Scanner;
public class Array {
    public static void main(String[] args) {
        //1-D array
        int[] mark = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i<5 ; i++ ){
            System.out.print("enter your "+(i+1)+" Marks ");
            mark[i]=input.nextInt();
        }
        // for Displaying array
        for(int i = 0 ; i<5 ; i++ ){
            System.out.println(mark[i]);

        }

//        2-D array
//        int[][] flat = new int[3][3];
//        flat[0][0] = 101;
//        flat[0][1] = 102;
//        flat[0][2] = 103;
//        flat[1][0] = 201;
//        flat[1][1] = 202;
//        flat[1][2] = 203;
//        flat[2][0] = 301;
//        flat[2][1] = 302;
//        flat[2][2] = 303;
//
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(flat[i][j]+" ");
//            }
//            System.out.println();
//        }
//        3D array
//        Scanner input = new Scanner(System.in);
//        int[][][] arr = new int[3][3][3];
//        for (int i = 0; i < 3; i++)
//        {
//            for (int j = 0; j < 3; j++)
//            {
//                for (int k = 0; k < 3; k++)
//                {
//                    arr[i][j][k] = input.nextInt();
//                }
//            }
//
//        }
//        for (int i = 0; i < 3; i++)
//        {
//            for (int j = 0; j < 3; j++)
//            {
//                for (int k = 0; k < 3; k++)
//                {
//                    System.out.print(arr[i][j][k]);
//                }
//                System.out.println();
//            }
//            System.out.println();
//
//        }
      }
}
import java.util.Scanner;
public class ArrayPractice {
    public static void main(String[] args) {
        //first problem to get total sum of  1-D matrix
//        float[] marks={54.0f,65.0f,45.5f,55.0f,44.0f};
//        float total = 0.0f;
//        for(int i=0;i<marks.length;i++){
//            total = total + marks[i];
//        }
//        System.out.println("Total value is "+total);
//    }
//        int[] arr={54,65,45,55,44};
//        boolean check = false;
//        for(int i=0;i<arr.length;i++){
//            if(88==arr[i]){
//                check=true;
//                break;
//            }
//        }
//        if(check){
//            System.out.println("The given value is present in Array");
//        }
//        else{
//            System.out.println("the given value is not present in Array");
//        }
        //Second problem to add to Matrix
//        int [][] mat1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int [][] mat2 = {{2, 6, 13},
//                {3, 7, 1}};
//        int [][] result = {{0, 0, 0},
//                {0, 0, 0}};
//
//        for (int i=0;i<mat1.length;i++){ // row number of times
//            for (int j=0;j<mat1[i].length;j++) { // column number of time
//                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//
//        // Printing the elements of a 2-D Array
//        for (int i=0;i<mat1.length;i++){ // row number of times
//            for (int j=0;j<mat1[i].length;j++) { // column number of time
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(""); // Prints a new line
//        }
        //Find maximum value in an array
//        int[] arr ={4,5,7,9,3};
//        int max =0;
//        for(int element:arr){
//            if(max<element){
//                max=element;
//            }
//        }
//        System.out.println("The maximum element in array is = "+max);
       //find minimum value in an array
//        int[] arr ={4,5,7,9,3};
//        int min = arr[1];
//        for(int element:arr){
//            if(min>element){
//                min=element;
//            }
//        }
//        System.out.println("The maximum element in array is = "+min);
        // Practice Problem 7 to check array is sorted or not
        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }
}

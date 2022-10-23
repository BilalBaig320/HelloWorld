public class VarArgs {

    static int add(int a,int ...arr){
        int result = a;
        for (int element : arr){
            result = result + element;
        }
        return result;
    }


    public static void main(String[] args){
        System.out.println(add(1));
        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6));
    }
}

class A{
    public void math1(){
        System.out.println("this is a mthod of base class");
    }
}
class B extends A{
    @Override
    public void math1(){
        System.out.println("this is a method of subclass which override the method of base class");
    }

}
public class Methods {
    static void change(int a) {
        a = 70;
    }

    static void change2(int[] arr) {
        arr[0]=66;
    }

    public static void main(String[] args) {
//        int x = 10;
//        change(x);
//        System.out.println("the value of x after change " + x);
//
//        int[] marks = {77, 87, 98, 65, 87};
//        change2(marks);
//        System.out.println(marks[0]);
        B b = new B();
        b.math1();
    }

}

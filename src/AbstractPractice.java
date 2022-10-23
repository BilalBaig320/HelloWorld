//abstract class Pen{
//    abstract void write();
//    abstract void refill();
//}
//class FountainPen extends Pen{
//
//    void changeNib(){
//        System.out.println("changing nib");
//    }
//
//    void write(){
//        System.out.println("Writing");
//    }
//    void refill(){
//        System.out.println("Refilling the Pen");
//    }
//}
interface A1{
    default String greet() {
        return "good afternoon ";
    }
}
interface A2{
    default String greet() {
        return "good Morning";
    }
}
class C1 implements A1,A2{
    @Override
    public String greet() {
        return  A1.super.greet();
    }

    public static void main(String[] args) {
        C1 c = new C1();
        System.out.println( c.greet());
    }
}
public class AbstractPractice {
    public static void main(String[] args) {
//        FountainPen fp = new FountainPen();
//        fp.changeNib();
//        Pen p = new FountainPen();
//        p.refill();
    }
}

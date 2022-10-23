interface Bicycle{
    int a =45;
    void applyBrake(int decrement);
    void sppedUp(int increment);

}
interface HornBicycle{
    int b = 80;
    void Horn1();
    void Horn2();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void Hello(){
        greet();
        System.out.println("Hello");
    }
}
class AvonCycle implements Bicycle,HornBicycle{

    public void blowHorn(){
        System.out.println("pee pee poo poo ");
    }
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brakes");
    }

    @Override
    public void sppedUp(int increment) {
        System.out.println("Applying Speed");
    }

    @Override
    public void Horn1() {
        System.out.println("ton ton ton ton");
    }

    @Override
    public void Horn2() {
        System.out.println("tin ton tin ton");
    }
}
public class InterfaceInJava {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applyBrake(12);
        ac.sppedUp(10);
        ac.Horn1();
        ac.Horn2();
        ac.Hello();

    }
}

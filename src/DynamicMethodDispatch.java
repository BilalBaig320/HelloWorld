class Phone{
    public void on(){
        System.out.println("Phone Is Starting ...");
    }
    public void call(){
        System.out.println("Calling ....");
    }
}
class SmartPhome extends Phone{
    public void on(){
        System.out.println("Smartphone Is Starting...");
    }
    public void musin(){
        System.out.println("playing music");
    }

}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhome();
        obj.call();
        obj.on();
    }
}

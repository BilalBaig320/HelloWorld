abstract class parent{
    parent(){
        System.out.println("I am a coustructor of parent class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class child extends parent{

    @Override
    public void greet() {
        System.out.println("good Morning");
    }
}
public class Abstract {
    public static void main(String[] args) {
        child obj = new child();
        obj.sayHello();
    }
}

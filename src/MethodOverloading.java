public class MethodOverloading {
    static void foo(){
        System.out.println("Good Morning Bro");
    }
    static void foo(String a){
        System.out.println("Good Morning "+a+" Bro");
    }
    static void foo(String a , String b ){
        System.out.println("Good Morning " +a+" and "+b+ " Bro");
    }

    public static void main(String[] args) {
        foo();
        foo("Bilal");
        foo("Bilal", "Hamza");
    }
}

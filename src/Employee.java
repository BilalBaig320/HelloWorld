class CellPhone{
    public void Ring(){
        System.out.println("Ringing...");
    }
    public void Vibrate(){
        System.out.println("Vibrating...");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

}
class Rectangle{
    int length ;
    int width ;
    public int areaRectange(){
        return length*width;
    }
    public  int perimeterRectangle(){
        return 2*(length+width);
    }
}
public class Employee {
    int id ;
    String name;
    int salary;
    public Employee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public Employee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("my name is "+name);
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int s){
        salary=s;
    }

    public static void main(String[] args) {
        /*Employee e1 = new Employee();
        e1.id=1;
        e1.name="Bilal";
        e1.setSalary(25000);
        e1.printDetails();
        System.out.println("My salary is "+e1.getSalary());
        Employee e2 = new Employee();
        e2.id=2;
        e2.name="Asad";
        e2.setSalary(50000);
        e2.printDetails();
        System.out.println("My salary is "+e2.getSalary());
        Employee harry = new Employee("ProgrammingWithHarry", 12);

        Square sq = new Square();
        sq.side=8;
        System.out.println(sq.side);
        System.out.println(sq.perimeter());

         */
        Rectangle r1 = new Rectangle();
        r1.width=12;
        r1.length=16;
        System.out.println(r1.areaRectange());
        System.out.println(r1.perimeterRectangle());
    }

}

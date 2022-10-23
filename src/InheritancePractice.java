class Circle{
    int radius;

    public int getRaduis() {
        return radius;
    }
    Circle(int r){
        this .radius =r;
    }
    public double getAreaOfCircle(){
        return (3.142*radius*radius);
    }
}
class Cylinder extends Circle{
    int height;

    public int getHeight() {
        return height;
    }

    Cylinder(int r,int h){
        super(r);
        this.height=h;
    }

    public double getAreaOfCylinder(){
        return (2*3.142*radius*height)+(2*3.142*radius*radius);
    }
}
public class InheritancePractice {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(5,8);
        System.out.println(obj.getAreaOfCylinder());
        System.out.println(obj.getAreaOfCircle());
    }
}

import javax.xml.stream.events.StartDocument;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something..");
    }

    public void printColor() {
        System.out.println(this.color);
    }

}

class Studen {

    String name;
    int age;

    Studen() {
        System.out.println("constructor..");
    }

    Studen(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void printName() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


class Shape {
    public void area() {
        System.out.println("display area");
    }
}

public class OOPS {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // pen1.write();
        // pen1.printColor();

        // Pen pen2 = new Pen();
        // pen2.color = "red";
        // pen2.type = "ballpoint";

        // pen2.write();
        // pen2.printColor();

        Studen s1 = new Studen("om",23);
        // s1.name = "aman";
        // s1.age = 23;

        s1.printName();
    }
    
}
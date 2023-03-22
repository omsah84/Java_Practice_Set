package Classes_and_Object;


abstract class sunstar {
    abstract void printInfo();
}

class employee extends sunstar
{

    void printInfo(){
        System.out.println("hellO");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        employee oj = new employee();
        oj.printInfo();
        
    }
}

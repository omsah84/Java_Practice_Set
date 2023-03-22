package Classes_and_Object;

public class Classes_and_Object {

     // Instance variable
     String name;
     String breek;
     int age;
     String color;

      //constructor decaration of class
      public Classes_and_Object(String name, String breed, String color, int age) {

          this.name = name;
          this.breek = breed;
          this.age = age;
          this.color = color;
      }

      @Override
      public String toString() {
          return ("hi my name is " + this.getName());

      }
      
      public String getName() {
          return name;
        
      }
        

      public static void main(String[] args) {
        
          Classes_and_Object oj = new Classes_and_Object("omsah", "hello", "red", 5);
          System.out.println(oj.toString());

     }
    
    
}

public class SuperKey {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

class Parent {
    String name;
    Parent(){
        System.out.println("Parent is created...");
        System.out.println("name is "+this.name);
    }
}

class Child extends Parent{
    
    Child(){
        
        super(); //to call the immediate parent's constructor, function, properties
        super.name="Horse";
        System.out.println("name is "+super.name);
        System.out.println("Child is created...");
    }
}
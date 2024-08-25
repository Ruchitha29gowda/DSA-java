public class AbstractClasses {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.getName();
        // h.setName("Horse");
        // h.getName();

        // h.eat();
        // Cat c1 = new Cat();
        // c1.eat();

        Mustang m= new Mustang();
        //Animal -> Horse -> Mustang
        
    }
}

abstract class Animal {
    String name;

    //abstract class
    abstract void eat();

    // Non abstract methods
    void getName(){
        System.out.println(this.name);
    }

    Animal(){
        this.name = "Animal";
        System.out.println("Animal contructor called...");
    }
}

class Horse extends Animal{
    void setName(String nm){
        this.name=nm;
    }

    void eat(){
        System.out.println("Horse eats");
    }

    Horse(){
        System.out.println("Horse constructor called...");
    }
}

class Mustang extends Horse{

    Mustang(){
        System.out.println("Mustang Constructor is called...");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("Cat eats");
    }
}


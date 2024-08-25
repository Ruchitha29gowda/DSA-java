public class BasicsClasses{
    public static void main(String[] args) {
        Ruchi r1 = new Ruchi();

        System.out.println(r1+" -> Address of the object");
        System.out.println(r1.name);
        r1.setName("ruchitha gowda");
        System.out.println(r1.age);
        r1.setAge(20);

        Ruchi r2 = new Ruchi("RUCHI", "Nice to meet you");

        Ruchi r3 = new Ruchi(r1);

    }
}

class Ruchi{
    String name;
    int age;

    //setters
    void setName(String nm){
        this.name = nm;
        System.out.println("My name is set to "+this.name);
    }

    //setters
    void setAge(int ag){
        this.age = ag;
        System.out.println("My age is set to "+this.age);
    }

    //getters
    int getAge(){
        return this.age;
    }

    //getters
    String getName(){
        return this.name;
    }

    //unparameterized
    Ruchi(){

    }

    //parameterized
    Ruchi(String nm, String msg){
        this.name = nm;
        System.out.println("\n\n\nHi I'm "+name+", "+ msg);
        System.out.println("I'm a parameterized constructor");
    }

    //copy cobstructor
    Ruchi(Ruchi r1){
        this.name = r1.name;
        this.age = r1. age;

        String str = "My age and name are copied from the object passed in constructor";

        System.out.println("\n\n\n"+str);
    }
}
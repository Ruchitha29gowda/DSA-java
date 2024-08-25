public class Inheritance {
    public static void main(String[] args) {
        Cars c1 = new Cars();
        System.out.println(c1.wheels);
        c1.setWheeels(4);

        System.out.println(c1.wheels);
        c1.wheelsNum(c1.wheels);

        //multilevel inheritance
        Toyota t1 = new Toyota();
        t1.getName();
        t1.wheels = 6;
        System.out.println(t1.wheels);
        t1.wheelsNum(t1.wheels);

        //Hierarchial inheritance
        Bike b1 = new Bike();
        System.out.println(b1.nm);
        b1.run();
    }
}

//Parent class
class Vehicles{
    void run(){
        System.out.println("I'm running");
    }

    void stop(){
        System.out.println("I.ve stopped");
    }

    void wheelsNum(int num){
        System.out.println("I've "+num+" wheels");
    }
}

//Derived class , child class
class Cars extends Vehicles{
    int wheels;

    void setWheeels(int num){
        this.wheels = num;
    }
}


//Multi level inheritance
class Toyota extends Cars{
    String name= "Toyota";
    void getName(){
        System.out.println(this.name);
    }
}

//hierarchial inheritance
class Bike extends Vehicles{
    String nm = "Bike";
}
public class InterfacesBasics {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.eat();

        Bear b = new Bear();
        b.Like();
        b.eat();
    }
}

interface Carnivore {
    //all methods declared here are public and abstract
    void eat();  

    //Interfaces cannot have Constructors
    // Carnivore(){

    // }
}

interface Herbivore {
    //all methods declared here are public and abstract
    void Like();  
}




class Lion implements Carnivore {
    //the inherited method must be public 
    public void eat(){
        System.out.println("I eat meat");
    }
}

//Multiple inheritance
class Bear implements Carnivore, Herbivore{
    public void eat (){
        System.out.println("I eat both : meath and plants");
    }

    public void Like(){
        System.out.println("I Like sleeping ");
    }
}

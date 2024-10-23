package abstraact;

public abstract class Animal {
	abstract void sound();

    //non-abstract method
    void eat() {
        System.out.println("Animal is eating");
    }
}
//class
//subclass for an abstract class
class Lion extends Animal {
    //provide implementation of abstract method
    void sound() {
        System.out.println("Lion roars");
    }

    public static void main(String[] args) {
        Animal A = new Lion();
        //accessing the non-abstract methods
        A.eat();

        //instance for the child class
        Lion L = new Lion();
        //calling abstract methods
        L.sound();
        //calling non-abstract methods
        L.eat();
    }
}

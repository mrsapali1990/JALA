package basicAssinments;

public class CreatingClassObjectMethod {
	//created a method using methodName()
    void isMethod() {
        //fields are used to store data
        String a = "This is a Method";
        System.out.println(a);
    }

    public static void main(String[] args) {
        // Created an object of Basics_01
        CreatingClassObjectMethod obj = new CreatingClassObjectMethod();
        // Calling the method
        obj.isMethod();
    }
}

public class Test3 {

    // Static method
    static void staticMethod() {
        System.out.println("This is a STATIC method");
    }

    // Non-static method
    void nonStaticMethod() {
        System.out.println("This is a NON-STATIC method");
    }

    public static void main(String[] args) {

        // Calling static method
        staticMethod();            // Direct call
        Test3.staticMethod();       // Using class name

        // Calling non-static method
        Test3 obj = new Test3();     // Create object
        obj.nonStaticMethod();     // Call using object
    }
}



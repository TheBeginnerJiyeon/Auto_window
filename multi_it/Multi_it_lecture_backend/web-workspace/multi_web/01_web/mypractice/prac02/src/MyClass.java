public class MyClass {
    // Static field
    static int staticField = 10;

    public static void main(String[] args) {
        // Accessing static field directly using the class name
        System.out.println("Static field value: " + MyClass.staticField);

        // Creating instances of MyClass
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        // Modifying static field through one instance
        obj1.staticField = 20;

        // Accessing static field through another instance
        System.out.println("Static field value (obj2): " + obj2.staticField);
    }
}

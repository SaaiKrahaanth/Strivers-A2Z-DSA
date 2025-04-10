package Lec1_ThingsToKnowInProgramming;

public class _08_PassByValueReference {
    int number;
    }
class Test {
    public static void main(String[] args) {


        //Pass by Reference
        _08_PassByValueReference obj = new _08_PassByValueReference();
        obj.number = 10;
        System.out.println("Before: " + obj.number); // Output: 10
        _08_PassByValueReference obj2 = obj;
        obj2.number=20;
        System.out.println("After: " + obj2.number); // Output: 20
        System.out.println("After: " + obj.number); // Output: 20
        
        // obj2 is a reference to the same object as obj
       

        //In Java, all objects are passed by reference. This means that when you pass an object to a method, you are passing a reference to the object, not a copy of the object itself.
        //This means that if you modify the object inside the method, the changes will be reflected outside the method as well.
        //However, if you reassign the reference to a new object inside the method, the original object outside the method will not be affected.
        //This is because the reference itself is passed by value, not the object it points to.
        //In other words, the reference to the object is passed by value, but the object itself is passed by reference.
        //This is why Java is said to be "pass by value" for primitive types and "pass by reference" for objects.
        //However, it is important to note that Java is always pass by value. This means that when you pass a variable to a method, a copy of the variable is made and passed to the method.



    }
}
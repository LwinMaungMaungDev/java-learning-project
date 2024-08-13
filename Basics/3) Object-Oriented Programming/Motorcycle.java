class Motorcycle {
    String make;
    String color;
    boolean engineState;

    void startEngine() {
        if (engineState == true)
            System.out.println("The engine is already on.");
        else {
            engineState = true;
            System.out.println("The engine is now on.");
        }
    }

    void showAtts() {
        System.out.println("This motorcycle is a " + color + " " + make);
        if (engineState == true)
            System.out.println("The engine is on.");
        else System.out.println("The engine is off.");
    }

    public static void main (String args[]) {
        Motorcycle m = new Motorcycle();
        m.make = "Yamaha RZ350";
        m.color = "yellow";
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("--------");
        System.out.println("Starting engine...");
        m.startEngine();
        System.out.println("--------");
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("--------");
        System.out.println("Starting engine...");
        m.startEngine();
    }
}

/*
    1) make, color and engineState are instance variables.

    2) startEngine is a method.

    3) The indentation of each part of the class isn’t important to the Java compiler.
    Using some form of indentation, however, makes your class definition easier for
    you and for other people to read.

    4) To do something with the Motorcycle class — for example, to create instances of that class and
    play with them — you’re going to need to create a Java application that uses this class or add a
    main method to this one. For simplicity’s sake, we will do the latter. 
*/
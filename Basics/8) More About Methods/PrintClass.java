class PrintClass {
    int x = 0;
    int y = 1;

    void printMe() {
        System.out.println("X is " + x + ", Y is " + y);
        System.out.println("I am an instance of the class " + this.getClass().getName());
    }
}

class PrintSubClass extends PrintClass {
    int z = 3;
    
    public static void main (String args[]) {
        PrintSubClass obj = new PrintSubClass();
        obj.printMe();
    }
}

/*
    In the main() method of PrintSubClass, you create a PrintSubClass object and call the
    printMe() method. Note that PrintSubClass doesn’t define this method, so Java looks for
    it in each of PrintSubClass’s superclasses—and finds it, in this case, in PrintClass.
    Unfortunately, because printMe() is still defined in PrintClass, it doesn’t print the z instance
    variable.
*/

class PrintSubClass2 extends PrintClass {
    int z = 3;

    void printMe() {
        System.out.println("x is " + x + ", y is " + y + ", z is " + z);
        System.out.println("I am an instance of the class " + this.getClass().getName());
    }

    public static void main (String args[]) {
        PrintSubClass2 obj = new PrintSubClass2();
        obj.printMe();
    }
}

/*
    Now, when you instantiate this class and call the printMe() method, the version of printMe()
    you defined for this class is called instead of the one in the superclass PrintClass (as you can see
    in this output)
*/

class PrintSubClass3 extends PrintClass {
    int z = 3;

    void printMe() {
        super.printMe();
        System.out.println("Z is " + z);
    }

    public static void main (String args[]) {
        PrintSubClass3 obj = new PrintSubClass3();
        obj.printMe();
    }
}

/*
    Rather than duplicating most of the behavior of the superclass’s method in the subclass, you can
    rearrange the superclass's method so that additional behavior can easily be added
*/

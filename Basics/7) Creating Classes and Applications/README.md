# Defining Classes

- class MyClassName { ... }

If this class is a subclass of another class, use extends to indicate the superclass of this class:

- class MyClassName extends MySuperClassName { ... }

If this class implements a specific interface, use implements to refer to that interface.

- class MyRunnableClassName implements Runnable { ... }

# Instance Variables

- class Bicycle extends PersonPoweredVehicle {
-     String bikeType;
-     int chainGear;
-     int rearCogs;
- }

# Constants

To declare a constant, use the final keyword before the variable declaration and include an initial value for that variable:

final float pi = 3.141592;
final boolean debug = false;
final int maxsize = 40000;

# Class Variables

To declare a class variable, use the static keyword in the class declaration:

static int sum;
static final int maxObjects = 10;

# Methods

returntype methodname (type1 arg1, type2 arg2, type3 arg3..) { ... }

- int[] makeRange (int lower, int upper) {...}

# The this Keyword

Keep in mind that because "this" is a reference to the current instance of a class, it makes sense
to use it only inside the body of an instance method definition. Class methods, that is, methods
declared with the static keyword, cannot use "this".

# Class Methods

To define class methods, use the static keyword in front of the method definition, just as you would create a class variable.

- static int max (int arg1, int arg2) { ... }

- int count = Integer.parseInt("42", 10) // returns 42

Most methods that operate on a particular object, or that affect that object, should be defined as instance methods. Methods that provide some general utility but do not directly affect an instance of that class are better declared as class methods.

# Passing Arguments to Java Programs

To pass arguments to a Java program, you merely append them to the command line when you run your Java program:

- java Myprogram argumentOne 2 three

On this command line, you have three arguments: argumentOne, the number 2, and three.

To group arguments, surround them with double-quotes. This command line produces one argument:

- java myprogram "Java is cool"

# Handling Arguments in Your Java Program

How does Java handle arguments? It stores them in an array of strings, which is passed to the main() method in your Java program. Remember the signature for main():

- public static void main (String arg[]) {...}

An important thing to note about the arguments you pass into a Java program is that those arguments will be stored in an array of strings. This means that any arguments you pass to your Java program will be converted to strings so they can be stored in the argument array. To treat them as non-strings, you’ll have to convert them to whatever type you want them to be.

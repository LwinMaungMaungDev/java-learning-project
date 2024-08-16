# What new Does

What does new do? When you use the new operator, several things happen: first, the new instance
of the given class is created, and memory is allocated for it. In addition (and most importantly),
when the new object is created, a special method defined in the given class is called. This special
method is called a constructor.

Constructors are special methods for creating and initializing new instances of classes.
Constructors initialize the new object and its variables, create any other objects that object
needs, and generally perform any other operations the object needs to run.

Multiple constructor definitions in a class can each have a different number or type of
arguments—then, when you use new, you can specify different arguments in the argument list,
and the right constructor for those arguments will be called. When you create your own classes, you can define as many constructors as you need to
implement that class’s behavior.

# Class Variables

With instance variables, each new instance of the class gets a new copy of the instance variables
that class defines. Each instance can then change the values of those instance variables without
affecting any other instances. With class variables, there is only one copy of that variable. Every
instance of the class has access to that variable, but there is only one value. Changing the value
of that variable changes it for all the instances of that class.

You define class variables by including the static keyword before the variable itself.

- static String surname = "Johnson";

FamilyMember dad = new FamilyMember()
dad.surname
FamilyMember.surname

Because you can use an instance to change the value of a class variable, it's easy to become
confused about class variables and where their values are coming from (remember, the value of
a class variable affects all the instances). For this reason, it's a good idea to use the name of the
class when you refer to a class variable—it makes your code easier to read and strange results
easier to debug.

# Methods

System.out.println(), the method you’ve been using all through the book this far, is a great
example of nesting variables and methods. The System class (part of the java.lang package)
describes system-specific behavior. System.out is a class variable that contains an instance of the
class PrintStream that points to the standard output of the system. PrintStream instances have
a println() method that prints a string to that output stream.

# Class Methods

Class methods, like class variables, apply to the class as a whole and not to its instances. Class methods are commonly used for general utility methods that may not operate directly on an instance of that class, but fit with that class conceptually. For example, the String class contains a class method called valueOf(), which can take one of many different types of arguments (integers, booleans, other objects, and so on). The valueOf() method then returns a new instance of String containing the string value of the argument it was given. This method doesn't operate directly on an existing instance of String, but getting a string from another object or data type is definitely a String-like operation, and it makes sense to define it in the String class.

Class methods can also be useful for gathering general methods together in one place (the class). For example, the Math class, defined in the java.lang package, contains a large set of mathematical operations as class methods—there are no instances of the class Math, but you can still use its methods with numeric or boolean arguments.

To call a class method, use dot notation as you do with instance methods. As with class variables, you can use either an instance of the class or the class itself on the left site of the dot. However,
for the same reasons noted in the discussion on class variables, using the name of the class for class variables makes your code easier to read. The last two lines in this example produce the same result:

String s, s2;
s = "foo";
s2 = s.valueOf(5);
s2 = String.valueOf(5);

# Casting and Converting Objects and Primitive Types

Casting is a mechanism of converting the value of an object or primitive type into another type. The result of a cast is a new object or value; casting does not affect the original object or value.

There are three forms of casts and conversions:

1. Casting between primitive types: int to float to boolean
2. Casting between object types: an instance of a class to an instance of another class
3. Converting primitive types to objects and then extracting primitive values back out of those objects

## Casting Primitive Types

Casting between primitive types most commonly occurs with the numeric types; boolean values cannot be cast to any other primitive type. You can, however, cast 1 or 0 to boolean values.

- Often, if the type you are casting to is "larger" than the type of the value you’re converting, you may not have to use an explicit cast.

- To convert a large value to smaller type, you must use an explicit cast, because converting that value may result in a loss of precision.

- (typename) value
  (int) (x / y);

Note that because the precedence of casting is higher than that of arithmetic, you have to use parentheses so that the result of the division is what gets cast to an int.

## Casting Objects

Instances of classes can also be cast to instances of other classes, with one restriction: the class of the object you’re casting and the class you’re casting it to must be related by inheritance; that is, you can cast an object only to an instance of its class's sub- or superclass—not to any random class.

Analogous to converting a primitive value to a larger type, some objects may not need to be cast explicitly. In particular, because instances’ subclasses usually contain all the information that instances’ superclasses do, you can use an instance of a subclass anywhere a superclass is expected. Suppose you have a method that takes two arguments: one of type Object, and one of type Number. You don’t have to pass instances of those particular classes to that method. For the Object
argument, you can pass any subclass of Object (any object, in other words), and for the Number argument you can pass in any instance of any subclass of Number (Integer, Boolean, Float, and so on).

Casting an object to an instance of one of that object’s superclasses loses the information the
original subclass provided and requires a specific cast. To cast an object to another class, you use
the same casting operation that you used for base types:

- (classname) object
  GreenApple a;
  Apple a2;
  a = new GreenApple();
  a2 = (Apple) a;

GreenApple is theoretically a subclass of Apple.

In addition to casting objects to classes, you can also cast objects to interfaces—but only if that
object’s class or one of its superclasses actually implements that interface. Casting an object to
an interface then enables you to call one of that interface’s methods even if that object’s class does
not directly implement that interface.

## Converting Primitive Types to Objects and Vice Versa

Now you know how to cast a primitive type to another primitive type and how to cast between classes. How can you cast one to the other?
You can't! Primitive types and objects are very different things in Java and you can't automatically cast or convert between the two.

However, the java.lang package includes several special classes that correspond to each primitive data type: Integer for ints, Float for floats, Boolean for booleans, and so on. Using class methods defined in these classes, you can create an object-equivalent for all the primitive types using new.

- Integer intObject = new Integer(35);

Once you have actual objects, you can treat those values as objects. Then, when you want the primitive values back again, there are methods for that as well—for example, the intValue() method extracts an int primitive value from an Integer object:

- int theInt = intObject.intValue(); // returns 35

# Comparing Objects

The operators for equality: == (equal) and != (not equal). These operators, when used with objects, tests whether the two operands refer to exactly the same object.

If you want to be able to compare instances of your class and have
meaningful results? You have to implement special methods in your class, and you have to call those methods using those method names.

It is possible to have two strings, two independent objects in memory with the same values—that is, the same characters in the same order.
According to the == operator, however, those two String objects will not be equal, because, although their contents are the same, they are not the same object.

The String class, therefore, defines a method called equals() that tests each character in the string and returns true if the two strings have the same values.

# Copying Objects

How do you create copies of objects? There are two ways: the copy() method and the clone() method.

The copy() method (defined in Object, and so available to all objects), takes a single argument— another instance of the same class—and copies the values of all the argument's instance variables into the instance variables of the current object (the one in which you're calling the method). Note that if those instance variables in turn hold references to objects, only the references are copied, not the objects.

- Point pt1, pt2, pt3;
  pt1 = new Point(0,0);
  pt2 = new Point(100,100);
  pt2.copy(pt1); // pt1's values are copied into pt2; both now are (0,0).

The clone() method is similar to copy(), except that clone() takes no arguments. The clone() method creates a new instance of the same class as the source object and then copies the values of the instance variables (either primitive types or references to other objects). clone() returns an instance of the class Object; to use it as an instance of the original class you have to cast it. Here’s an example that clones the Point object in pt2 and stores the result in pt3:

- pt3 = (Point) pt2.clone();

# Determining the Class of an Object

Want to find out the class of an object? Here's the way to do it for an object assigned to the variable obj:

- String name = obj.getClass().getName();

Another test that might be useful to you is the instanceof operator. instanceof has two operands: an object on the left, and the name of a class on the right. The expression returns true or false based on whether the object is an instance of the named class or any of that class's superclasses:

- "foo" instanceof String // true
  Point pt = new Point(10,10);
  pt instanceof String // false

The instanceof operator can also be used for interfaces; if an object implements an interface, the instanceof operator with an interface name on the right side returns true.

# The Java Class Libraries

Here are the class packages that are part of the Java class libraries:

1. java.lang: Classes that apply to the language itself, which includes the Object class, the String class, and the System class. It also contains the special classes for the primitive types (Integer, Character, Float, and so on).
2. java.util: Utility classes, such as Date, as well as simple collection classes, such as Vector and Hashtable.
3. java.io: Input and output classes for writing to and reading from streams (such as standard input and output) and for handling files.
4. java.net: Classes for networking support, including Socket and URL (a class to represent references to documents on the World Wide Web).
5. java.awt: (the Abstract Window Toolkit): Classes to implement a graphical user interface, including classes for Window, Menu, Button, Font, CheckBox, and so on. This package also includes classes for processing images (the java.awt.Image package).
6. java.applet: Classes to implement Java applets, including the Applet class itself, as well as the AudioClip class.

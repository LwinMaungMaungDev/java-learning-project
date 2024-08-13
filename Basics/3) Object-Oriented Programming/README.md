# Objects and Classes

A class is a template for multiple objects with similar features. Classes embody all the
features of a particular set of objects. When you write a program in an object-oriented language, you don’t define actual objects. You
define classes of objects.

An instance of a class is another word for an actual object. If classes are an abstract
representation of an object, an instance is its concrete representation.

In fact, the terms instance and object are often used interchangeably in OOP language. An
instance of a tree and a tree object are both the same thing.

A class library is a set of classes

# Behavior and Attributes

Every class you write in Java is generally made up of two components: attributes and behavior.

Attributes are the individual things that differentiate one object from another and determine the
appearance, state, or other qualities of that object. Attributes are defined by variables; in fact, you can consider them analogous to global variables
for the entire object.

A class’s behavior determines what instances of that class do when their internal state changes
or when that instance is asked to do something by another class or object. Behavior is the way
objects can do anything to themselves or have anything done to them.

# Inheritance

With inheritance, all classes—those you write, those from other class libraries that you use,
and those from the standard utility classes as well—are arranged in a strict hierarchy.

Subclasses inherit all the methods and variables from their superclasses—that is, in any particular
class, if the superclass defines behavior that your class needs, you don’t have to redefine it or copy
that code from some other class. Your class automatically gets that behavior from its superclass,
that superclass gets behavior from its superclass, and so on all the way up the hierarchy. Your
class becomes a combination of all the features of the classes above it in the hierarchy.

At the top of the Java class hierarchy is the class Object; all classes inherit from this one superclass.
Object is the most general class in the hierarchy; it defines behavior specific to all objects in the
Java class hierarchy. Each class farther down in the hierarchy adds more information and
becomes more tailored to a specific purpose. In this way, you can think of a class hierarchy as defining very abstract concepts at the top of the hierarchy and those ideas becoming more
concrete the farther down the chain of superclasses you go.

This mechanism for defining new classes as the
differences between them and their superclasses is called subclassing. Subclassing involves creating a new class that inherits from some other class in the class
hierarchy. Using subclassing, you only need to define the differences between your class
and its parent; the additional behavior is all available to your class through inheritance.

What if your class defines entirely new behavior, and isn’t really a subclass of another class? Your
class can also inherit directly from Object, which still allows it to fit neatly into the Java class
hierarchy. In fact, if you create a class definition that doesn’t indicate its superclass in the first
line, Java automatically assumes you’re inheriting from Object. The Motorcycle class you created
in the previous section inherited from Object.

# Creating a Class Hierarchy

When you develop your classes in a hierarchy, you can factor out information common to multiple classes in superclasses, and then reuse that superclass’s information
over and over again. Each subclass gets that common information from its superclass.

Changing (or inserting) a class further up in the hierarchy automatically changes the
behavior of the lower classes — no need to change or recompile any of the lower
classes, because they get the new information through inheritance and not by copying
any of the code.

# How Inheritance Works

For instance variables, when you create a new instance of a class, you get a “slot” for each variable
defined in the current class and for each variable defined in all its superclasses. In this way, all
the classes combine to form a template for the current object and then each object fills in the
information appropriate to its situation.

Methods operate similarly: new objects have access to all the method names of its class and its
superclasses, but method definitions are chosen dynamically when a method is called. That is,
if you call a method on a particular object, Java first checks the object’s class for the definition
of that method. If it’s not defined in the object’s class, it looks in that class’s superclass, and so
on up the chain until the method definition is found.

Overriding a method is creating a method in a subclass that has the same signature (name,
number and type of arguments) as a method in a superclass. That new method then hides
the superclass’s method.

# Single and Multiple Inheritance

Java’s form of inheritance, as you learned in the previous sections, is called single inheritance.
Single inheritance means that each Java class can have only one superclass (although any given
superclass can have multiple subclasses).

In other object-oriented programming languages, such as C++ and Smalltalk, classes can have
more than one superclass, and they inherit combined variables and methods from all those
classes.

# Interfaces and Packages

Recall that Java classes have only a single superclass, and they inherit variables and methods from
that superclass and all its superclasses. Although single inheritance makes the relationship
between classes and the functionality those classes implement easy to understand and to design,
it can also be somewhat restricting—in particular, when you have similar behavior that needs
to be duplicated across different “branches” of the class hierarchy. Java solves this problem of
shared behavior by using the concept of interfaces.

An interface is a collection of method names, without actual definitions, that indicate that
a class has a set of behaviors in addition to the behaviors the class gets from its superclasses.

Packages in Java are a way of grouping together related classes and interfaces. Packages
enable modular groups of classes to be available only if they are needed and eliminate
potential conflicts between class names in different groups of classes.

To refer to a class within a package, list all the packages that class is contained in and
the class name, all separated by periods (.). For example, take the Color class, which is
contained in the awt package (awt stands for Abstract Windowing Toolkit). The awt
package, in turn, is inside the java package. To refer to the Color class in your program, you use the notation

- java.awt.Color.

* Classes from packages other than
  java.lang must be explicitly imported or referred to by full package name.

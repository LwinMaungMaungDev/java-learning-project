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

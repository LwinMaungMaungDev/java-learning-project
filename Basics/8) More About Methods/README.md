# Overloading Methods

When you call a method in an object, Java matches up the method name and the number and type of arguments to choose which method definition to execute. To create an overloaded method, all you need to do is create several different method definitions in your class, all with the same name, but with different parameter lists (either in number or type of arguments) and with different bodies.

Note that Java differentiates overloaded methods with the same name, based on the number and type of parameters to that method, not on its return type. The variable names you choose for each parameter to the method are irrelevant—all that matters is the number and the type.

- See MyRect.java

# Constructor Methods

When you use new to create a new instance of a class, Java does three things:

1. Allocates memory for the object
2. Initializes that object's instance variables, either to their initial values or to a default (0 for numbers, null for objects, false for booleans)
3. Calls the class's constructor method (which may be one of several methods)

If a class doesn't have any special constructor methods defined, you'll still end up with an object.

You can also overload constructors, as you would regular methods, to create an object that has specific properties based on the arguments you give to new.

- See Person.class

# Calling Anothe Constructor

Some constructors you write may be a superset of another constructor defined in your class; that is, they might have the same behavior plus a little bit more. Rather than duplicating identical behavior in multiple constructor methods in your class, it makes sense to be able to just call that first constructor from inside the body of the second constructor. Java provides a special syntax for doing this. To call a constructor defined on the current class, use this form:

- this(arg1, arg2, arg3...);

The arguments to this are, of course, the arguments to the constructor.

# Overloading Constructors

Like regular methods, constructors can also take varying numbers and types of parameters, enabling you to create your objects with exactly the properties you want it to have, or for it to be able to calculate properties from different kinds of input.

- See MyRect2.java

# Overriding Methods

To override a method, all you have to do is create a method in your superclass that has the same signature (name, return type, and parameter list) as a method defined by one of your class's superclasses.

- See PrintClass.java (PrintClass, PrintSubClass, PrintSubClass2)

# Calling the Original Method

By overriding a method and giving that method a new definition, you've hidden the original method definition. But sometimes you may just want to add behavior to the original definition rather than erase it altogether. This is particularly useful where you end up duplicating behavior in both the original method and the method that overrides it; by being able to call the original method in the body of the overridden method, you can add only what you need.

- See PrintClass.java (PrintSubClass3)

# Overriding Constructors

Constructors cannot technically be overridden. Because they always have the same name as the current class, you're always creating new constructors instead of inheriting the ones you've got. Much of the time, this is fine, because when your class's constructor is called, the constructor with the same signature for all your superclass is also called, so initialization of all the parts of a class you inherit can happen.

However, when you're defining constructors for your own class, you may want to change how your object is initialized, not only by initializing the information your class adds, but also to change the information that is already there. You can do this by explicitly calling your superclass's constructors.

To call a regular method in a superclass, you use super.methodname(arguments). Because with constructors you don't have a method name to call, however, you have to use a different form:

- super(arg1, arg2, ...);

Similar to using this(...) in a constructor, super(...) calls the constructor method for the immediate superclass (which may, in turn, call the constructor of its superclass, and so on).

- See NamePoint.java

# Finalizer Methods

Finalizer methods are like the opposite of constructor methods; whereas a constructor method is used to initialize an object, finalizer methods are called just before the object is garbage collected and its memory reclaimed.

To create a finalizer method, include a method with the following signature in your class definition:

void finalize() {
...
}

Before you start using finalizer methods extensively in your Java programs, however, be aware that finalizer methods have several very important restrictions. First of all, the finalizer method is not guaranteed to be called until the object’s memory is actually reclaimed, which may be some time after you’ve removed all references to that object.

You can always call the finalize() method yourself at any time; it’s just a plain method like any other. However, calling finalize() does not trigger an object to be garbage-collected. Only removing all references to an object will cause it to be marked for deleting, and even then, Java may or may not call the finalize() method itself—regardless of whether or not you’ve already called it.

Finalizer methods are best used for optimizing the removal of an object—for example, by removing references to other objects, by cleaning up things that object may have touched, or for other optional behaviors that may make it easier for that object to be removed. In most cases, you may not need to use finalize() at all.

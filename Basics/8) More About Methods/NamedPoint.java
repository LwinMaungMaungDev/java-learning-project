import java.awt.Point;

class NamePoint extends Point {
    String name;

    NamePoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }
}

/*
    NamedPoint, which extends the class Point from
    Java's awt package. The Point class has only one constructor, which takes an x and a y argument
    and returns a Point object. NamedPoint has an additional instance variable (a string for the name)
    and defines a constructor to initialize x, y, and the name.

    The constructor defined here for NamedPoint (lines 6 through 8) calls Point's constructor
    method to initialize Point's instance variables (x and y). Although you can just as easily
    initialize x and y yourself, you may not know what other things Point is doing to initialize
    itself, so it's always a good idea to pass constructors up the hierarchy to make sure everything
    is set up correctly.
*/

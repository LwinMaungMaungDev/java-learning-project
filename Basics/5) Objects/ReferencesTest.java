import java.awt.Point;

class ReferencesTest {

    public static void main (String args[]) {
        Point pt1, pt2;
        pt1 = new Point(100, 100);
        pt2 = pt1;

        pt1.x = 200;
        pt1.y = 200;
        System.out.println("Point1: " + pt1.x + ", " + pt1.y);
        System.out.println("Point2: " + pt2.x + ", " + pt2.y);
    }
}

/*
    As you work with objects, one important thing going on behind the scenes is the use of references
    to those objects. When you assign objects to variables, or pass objects as arguments to methods,
    you are passing references to those objects, not the objects themselves or copies of those objects.

    There are no explicit pointers or pointer arithmetic in Java—just
    references. However, because of Java references, you have most of the capabilities
    that you have with pointers without the confusion and lurking bugs that explicit
    pointers can create.
*/

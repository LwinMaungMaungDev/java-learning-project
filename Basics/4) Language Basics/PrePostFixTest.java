class PrePostFixTest {
    public static void main (String args[]) {
        int x = 0;
        int y = 0;

        System.out.println("x and y are " + x + " and " + y);
        x++;
        System.out.println("x++ results in " + x);
        ++x;
        System.out.println("++x results in " + x);
        System.out.println("Resetting x back to 0.");
        x = 0;
        System.out.println("----------------------");
        y = x++;
        System.out.println("y = x++ (postfix) results in:");
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("----------------------");

        y = ++x;
        System.out.println("y = ++x (prefix) results in:");
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("----------------------");
    }
}

/*
    y = x++;
    y = ++x;

    These two expressions give very different results because of the difference between prefix and
    postfix. When you use postfix operators (x++ or x––), y gets the value of x before before x is
    incremented; using prefix, the value of x is assigned to y after the increment has occurred. Listing
    3.2 is a Java example of how all this works.

    Technically, this description is not entirely correct. In reality, Java
    always completely evaluates all expressions on the right of an expression before
    assigning that value to a variable, so the concept of “assigning x to y before x is
    incremented” isn’t precisely right. Instead, Java takes the value of x and “remembers” it, evaluates (increments) x, and then assigns the original value of x to y.
    Although in most simple cases this distinction may not be important, for more
    complex expressions with side effects it may change the behavior of the expression
    overall. See the Language Specification for many more details about the details of
    expression evaluation in Java.
*/

class ArithmeticTest {
    public static void main (String[] args) {
        short x = 6;
        int y = 4;
        float a = 12.5f;
        float b = 7f;

        System.out.println("x is " + x + ", y is " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        System.out.println("a is " + a + ", b is " + b);
        System.out.println("a / b = " + (a / b));
    }
}

/*
    byte   => 8 bits  (-128 to 127)
    short  => 16 bits (-32,768 to 32,767)
    int    => 32 bits (–2,147,483,648 to 2,147,483,647)
    long   => 64 bits (–9223372036854775808 to 9223372036854775807)

    float  => 32 bits, single-precision
    double => 64 bits, double-precision

    You can string together variable names with the same type:
    int x, y, z;
    String firstName, LastName; 

    You can also give each variable an initial value when you declare it:
    int myAge, mySize, numShoes = 28;
    String myName = “Laura”;
    boolean isTired = true;
    int a = 4, b = 5, c = 6;
*/
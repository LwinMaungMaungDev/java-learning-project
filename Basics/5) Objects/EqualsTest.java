class EqualsTest {

    public static void main (String args[]) {
        String str1, str2;
        str1 = "she sells sea shells by the sea shore.";
        str2 = str1;

        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2));

        str2 = new String(str1);

        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2));
        System.out.println("Same value? " + str1.equals(str2));
    }
}

/*
    The String class, defines a method called equals() 
    that tests each character in the string and returns true if 
    the two strings have the same values.

    Why can’t you just use another literal when you change str2,
    rather than using new? String literals are optimized in Java—if you create a string
    using a literal, and then use another literal with the same characters, Java knows
    enough merely to give you the first String object back. Both strings are the same
    objects—to create two separate objects you have to go out of your way.
*/

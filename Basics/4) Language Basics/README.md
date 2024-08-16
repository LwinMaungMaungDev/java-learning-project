# Statements and Expressions

Statements sometimes return values—for example, when you add two numbers together or test
to see whether one value is equal to another. These kind of statements are called expressions.

# Variables and Data Types

Java actually has three kinds of variables: instance variables, class variables, and local variables.

Instance variables, as you learned yesterday, are used to define attributes or the state for a
particular object. Class variables are similar to instance variables, except their values apply to all
that class’s instances (and to the class itself) rather than having different values for each object.
Local variables are declared and used inside method definitions, for example, for index counters
in loops, as temporary variables, or to hold values that you need only inside the method
definition itself.

Unlike other languages, Java does not have global variables — that is, variables that are global to all parts of a program. Instance and class variables can be
used to communicate global information between and among objects. Remember,
Java is an object-oriented language, so you should think in terms of objects and
how they interact, rather than in terms of programs.

Local variables must be given values before they can be used (your Java program will not compile
if you try to use an unassigned local variable). For this reason, it's a good idea always to give local
variables initial values. Instance and class variable definitions do not have this restriction (their
initial value depends on the type of the variable: null for instances of classes, 0 for numeric
variables, '\0' for characters, and false for booleans).

The variable type can be one of three things:

1. One of the eight basic primitive data types (byte, short, int, long, float, double, char, boolean)
2. The name of a class
3. An array

# Literals

Literal is a programming language term, which essentially means that what you type is
what you get. For example, if you type 4 in a Java program, you automatically get an integer
with the value 4. If you type 'a', you get a character with the value a.

\udddd is Unicode character
"This string brought to you by Java\u2122"
This Unicode code sequence for \u2122 produces a trademark symbol (™).

# Expressions and Operators

Expressions are statements that return a value.
Operators are special symbols that are commonly used in expressions

y = x++;
y = ++x;

These two expressions give very different results because of the difference between prefix and
postfix. When you use postfix operators (x++ or x––), y gets the value of x before before x is
incremented; using prefix, the value of x is assigned to y after the increment has occurred. Listing
3.2 is a Java example of how all this works.

# Logical Operators

For AND combinations, use either the & or &&. The expression will be true only if both operands
tests are also true; if either expression is false, the entire expression is false. The difference between
the two operators is in expression evaluation. Using &, both sides of the expression are evaluated
regardless of the outcome. Using &&, if the left side of the expression is false, the entire expression
returns false, and the right side of the expression is never evaluated.

For OR expressions, use either | or ||. OR expressions result in true if either or both of the operands
is also true; if both operands are false, the expression is false. As with & and &&, the single |
evaluates both sides of the expression regardless of the outcome; with ||, if the left expression
is true, the expression returns true and the right side is never evaluated.

The XOR operator ^ returns true only if its operands are different (one
true and one false, or vice versa) and false otherwise (even if both are true).

In general, only the && and || are commonly used as actual logical combinations. &, |, and ^ are
more commonly used for bitwise logical operations.

For NOT, use the ! operator with a single expression argument.

# Operator Precedence

> increment and decrement
> arithmetic expressions
> comparisons
> logical expressions
> Assignment expressions

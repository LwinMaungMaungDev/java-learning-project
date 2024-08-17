# Arrays

Arrays can contain any type of value (base types or objects), but you can't store different types in a single array.

## Declaring Array Variables

String difficultWords[];
Point hits[];
int temps[];

- OR

String[] difficultWords;
Point[] hits;
int[] temps;

## Creating Array Objects

String[] names = new String[10]
int[] temps = new int[99];

When you create an array object using new, all its elements are initialized for you (0 for numeric arrays, false for boolean, '\0' for character arrays, and null for everything else).

- OR

String[] chiles = { "jalapeno", "anaheim", "serrano", "habanero", "thai" };

## Accessing Array Elements

myArray[subscript];

The subscript is the slot within the array to access.

int len = arr.length

String arr[] = new String[10];
arr[10] = "eggplant";

A program with that last statement in it produces a compiler error at that line when you try to
compile it. The array stored in arr has only ten elements numbered from 0, the element at
subscript 10 doesn't exist, and the Java compiler will check for that.

## Changing Array Elements

myarray[1] = 15;
sentence[0] = "The";
sentence[10] = sentence[0];

## Multidimensional Arrays

Java does not support multidimensional arrays. However, you can declare and create an array of arrays (and those arrays can contain arrays, and so on, for however many dimensions you need),

int coords[][] = new int[12][12];
coords[0][0] = 1;
coords[0][1] = 2

# if Conditionals

- if (engineState)
-     System.out.println("Engine is already on.");
- else {
-     System.out.println("Now starting Engine");
-     if (gasLevel >= 1)
-         engineState = true;
-     else System.out.println("Low on gas! Can't start engine.");
- }

# The Conditional Operator

The conditional operator is an expression, meaning that it returns a value (unlike the more general if, which can result in any statement or block being executed).

- int smaller = x < y ? x : y;

# switch Conditionals

- switch (test) {
-     case valueOne:
-         resultOne;
-         break;
-     case valueTwo:
-         resultTwo;
-         break;
-     case valueThree:
-         resultThree;
-         break;
-     ...
-     default: defaultresult;
- }

Note that the significant limitation of the switch in Java is that the tests and values can be only simple primitive types (and then only primitive types that are castable to int). You cannot use larger primitive types (long, float) or objects within a switch, nor can you test for any relationship other than equality. This limits the usefulness of switch to all but the simplest cases; nested ifs can work for any kind of test on any type.

# for Loops

- String strArray[] = new String[10];
- int i;
- for (i = 0; i < strArray.length; i++)
-     strArray[i] = "";

You can also have an empty statement for the body of your for loop, if everything you want to do is in the first line of that loop. For example, here’s one that finds the first prime number higher than 4000:

- for (i = 4001; notPrime(i); i += 2)
- ;

# while Loop

- while (condition) {
-     bodyOfLoop;
- }

Note that if the condition is initially false the first time it is tested, the body of the while loop will never be executed. If you need to execute the loop at least once, you can do one of two things:

1. Duplicate the body of the loop outside the while loop
2. Use a do loop

The do loop is considered the better solution of the two.

# do Loop

The main difference is that while loops test the condition before looping, making it possible that the body of the loop will never execute if the condition is false the first time it’s tested. do loops run the body of the loop at least once before testing the condition.

- do {
-     bodyOfLoop;
- } while (condition);

- int x = 1;
- do {
-     System.out.println("Looping, round " + x);
-     x++;
- } while (x <= 10);

# Breaking Out of Loops

For example, suppose you have a while loop that copies elements from one array into another. Each element in the array should be copied until the end of the array is reached or if an element contains 0. You can test for that latter case inside the body of the while and then use a break to exit the loop:

- while (count < array1.length) {
-     if (array1[count] == 0) {
-         break;
-     }
-     array2[count] = array1[count];
-     count++;
- }

"continue" is similar to break except that instead of halting execution of the loop entirely, the loop starts over at the next iteration. For do and while loops, this means the execution of the clock starts over again; for 'for' loops, the increment expression is evaluated and then block is executed.

Note that because you’re skipping elements in the first array, you now have to keep track of two different array counters:

- while (count < array1.length) {
-     if (array1[count] == 0)
-         continue;
-     array2[count2++] = (float)array1[count++];
- }

# Labeled Loops

Both break and continue can have an optional label that tells Java where to break to. Without a label, break jumps outside the nearest loop (to an enclosing loop or to the next statement outside the loop), and continue restarts the enclosing loop. Using labeled breaks and continues enables you to break outside nested loops or to continue a loop outside the current loop.

To use a labeled loop, add the label before the initial part of the loop, with a colon between them. Then, when you use break or continue, add the name of the label after the keyword itself:

Example 1

- out:
-     for (int i = 0; i <10; i++) {
-         while (x < 50) {
-             if (i * x == 400)
-                 break out;
-             ...
-         }
-         ...
-     }

Example 2

- foo:
-     for (int i = 1; i <= 5; i++)
-         for (int j = 1; j <= 3; j++) {
-             System.out.println("i is " + i + ", j is " + j);
-             if ((i + j) > 4)
-                 break foo;
-         }
- System.out.println("end of loops");

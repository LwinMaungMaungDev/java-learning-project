class SumAverage {
  public static void main (String args[]) {
    int sum = 0;

    for (int i = 0; i < args.length; i++) {
      sum += Integer.parseInt(args[i]);
    }

    System.out.println("Sum is: " + sum);
    System.out.println("Average is: " + (float)sum / (float)args.length);
  }
}

/*
  Run this program by passing command-line arguments
  java SumAverage 1 2 3

  An important thing to note about the arguments you pass into a Java program 
  is that those arguments will be stored in an array of strings. 
  This means that any arguments you pass to your Java program will be 
  converted to strings so they can be stored in the argument array.
  To treat them as non-strings, you’ll have to convert them to whatever type 
  you want them to be.
*/
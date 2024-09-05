class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void printPerson() {
        System.out.println("Hi, my name is " + name);
        System.out.println(". I am " + age + " years old.");
    }

    public static void main (String args[]) {
        Person p;

        p = new Person("Laura", 20);
        p.printPerson();
        System.out.println("----------");

        p = new Person("Tommy", 3);
        p.printPerson();
        System.out.println("----------");
    }
}

/*
    A simple class called Person, with a constructor that initializes
    its instance variables based on the arguments to new. 
*/

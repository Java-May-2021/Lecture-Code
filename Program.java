public class Program {
  public static void main(String[] args) {
    byte myByte = 100; // -128 to 127
    short myShort = 1000; // -32,768 to 32,767
    int myInt = 10000000; // -2,147,483,648 to 2,147,483,647
    long myLong = 10000000000000L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float myFloat = 3.14f; // 6 or 7 decimal digits
    double myDouble = 3.134547565; // 15 decimal digits

    boolean myBool = false; // true or false values
    char myChar = 'c';

    Integer myInteger = 39;
    Character myCharacter = 'd';

    // Strings
    String myName = "Matthew";

    System.out.println(myName.length());
    String myString = "Java May 2021";
    String mYSTRING = "Is great";
    String mySTring = "so great to learn";

    int isOdd = 5;

    if (isOdd % 2 != 0) {
      System.out.println("Number is odd");
    } else {
      System.out.println("Number is not odd");
    }

    String name = "Matt";
    String name2 = "Matt";
    System.out.println(name.equals(name2));

    // Loops
    int i = 0;
    while (i < 4) {
      System.out.println(i);
      i++;
    }

    for (int j = 0; j < 4; j++) {
      System.out.println(j);
    }

    sayHello();
  }

  public static void sayHello() {
    System.out.println("Hello!");
  }
}

/*
 * javascript function sayHello(){ console.log("Hello"); }
 * 
 * sayHello();
 * 
 * def sayHello() print("hello")
 * 
 * sayHello()
 */
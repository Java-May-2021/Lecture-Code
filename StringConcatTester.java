public class StringConcatTester {
  // Entry Point Method
  public static void main(String[] args) {
    StringConcat manipulator = new StringConcat();
    char letter = 'o';
    Integer a = manipulator.getIndexOrNull("Coding", letter);
    Integer b = manipulator.getIndexOrNull("Hello World", letter);
    Integer c = manipulator.getIndexOrNull("Hi", letter);
    System.out.println(a); // 1
    System.out.println(b); // 4
    System.out.println(c); // null
    // Concat and Substring
    String word = manipulator.concatSubString("Hello", 1, 2, "world");
    System.out.println(word); // eworld
  }
}
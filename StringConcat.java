public class StringConcat {
  // The file where the methods live
  public Integer getIndexOrNull(String word, char letter) {
    if (word.indexOf(letter) == -1) {
      return null;
    } else {
      return word.indexOf(letter);
    }
  }

  public String concatSubString(String word, int num1, int num2, String replacement) {
    String subString;
    subString = word.substring(num1, num2);
    return subString.concat(replacement);
  }
}
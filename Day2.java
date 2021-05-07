import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Day2 {
  public static void main(String[] args) {
    String name = "Matt";
    String name2 = "Matt";

    String name3 = new String("Rickie");
    String name4 = new String("Rickie");
    System.out.println(name3.equals(name4));

    String[] people = { "Matthew", "Bronson", "Rickie", "Aaron" };
    Object[] differentThings = { "Matt", true, 23 };

    int[] numbers = new int[10];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 1;
    }
    System.out.println(Arrays.toString(numbers));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("one");
    stringList.add("two");
    stringList.add("three");

    System.out.println(stringList.indexOf("asdfadsfdasf")); // array[index]

    // For Each Loop
    for (String thisNumber : stringList) {
      System.out.println(thisNumber);
    }

    // HashMaps
    HashMap<String, String> ourHobbies = new HashMap<String, String>();
    ourHobbies.put("Matthew", "Photography");
    ourHobbies.put("Bronson", "Bodybuilding");
    ourHobbies.put("Jonathan", "Golfing");
    ourHobbies.put("Rickie", "Architecture");
    ourHobbies.put("Steve", "Golfind");
    ourHobbies.put("Aaron", "backpacking");
    ourHobbies.put("Hwasoo", "Golf");
    ourHobbies.put("Evghenia", "Singing");
    ourHobbies.put("Will", "Python");

    for (HashMap.Entry<String, String> nameHobby : ourHobbies.entrySet()) {
      System.out.println("key = " + nameHobby.getKey() + ", Value = " + nameHobby.getValue());
    }

    System.out.println(maxArrayValue(numbers));
    sayHey("Hwasoo");
  }

  public static void sayHey(String name) {
    System.out.println("Hey " + name);
  }

  public static int maxArrayValue(int[] nums) {
    int maxNumber = nums[0];
    for (int i = 0; i <= nums.length; i++) {
      try {
        if (maxNumber < nums[i]) {
          maxNumber = nums[i];
        }
      } catch (Exception e) {
        System.out.println(e);
      }
    }
    return maxNumber;
  }
}
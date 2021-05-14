public class PizzaTester {
  // Entry Point Method
  public static void main(String[] args) {
    Pizza.advertise();
    Pizza myPizza = new Pizza("XL", new String[] { "Jalapenos", "cheese", "Pepperoni", "peppers", "Pineapple" },
        "Stuffed", 10);

    Pizza myPizza2 = new Pizza("L", new String[] { "Bacon", "cheese", "Mushroom", "Ranch" });
    myPizza.eatSlice(4);
    System.out.println(myPizza.getSlices());
  }
}
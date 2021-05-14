import java.util.Arrays;

public class Pizza {
  // Things that a pizza has
  private String size;
  private String[] toppings;
  private String crustType;
  private int slices;
  static int pizzasMade;

  // Method Overloading
  public Pizza(String size, String[] toppings) {
    this.size = size;
    this.toppings = toppings;
    this.crustType = "Super Stuffed Crust";
    this.slices = 16;
    pizzasMade++;
  }

  public Pizza(String size, String[] toppings, String crustType, int slices) {
    this.size = size;
    this.toppings = toppings;
    this.crustType = crustType;
    this.slices = slices;
    pizzasMade++;
  }

  public String getSize() {
    return this.size;
  }

  public String[] getToppings() {
    return this.toppings;
  }

  public String getCrustType() {
    return this.crustType;
  }

  public int getSlices() {
    return this.slices;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public void setToppings(String[] toppings) {
    this.toppings = toppings;
  }

  public void setCrustType(String crustType) {
    this.crustType = crustType;
  }

  public void setSlices(int slices) {
    this.slices = slices;
  }

  // Things we can do with a pizza object
  // Advertise()
  public static void advertise() {
    System.out.println("Welcome to Matt's Pizzeria, we're not mob owned or controller.. we promise.. wink wink");
  }
  // eat()

  public void displayPizza() {
    System.out.printf("This is a size %s pizza with %d slices and a %s crustType with %s toppings \n", this.size,
        this.slices, this.crustType, Arrays.toString(this.toppings));
  }

  public int eatSlice(int numberOfSlices) {
    System.out.println("You have eaten " + numberOfSlices + " slice of " + Arrays.toString(this.toppings) + " pizza");
    this.slices = this.slices - numberOfSlices;
    return this.slices;
  }

  public int eatSlice() {
    this.eatSlice(1);
    return this.slices;
  }
}
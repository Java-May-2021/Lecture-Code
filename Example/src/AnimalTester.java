import java.util.ArrayList;

public class AnimalTester {
	public static void main(String[] args) {
		Animal lion = new Animal("Tony", "lion", 15, 100);
		ArrayList<Animal> myAnimals = new ArrayList<Animal>();
		
		myAnimals.add(lion);
		
		for(Animal a : myAnimals) {
			System.out.println(a.sayHello());
		}
	}
}

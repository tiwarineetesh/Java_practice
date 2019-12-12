/**
 * 
 */
package nt.basics;

/**
 * @author mapit
 *
 */
public class PolymorphismEx1 {
	
	public static void main(String[] args) {
	    Animal myAnimal = new Animal();  // Create a Animal object
	    Animal myCat = new Cat();  // Create a Cat object
	    Animal myDog = new Dog();  // Create a Dog object
	    myAnimal.animalSound();
	    myCat.animalSound();
	    myDog.animalSound();

	}
}

	class Animal {
		public void animalSound() {
			System.out.println("The animal makes a sound");
		}
	}

	class Cat extends Animal {
		
		public void animalSound() {
			super.animalSound();
			System.out.println("The Cat says: Miaun Miaun");
		}
  
		public void animalSound(int x) {
			System.out.println("Sometimes Cat says: weee weee");
		}
	  
		public static void main(String[] args) {
			
			Cat cat = new Cat();
			cat.animalSound();			
			cat.animalSound(1);
		}

	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}
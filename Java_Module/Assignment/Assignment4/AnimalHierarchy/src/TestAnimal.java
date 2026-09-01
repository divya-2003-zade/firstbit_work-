class Animal{
	String name;
	int age;
	
	Animal() {
		this.name = "NA";
		this.age = 0;
	}
	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
	void display() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
}
class Mammal extends Animal{
	String furColor;
    String habitat;
    
    Mammal() {
        super();
        this.furColor = "NA";
        this.habitat = "NA";
    }

	Mammal(String name, int age,String furColor, String habitat) {
		super(name,age);
		this.furColor = furColor;
		this.habitat = habitat;
	}

	String getFurColor() {
		return furColor;
	}

	void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	String getHabitat() {
		return habitat;
	}

	void setHabitat(String habitat) {
		this.habitat = habitat;
	}
    void display() {
    	super.display();
    	System.out.println("Fur Color : "+this.furColor);
    	System.out.println("Habitat : "+this.habitat);
    }
}
class Dog extends Mammal{
	String breed;
    String trainingLevel;
    
    Dog() {
        super();
        this.breed = "NA";
        this.trainingLevel = "NA";
    }
    Dog(String name, int age, String furColor, String habitat, String breed, String trainingLevel) {
            super(name, age, furColor, habitat);
            this.breed = breed;
            this.trainingLevel = trainingLevel;
        }
	String getBreed() {
		return breed;
	}
	void setBreed(String breed) {
		this.breed = breed;
	}
	String getTrainingLevel() {
		return trainingLevel;
	}
	void setTrainingLevel(String trainingLevel) {
		this.trainingLevel = trainingLevel;
	}
    void display() {
    	super.display();
    	System.out.println("Breed : " + this.breed);
        System.out.println("Training Level : " + this.trainingLevel);
    }
}
class TestAnimal {

	public static void main(String[] args) {
		System.out.println("Animal Details");
		Animal a = new Animal("Tiger",8);
		a.display();
		System.out.println();
		
		System.out.println("Mammal Details");
		a=new Mammal("Elephant", 15, "Grey", "Forest");
		a.display();
		System.out.println();
		
		System.out.println("Dog Details");
		a= new Dog("Tommy", 4, "Brown", "Domestic","Labrador", "Advanced");
		a.display();
		
	}

}

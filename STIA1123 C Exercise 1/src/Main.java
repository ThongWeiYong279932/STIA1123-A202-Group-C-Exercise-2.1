
public class Main {

	public static void main(String[] args) {
		Animals Goat = new Animals();
		Animals Crocodile = new Animals();
		Goat.name = "Goat";
		Goat.type = "Mammals";
		Goat.Dietary = "Herbivore";
		Goat.Thermoregulation = "Warm-blooded";
		Crocodile.name = "Crocodile";
		Crocodile.type = "Reptiles";
		Crocodile.Dietary = "Carnivore";
		Crocodile.Thermoregulation = "Cold-blooded";
		
		System.out.println("Object 1 : " + Goat.name + "\n" + "Type : " + Goat.type + "\n" + "Dietary : "+Goat.Dietary + "\n" 
							+ "Thermoregulation : "+Goat.Thermoregulation);
		Goat.Behaviour();
		System.out.println();
		System.out.println("Object 2 : " + Crocodile.name + "\n" + "Type : " + Crocodile.type + "\n" + "Dietary : " + Crocodile.Dietary + "\n" 
							+ "Thermoregulation : "+Crocodile.Thermoregulation);
		Crocodile.Behaviour();

	}

}

package ex3;

import ex3.entite.Animal;
import ex3.entite.AnimalType;
import ex3.entite.RegimeAlimentaire;
import ex3.entite.Zoo;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Animal("Lion", AnimalType.MAMMIFERE, "Savane", RegimeAlimentaire.CARNIVORE));
		zoo.addAnimal(new Animal("Éléphant", AnimalType.MAMMIFERE, "Savane", RegimeAlimentaire.HERBIVORE));
		zoo.addAnimal(new Animal("Carpe", AnimalType.POISSON, "Aquarium", RegimeAlimentaire.HERBIVORE));
		zoo.addAnimal(new Animal("Python", AnimalType.REPTILE, "FermeReptile", RegimeAlimentaire.CARNIVORE));
		zoo.addAnimal(new Animal("Tortue", AnimalType.REPTILE, "FermeReptile", RegimeAlimentaire.HERBIVORE));

		zoo.afficherListeAnimaux();
	}
}
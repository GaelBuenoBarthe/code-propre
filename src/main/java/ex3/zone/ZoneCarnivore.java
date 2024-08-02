package ex3.zone;

import ex3.entite.Animal;
import ex3.entite.RegimeAlimentaire;

import java.util.ArrayList;
import java.util.List;

public class ZoneCarnivore {

	private List<Animal> animaux;

	public ZoneCarnivore() {
		this.animaux = new ArrayList<>();
	}

	public void addAnimal(Animal animal) {
		if (animal.getRegimeAlimentaire() == RegimeAlimentaire.CARNIVORE) {
			animaux.add(animal);
		} else {
			System.out.println("Cet animal n'est pas un carnivore.");
		}
	}

	public void afficherListeAnimaux() {
		for (Animal animal : animaux) {
			System.out.println(animal.toString() + " (Zone Carnivore)");
		}
	}
}
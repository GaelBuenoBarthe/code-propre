package ex3.zone;

import ex3.entite.Animal;
import ex3.entite.RegimeAlimentaire;

import java.util.ArrayList;
import java.util.List;

public class SavaneAfricaine {

	private List<Animal> animaux;

	public SavaneAfricaine() {
		this.animaux = new ArrayList<>();
	}

	public void addAnimal(Animal animal) {
		if (animal.getRegimeAlimentaire() != RegimeAlimentaire.CARNIVORE) {
			animaux.add(animal);
		}
	}

	public void afficherListeAnimaux() {
		for (Animal animal : animaux) {
			System.out.println(animal.toString());
		}
	}
}
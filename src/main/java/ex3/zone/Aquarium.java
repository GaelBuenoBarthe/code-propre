package ex3.zone;

import ex3.entite.Animal;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

	private List<Animal> animaux;

	public Aquarium() {
		this.animaux = new ArrayList<>();
	}

	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	public void afficherListeAnimaux() {
		for (Animal animal : animaux) {
			System.out.println(animal.toString());
		}
	}
}
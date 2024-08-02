package ex3.entite;

import ex3.zone.Aquarium;
import ex3.zone.FermeReptile;
import ex3.zone.SavaneAfricaine;
import ex3.zone.ZoneCarnivore;

public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;

	public Zoo(String nom) {
		this.nom = nom;
		this.savaneAfricaine = new SavaneAfricaine();
		this.zoneCarnivore = new ZoneCarnivore();
		this.fermeReptile = new FermeReptile();
		this.aquarium = new Aquarium();
	}

	public void addAnimal(Animal animal) {
		if (animal.getType() == AnimalType.MAMMIFERE) {
			if (animal.getRegimeAlimentaire() == RegimeAlimentaire.CARNIVORE) {
				zoneCarnivore.addAnimal(animal);
			}
			savaneAfricaine.addAnimal(animal);
		} else if (animal.getType() == AnimalType.REPTILE) {
			if (animal.getRegimeAlimentaire() == RegimeAlimentaire.CARNIVORE) {
				zoneCarnivore.addAnimal(animal);
			}
			fermeReptile.addAnimal(animal);
		} else if (animal.getType() == AnimalType.POISSON) {
			aquarium.addAnimal(animal);
		}
	}

	public void afficherListeAnimaux() {
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}
}
package ex2;

/**
 * Représente un livret A avec un taux de rémunération annuel.
 */
public class LivretA extends CompteBancaire {
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0); // Un livret A ne peut pas être à découvert
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant >= 0) {
			this.solde -= montant;
		} else {
			System.out.println("Débit refusé : un livret A ne peut pas avoir un solde négatif.");
		}
	}

	/**
	 * Applique la rémunération annuelle au solde du livret A.
	 */
	public void appliquerRemunerationAnnuelle() {
		this.solde += this.solde * this.tauxRemuneration;
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
package ex2;

/**
 * Représente un compte bancaire avec un solde et un découvert autorisé.
 */
public class CompteBancaire {
	protected double solde;
	protected double decouvertAutorise;

	public CompteBancaire(double solde, double decouvertAutorise) {
		this.solde = solde;
		this.decouvertAutorise = decouvertAutorise;
	}

	/**
	 * Débite un montant du compte bancaire.
	 *
	 * @param montant le montant à débiter
	 */
	public void debiterMontant(double montant) {
		if (this.solde - montant >= -this.decouvertAutorise) {
			this.solde -= montant;
		} else {
			// Gérer le cas où le découvert autorisé est dépassé
		}
	}

	/**
	 * Ajoute un montant au solde.
	 *
	 * @param montant le montant à ajouter
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	// Getters and setters
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}
}

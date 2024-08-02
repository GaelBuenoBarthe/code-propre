package ex2;

/**
 * Représente un compte courant avec un solde et un découvert autorisé.
 */
public class CompteCourant extends CompteBancaire {

    public CompteCourant(double solde, double decouvertAutorise) {
        super(solde, decouvertAutorise);
    }

    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant >= -this.decouvertAutorise) {
            this.solde -= montant;
        } else {
            System.out.println("Débit refusé : découvert autorisé dépassé.");
        }
    }
}
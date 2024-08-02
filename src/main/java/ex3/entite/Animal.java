package ex3.entite;

public class Animal {

    private Long id;
    private String nom;
    private AnimalType type;
    private String zone;
    private RegimeAlimentaire regimeAlimentaire;

    public Animal() {}

    public Animal(String nom, AnimalType type, String zone, RegimeAlimentaire regimeAlimentaire) {
        this.nom = nom;
        this.type = type;
        this.zone = zone;
        this.regimeAlimentaire = regimeAlimentaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public RegimeAlimentaire getRegimeAlimentaire() {
        return regimeAlimentaire;
    }

    public void setRegimeAlimentaire(RegimeAlimentaire regimeAlimentaire) {
        this.regimeAlimentaire = regimeAlimentaire;
    }

    @Override
    public String toString() {
        return "Le " + nom + " est un animal de type " + type + " avec un régime " + regimeAlimentaire + " qui est dans la zone " + zone;
    }
}
public class Employe implements Comparable<Employe> {

    private int identifiant, grade;
    private String nom, prenom, departement;

    public Employe() {
    }

    public Employe(int identifiant, int grade, String nom, String prenom, String departement) {
        this.identifiant = identifiant;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.departement = departement;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Employe{ identifiant=" + identifiant + ", grade=" + grade + ", nom=" + nom + ", prenom=" + prenom + ", departement=" + departement + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe employe)) return false;
        return getIdentifiant() == employe.getIdentifiant() && getNom().equals(employe.getNom());
    }


    @Override
    public int compareTo(Employe o) {
        return this.identifiant - o.identifiant;
    }
}

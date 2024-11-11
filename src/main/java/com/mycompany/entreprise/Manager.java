package com.mycompany.entreprise;

public class Manager extends Employee {
    public String dateFonction;

    public Manager(String nom, String dateEmbauche, String dateFonction) {
        this.nom = nom;
        this.dateEmbauche = dateEmbauche;
        this.salaire = 10000.0;
        this.dateFonction = dateFonction;
    }

    public int anciennete(String dateCourante) {
        return nbMoisEcoules(dateCourante, this.dateFonction);
    }

    public String toString() {
        return super.toString() + " Date d'entrée en fonction: " + dateFonction + " Statut: Manager";
    }
}


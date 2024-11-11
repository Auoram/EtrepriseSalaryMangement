package com.mycompany.entreprise;

import java.util.Scanner;

public class Employee {
    public String nom;
    public String dateEmbauche;
    public double salaire;
    public static int augmentation = 10;

    public String toString() {
        return "Nom: " + nom + " Date d'embauche: " + dateEmbauche + " Salaire: " + salaire;
    }

    public Employee() {
        this.nom = "";
        this.dateEmbauche = "";
        this.salaire = 7000.0;
    }

    public Employee(String nom, String dateEmbauche) {
        this.nom = nom;
        this.dateEmbauche = dateEmbauche;
        this.salaire = 7000.0;
    }

    public Employee(String nom, String dateEmbauche, double salaire) {
        this.nom = nom;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    public int anciennete(String dateCourante) {
        return nbMoisEcoules(dateCourante, this.dateEmbauche);
    }

    public double augSalaire(String dateCourante) {
        int mois = anciennete(dateCourante);
        return salaire + augmentation * mois;
    }

    protected int nbMoisEcoules(String dateCourante, String dateDebut) {
        Scanner sc = new Scanner(dateCourante).useDelimiter("/");
        int Ac = sc.nextInt();
        int Mc = sc.nextInt();
        int Jc = sc.nextInt();
        
        Scanner sd = new Scanner(dateDebut).useDelimiter("/");
        int Ad = sd.nextInt();
        int Md = sd.nextInt();
        int Jd = sd.nextInt();
        
        int mois = (Ac - Ad) * 12 + (Mc - Md);
        return mois;
    }

    public static void setAugmentation(int augmentation) {
        Employee.augmentation = augmentation;
    }
    
    public void lireEmploye(String entree) {
    Scanner sc = new Scanner(entree).useDelimiter(" ; ");
    this.nom = sc.next();
    this.dateEmbauche = sc.next();
    
    if (sc.hasNextDouble()) {
        this.salaire = sc.nextDouble();
    } else {
        System.err.println("Salary is not a valid number in the input: " + entree);
    }
}

}


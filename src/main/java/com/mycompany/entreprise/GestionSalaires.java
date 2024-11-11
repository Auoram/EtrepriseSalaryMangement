package com.mycompany.entreprise;

import java.io.*;
import java.util.*;

public class GestionSalaires {

    public static Entreprise lireDonnees(String nomFichier) throws FileNotFoundException {
        
        Entreprise entreprise = new Entreprise();
        Scanner s = new Scanner(new File(nomFichier));

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] data = line.split(";");
            String nom = data[0].trim();
            String dateEmbauche = data[1].trim();
            double salaire = Double.parseDouble(data[2].trim());

            Employee e = new Employee(nom, dateEmbauche, salaire);
            entreprise.ajouterEmp(e);
        }
        s.close();
        return entreprise;
    }

    public static void main(String[] args) {
        try {
            Entreprise entreprise = lireDonnees("Employe.txt");

            System.out.println(entreprise.toString());

            String dateCourante = "2024/11/06";
            entreprise.augmenterSalaires(dateCourante);

        } catch (FileNotFoundException e) {
            System.err.println("Erreur : Fichier introuvable !");
        }
    }
}


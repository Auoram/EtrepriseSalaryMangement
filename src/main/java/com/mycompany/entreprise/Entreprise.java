package com.mycompany.entreprise;

public class Entreprise {
    private Employee[] entreprise;
    private int capacite = 10;
    private int nbEmp = 0;

    public Entreprise() {
        entreprise = new Employee[capacite];
    }    
    
    public void ajouterEmp(Employee e) {
        if (nbEmp == capacite) {
            redimensionner();
        }
        entreprise[nbEmp++] = e;
    }

    private void redimensionner() {
        capacite *= 2;
        Employee[] Entreprise2 = new Employee[capacite];
        System.arraycopy(entreprise, 0, Entreprise2, 0, nbEmp);
        entreprise = Entreprise2;
    }

    public Employee rechercherEmp(String nom) {
        for (int i = 0; i < nbEmp; i++) {
            if (entreprise[i].nom.equals(nom)) {
                return entreprise[i];
            }
        }
        return null;
    }

    public void supprimerEmp(Employee e) {
        for (int i = 0; i < nbEmp; i++) {
            if (entreprise[i].equals(e)) {
                entreprise[i] = entreprise[--nbEmp];
                break;
            }
        }
    }
    
    public boolean estVide() {
        return nbEmp == 0;
    }

    public void augmenterSalaires(String dateCourante) {
        for (int i = 0; i < nbEmp; i++) {
            System.out.println(entreprise[i].toString());
            System.out.println("Nouveau salaire: " + entreprise[i].augSalaire(dateCourante));
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nbEmp; i++) {
            result.append(entreprise[i].toString()).append("\n");
        }
        return result.toString();
    }
}


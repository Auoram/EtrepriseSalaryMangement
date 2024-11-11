package com.mycompany.entreprise;

public class Test {
    public static void main(String[] args) {
        Entreprise entreprise = new Entreprise();

        Employee e1 = new Employee("Sanae", "2020/10/11", 8000);
        Employee e2 = new Employee("Ali", "2019/01/01");
        Manager m1 = new Manager("Alaz", "2015/12/26", "2017/08/18");

        entreprise.ajouterEmp(e1);
        entreprise.ajouterEmp(e2);
        entreprise.ajouterEmp(m1);

        System.out.println("Tablean des enployés : ");
        System.out.println(entreprise.toString());

        String dateCourante = "2024/11/06";
        entreprise.augmenterSalaires(dateCourante);
    }
}


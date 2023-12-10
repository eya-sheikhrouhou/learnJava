package levels;

import models.Teacher;
import utils.Data;

import java.util.Comparator;
import java.util.List;

public class Level1 {

    public static void main(String[] args) {
        List<Teacher> employees = Data.employees();

        /*
         * TO DO 1: Afficher tous les enseignants
         */
        employees.stream().forEach(System.out::println);


        /*
         * TO DO 2: Afficher les enseignants dont le nom commence par la lettre n
         */
        employees.stream().filter(t -> t.getName().startsWith("n")).forEach(System.out::println);

        /*
         * TO DO 3: Afficher les enseignants dont le nom commence par la lettre n et le salaire > 100000
         */
        employees.stream()
                .filter(t -> t.getName().startsWith("n"))
                .filter(t -> t.getSalary() > 100000)
                .forEach(System.out::println);


        /*
         * TO DO 4: Afficher les enseignants JAVA triés par salaire (éliminer les redondances)
         */
        employees.stream()
                .filter(t -> t.getSubject() == models.Subject.JAVA)
                .distinct()
                .sorted((t1, t2) -> Integer.compare(t2.getSalary(), t1.getSalary()))
                .forEach(System.out::println);

        /*
         * TO DO 5: Afficher les noms des enseignants dont le salaire > 60000 avec 2 manières différentes
         */

        /* First Way */
        employees.stream()
                .filter(t -> t.getSalary() > 60000)
                .map(Teacher::getName)
                .forEach(System.out::println);
        /* Second Way */
        employees.stream()
                .filter(t -> t.getSalary() > 60000)
                .forEach(t -> System.out.println(t.getName()));


        /*
         * TO DO 6:  Ajouter 200 Dt pour les enseignants dont le nom commence par m et afficher celui qui a le salaire le plus élevé
         */
        Teacher teacherWithMaxSalary = employees.stream()
                .filter(t -> t.getName().startsWith("m"))
                .peek(t -> t.setSalary(t.getSalary() + 200))
                .max(Comparator.comparingInt(Teacher::getSalary))
                .orElse(null);

        System.out.println("200 Dt pour les enseignants dont le nom commence par m et afficher celui qui a le salaire le plus élevé: " + teacherWithMaxSalary);
    }
    }


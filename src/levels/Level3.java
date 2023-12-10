package levels;

import models.Teacher;
import utils.Data;

import java.util.*;
import java.util.stream.Collectors;

public class Level3 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();


        /* TO DO 1: Retourner une chaine de caractère qui contient tous les noms des enseignants en majuscule separés par # */
        String names = teachers.stream()
                .map(Teacher::getName)
                .map(String::toUpperCase)
                .collect(Collectors.joining("#"));
        System.out.println("Noms en majuscules séparés par #: " + names);

        /* TO DO 2: Retourner une set d'enseignants Java dont le salaire > 80000 */
        Set<Teacher> teachers1 = teachers.stream()
                .filter(t -> t.getSubject() == models.Subject.JAVA && t.getSalary() > 80000)
                .collect(Collectors.toSet());
        System.out.println("Enseignants Java dont le salaire > 80000: " + teachers1);/* TO DO 3 */;

        /* TO DO 3: Retourner une TreeSet d'enseignants (tri par nom et en cas d'égalité tri par salaire) */
        TreeSet<Teacher> teachers2 = teachers.stream()
                .collect(Collectors.toCollection(() ->
                        new TreeSet<>(Comparator.comparing(Teacher::getName)
                                .thenComparingInt(Teacher::getSalary))));
        System.out.println("TreeSet d'enseignants triés par nom et salaire: " + teachers2);
        /* TO DO 4 */;

        /* TO DO 4: Retourner une Map qui regroupe les enseignants par module */
        Map<models.Subject, List<Teacher>> map = teachers.stream()
                .collect(Collectors.groupingBy(Teacher::getSubject));
        System.out.println("Map regroupant les enseignants par module: " + map);/* TO DO 5 */;

        /* TO DO 5: Retourner une Map qui regroupe les nom des enseignants par salaire */
        Map<Integer, String> map1 = teachers.stream()
                .collect(Collectors.groupingBy(Teacher::getSalary,
                        Collectors.mapping(Teacher::getName, Collectors.joining(", "))));
        System.out.println("Map regroupant les noms des enseignants par salaire: " + map1);/*TO DO 6*/;


    }
}

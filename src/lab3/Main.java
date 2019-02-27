package lab3;

import lab3.utilitys.BelarusInfo;
import lab3.utilitys.University;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> students2 = new ArrayList<>();
        ArrayList<Group> groups = new ArrayList<>();
        ArrayList<Department> departments = new ArrayList<>();

        students.add(new Student("Evgeniy", "Vashkevich", 5286578));
        students.add(new Student("Liza", "Stankevich", 1234567));
        students.add(new Student("Pasha", "Shpilevskiy", 2455234));
        students2.add(new Student("Arteom", "Kurskov", 7688456));
        students2.add(new Student("Jenua", "Azarevich", 1433567));

        groups.add(new Group(624401));
        groups.add(new Group(624402));

        departments.add(new Department("FITU"));

        students.get(0).setGroup(groups.get(0));
        students.get(1).setGroup(groups.get(0));
        students.get(2).setGroup(groups.get(0));
        students2.get(0).setGroup(groups.get(1));
        students2.get(1).setGroup(groups.get(1));

        groups.get(0).setStudents(students);
        groups.get(1).setStudents(students2);
        groups.get(0).setHeadman(students.get(2));
        groups.get(1).setHeadman(students2.get(1));

        departments.get(0).setGroups(groups);

        University.showStudents(students);
        System.out.println();
        University.showDepartments(departments);
    }
}

package collections.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Student.CNPSizeException {
        List students = new ArrayList<Student>();
        Student stud = new Student("1234512346", "Andrei Popescu2");
        students.add(new Student("1234567890", "And Maria"));
        students.add(new Student("1234512345", "Andrei Popescu"));
        students.add(new Student("1234567891", "And Maria2"));
        students.add(new Student("1234567890", "And Maria"));
        students.add(stud);
        students.add(stud);
        students.add(stud);

        StudentDatabase sd = new StudentDatabase(students);

        String name = sd.findStudentName("1234512345");
        System.out.println(name);

        String name1 = sd.findStudentName("1234512349");

        System.out.println(students);
        HashSet<Student> hashStudents = new HashSet<>(students);
        System.out.println("HS= " + hashStudents);
    }
}

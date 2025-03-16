package Q6;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student("Chamith", 95);
        Student s2 = new Student("Minidu", 90);
        Student s3 = new Student("Tharindu", 88);
        Student s4 = new Student("Nuwan", 82);
        Student s5 = new Student("Lasantha", 85);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        int total = 0;
        for (Student student : students) {
            total += student.getMarks();
        }
        double average = total / (double) students.size();
        System.out.println("Average Marks: " + average);
    }
}

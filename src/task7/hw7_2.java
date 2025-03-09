package task7;

import java.util.Arrays;

public class hw7_2 {
    public static void main(String[] args) {
        Student [] students = new Student[5];
        students[0] = new Student(1, "Anton", "Petrov", "TTLP", 4, "6MOLK", 80);
        students[1] = new Student(2, "Ivan", "Ivanov", "TTLP", 4, "6MOLK", 6);
        students[2] = new Student(3, "Petr", "Sidorov", "TTLP", 4, "6MOLK", 4);
        students[3] = new Student(4, "Stepan", "Stepnov", "TTLP", 4, "6MOLK", 7);
        students[4] = new Student(5, "Leonid", "Leonidov", "TTLP", 4, "6MOLK", 9);
        System.out.println(students[0].info());

//        Student studentObject = new Student(); // Создаем экземпляр Student, чтобы вызвать метод getStudents
//        Student[] highGradeStudents = studentObject.getStudents(students, 3);
//
//
//        System.out.println("\nСтуденты с оценкой выше 80:");
//        for (Student students : highGradeStudents) {
//            students.info(); // Вызываем метод info для каждого студента
//
//        }
    }
}

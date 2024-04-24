package Capitulo04.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student account1 = new Student("Willian", 90.33);
        Student account2 = new Student("John", 85.39);

        System.out.printf("%s's letter grade is: %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n", account2.getName(), account2.getLetterGrade());
    }
}

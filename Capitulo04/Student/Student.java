package Capitulo04.Student;

public class Student {
    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;
        if (average > 0.0)
            if (average <= 100.0)
                this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        if (average > 0.0)
            if (average <= 100.0)
                this.average = average;
    }

    public String getLetterGrade() {
        String letterGrade = "";

        if (this.average >= 90.0)
            letterGrade = "A";
        else if (this.average >= 80)
            letterGrade = "B";
        else if (this.average >= 70)
            letterGrade = "C";
        else if (this.average >= 60)
            letterGrade = "D";
        else
            letterGrade = "E";

        return letterGrade;
    }
}

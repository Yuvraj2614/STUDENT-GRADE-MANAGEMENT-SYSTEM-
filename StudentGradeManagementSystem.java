import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    // Constructor
    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate GPA (average marks out of 10)
    public double calculateGPA() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.length;
        return average / 10; // GPA scale (0–10)
    }

    // Method to display grade based on GPA
    public String getGrade() {
        double gpa = calculateGPA();
        if (gpa >= 9) return "A+";
        else if (gpa >= 8) return "A";
        else if (gpa >= 7) return "B";
        else if (gpa >= 6) return "C";
        else return "D";
    }

    // Display student details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("GPA: " + calculateGPA());
        System.out.println("Grade: " + getGrade());
    }
}

public class StudentGradeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter marks for " + n + " subjects:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // Create student object
        Student student = new Student(name, rollNumber, marks);

        // Display student info
        System.out.println("\n--- Student Report ---");
        student.displayInfo();

        sc.close();
    }
}
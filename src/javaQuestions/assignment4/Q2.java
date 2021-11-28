package javaQuestions.assignment4;

import java.util.*;

/*Create a Student Registration System Of College using private field and also implement with public mehtods .
You have to also use Constructors and public methods for this .also display registration slip after submitting details.
Hint(Student Name,dob,age,course,marks);
 */
public class Q2 {
    private String name,course,dob;
    private int age, marks;



    public Q2(String name, String course, String dob, int age, int marks)
    {
        this.name = name;
        this.course = course;
        this.dob = dob;
        this.age = age;
        this.marks = marks;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of student: ");
        String name = sc.nextLine();
        System.out.println("Enter the course: ");
        String course = sc.nextLine();
        System.out.println("Enter the date of birth [Date of birth should be in (dd/mm/yy) format: ");
        String dob = sc.nextLine();
        System.out.println("Enter the age of student: ");
        int age = sc.nextInt();
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();
        Q2 obj = new Q2(name,course,dob,age,marks);

        System.out.println("Student's name\t: "+name);
        System.out.println("Course: \t"+course);
        System.out.println("Date of Birth: \t"+dob);
        System.out.println("age: \t"+age);
        System.out.println("marks: \t"+marks);








    }
}
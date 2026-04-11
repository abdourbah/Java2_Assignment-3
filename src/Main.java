import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Create the ArrayList to stoere students
        ArrayList<Student> students = new ArrayList<>();

        //Now add students
        students.add(new Student(2001, "Haruna", Level.FIRST_YEAR, new int[]{60, 65, 70}));
        students.add(new Student(2002, "Lamin", Level.FOURTH_YEAR, new int[]{85, 75, 95}));
        students.add(new Student(2003, "Kumba", Level.THIRD_YEAR, new int[]{50, 35, 40}));
        students.add(new Student(2004, "Isatou", Level.SECOND_YEAR, new int[]{30, 35, 25}));
        students.add(new Student(2004, "Isatou", Level.FOURTH_YEAR, new int[]{75, 60, 55}));

        // Task A: Display all students
        System.out.println(students);


        // Task B: Display students with average >= 70
        // Task C: Display students in SECOND_YEAR
        // Task D: Find student with highest average
        // Task E: Count passed and failed students





    }
}

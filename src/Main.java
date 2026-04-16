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
        students.add(new Student(2005, "Cherno", Level.FOURTH_YEAR, new int[]{75, 60, 55}));

        // Task A: Display all students
        System.out.println("List of all added students: ");
        for (int i = 0; i<students.size(); i++) {
            students.get(i).displayStudentInfo();
        }


        // Task B: Display students with average >= 70
        System.out.println("Students with average above 70:");
        for (int i = 0; i<students.size(); i++) {
            if (students.get(i).calculateAverage() >= 70) {
                System.out.println(students.get(i).getName() + " " + students.get(i).calculateAverage());
            }
        }
        // Task C: Display students in SECOND_YEAR
        System.out.println("-----------------------------------------------");
        System.out.println("List of second year students");
        for (int i = 0; i<students.size(); i++) {
            if (students.get(i).getLevel() == Level.SECOND_YEAR) {
                System.out.println(students.get(i).getName() + " " + students.get(i).getId());
            }
        }
        // Task D: Find student with highest average
        System.out.println("-----------------------------------------------");

        System.out.println("Student with Highest score/Best student: " );
        Student bestStudent = students.get(0);//Assuming the first student is the best
        for (Student s : students) {
            if (s.calculateAverage() > bestStudent.calculateAverage()) {
                bestStudent = s;
            }
        }
        System.out.println();
        bestStudent.displayStudentInfo();


        // Task E: Count passed and failed students
        System.out.println();
        System.out.println("Number of students that passed or failed");
        int pass = 0;
        int fail = 0;
        for (Student s : students) {
            if (s.isPassed()) {
                pass++;
            } else {
                fail++;
            }
        }
        System.out.println("# of passed students: " + pass);
        System.out.println("# of failed students: " + fail);


    }
}

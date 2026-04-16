public class Student {

    // Initializing student class variables as private to demonstrate encapsulation
    private int id;
    private String name;
    private Level level;
    private int [] scores;// arraylist to hold scores

    // create method for student class
    public Student(int id, String name, Level level, int[] scores) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.scores = scores;

    }

    // create a method to get IDs
    public int getId(){
        return id;

    }
    // create method to get name
    public String getName() {
        return name;

    }
    // create method to get level

    public Level getLevel() {
        return level;
    }
    //create method to get scores


    public int[] getScores() {
        return scores;
    }

    // now create setter methods


    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // create method to calculate average
    public double calculateAverage() {
        // implement calculation logic using for-each loop
        int sum = 0;
        for (int score : scores){
            sum += score;
        }
        return (double) sum / scores.length;
    }
    //Create a method for finding the highest score
    public int findHighestScore() {
        /* Implementing the logic by assuming the first score is the highest
        * highest score changes whenever a greater score is encounter via looping through the scores
        *
        * */

        int highest = scores[0];
        for (int score : scores) {
            if (score > highest)
                highest = score;
        }
        return highest;
    }

    //create a method to find the lowest score
    public int findLowestScore() {
        int lowest = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        return lowest;
    }

    // method to calculate if a student passed
    public boolean isPassed () {
        if (calculateAverage() >= 50) {
            return true;
        } else {
            return false;
        }
        }
    // method to get the grades (Bonus question)
    public String getGrade() {
        double avg = calculateAverage();
        //Using if-else statements in logic
        if (avg >= 80) {
            return "A";
        } else if (avg >= 70) {
            return "B";
        } else if (avg >= 60) {
            return "C";
        } else if (avg >= 50) {
            return "D";
        } else if (avg >= 40) {
            return "E";
        }else {
            return "F";
        }
    }

    // create a method to display the student's information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);

        System.out.print("Scores: ");
        for (int i = 0; i < scores.length; i ++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + getGrade());// this is the bonus question
        System.out.println("Highest Score: " + findHighestScore());
        System.out.println("Lowest Score: " + findLowestScore());
        System.out.println("Scores above 70: " + countScoresAbove70()); // Bonus or extra method as required in the assignment
        System.out.println("Passed: " + isPassed());
        System.out.println("--------------------------------------------");
    }

    // Extra method to count scores above 70
    public int countScoresAbove70() {
        int count = 0;
        for (int i = 0 ;i < scores.length; i ++) {
            if (scores[i] > 70) {
                count++;
            }
        }
        return count;
    }


}



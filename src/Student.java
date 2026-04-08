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
}



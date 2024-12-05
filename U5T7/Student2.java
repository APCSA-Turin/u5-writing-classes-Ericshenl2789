public class Student2 {
    private String firstName;
    private int points;
    private static int totalPoints = 0;
    private static int greatestPoint = 0;

    public Student2(String fname){
        firstName = fname;
        points = 0;
    }

    public static int getTotalPointsEarned(){
        return totalPoints;
    }

    public static int getGreatestPoints(){
        return greatestPoint;
    }

    public void addPoints(int amount){
        totalPoints -= points;
        points += amount;
        totalPoints += points;
        if(points>greatestPoint){
            greatestPoint = points;
        }
    }

    public String studentInfo(){
        return "Student: " + firstName + "\nStudent's Points: " + points;
    }

    public static String classInfo(){
        return "Total points earned by all students: " + totalPoints + "\nMost points earned by any student: " + greatestPoint;
    }
}

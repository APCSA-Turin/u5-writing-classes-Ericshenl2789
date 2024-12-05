import java.util.Scanner;

public class Physics {
    private int time;
    private int roundTo;
    private String timeUnit;

    public Physics(int time, int roundTo, String timeUnit, Scanner scan){ //object starting from rest
        this.time = time;
        this.timeUnit = timeUnit;
        this.roundTo = roundTo;//roundTo is the place to round to. 10 for tenths place, 100 for 100ths place and so on.
    }

    private double round(double num){
        return Math.round(num * roundTo) / (double) roundTo; //B
    }

    public static int timeConversion(int time, String timeUnit){ // always rounds to seconds
        int result = time;
        if(timeUnit.toLowerCase().equals("year") ||timeUnit.toLowerCase().equals("years")){
            result*=31556952;
        } else if (timeUnit.toLowerCase().equals("day") ||timeUnit.toLowerCase().equals("days")){
            result *= 86400;
        } else if (timeUnit.toLowerCase().equals("hour") ||timeUnit.toLowerCase().equals("hours")){
            result *= 3600;
        } else if (timeUnit.toLowerCase().equals("minute") ||timeUnit.toLowerCase().equals("minutes")){
            result *= 60;
        }

        return result;
    }

    public double acceleration(double distance){
        time = timeConversion(time, timeUnit); //B   D
        return round((2*distance)/(time * time)); // B   C
    }

    public double forceFromGravity(double weightInPounds){
        return round(Utility.poundToKg(weightInPounds) * 9.81);  //  C  E
    }

    public void run(Scanner scan){
        System.out.println("Would you like to calculate acceleration with a random time (1) or Force exerted due to gravity on a person (2)? 3 to exit");
        int input = scan.nextInt();
        scan.nextLine();
        while (input != 3) {
            if (input == 1){
                System.out.println("What is the distance travelled by the object?");
                double distance = scan.nextDouble();
                scan.nextLine();
                System.out.println("The acceleration over " + distance + " meters in " + timeConversion(time, timeUnit) + " seconds is " + acceleration(distance));
            } else if (input == 2){
                System.out.println("What is the name of the person");
                String name = scan.nextLine();
                System.out.println("How much do they weigh in pounds?");
                int weight = scan.nextInt();
                scan.nextLine();
                System.out.println(name + "weighs " + weight + " lbs. The force exterted on them due to gravity is " + forceFromGravity(weight)+ " newtons.");
            }else {
                System.out.println("Try again.");
            }
            System.out.println("1) calculate accerlation\n2) caluclate force from gravity\n3)Exit");
            input = scan.nextInt();
        }
    }
}

public class Utility {
     private Utility(){}

     private static double roundHundredths(double num){
        return Math.round(num * 100)/100.0;
     }

     public static double poundToKg(double pound){ //A
        return roundHundredths(pound/2.205);
     }

     public static double distance(double speed, int time){
        return roundHundredths(time*speed);
     }
}

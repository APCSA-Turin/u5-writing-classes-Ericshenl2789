public class Temperature {
    private double highTemp;
    private double lowTemp;
    private String scale;

    public Temperature(double highTemp, double lowTemp, String scale){
        this.lowTemp = lowTemp;
        this.highTemp = highTemp;
        if((scale.equals("C")||scale.equals("F"))){
            this.scale = scale;
        } else{
            this.scale = "F";
        }
    }

    public static double convertCtoF(double C){
        return (C * 1.8) + 32;
    }

    public static double convertFtoC(double F){
        return (F - 32) * (5.0 / 9);
    }

    public void changeToC(){
        if(scale.equals("F")){
            lowTemp = Temperature.convertFtoC(lowTemp);
            highTemp = Temperature.convertFtoC(highTemp);
            scale = "C";
        }
    }

    public void changeToF(){
        if(scale.equals("C")){
            lowTemp = Temperature.convertCtoF(lowTemp);
            highTemp = Temperature.convertCtoF(highTemp);
            scale = "F";
        }
    }

    public String tempInfo(){
        return "High Temperature: " + highTemp + " " + scale + "\nLow Temperature: " + lowTemp + " " + scale;
    }
}

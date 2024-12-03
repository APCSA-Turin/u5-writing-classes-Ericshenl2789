public class RaceUtility {
    public static double milesToKm(double miles){
        return miles * 1.60934;
    }

    public static double kmToMiles(double km){
        return km / 1.60934;
    }

    public static String makeProper(String str){
        String result = "";
        String tempStr = str.toLowerCase();
        for(int i = 0; i < tempStr.length(); i ++){
            if(i == 0){
                result += tempStr.substring(0, 1).toUpperCase();
            }else{
                if(tempStr.substring(i-1, i).equals(" ")){
                    result += tempStr.substring(i, i + 1).toUpperCase();
                } else{
                    result += tempStr.substring(i, i+1);
                }
            }
        }
        return result;
    }
}

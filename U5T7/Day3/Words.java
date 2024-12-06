package Day3;
public class Words {
    private Words(){}

    public static boolean doesContain(String smallStr, String bigStr){
        return bigStr.contains(smallStr);
    }

    public static void printReverse(String str){
        String result = "";
        for (int i = str.length(); i > 0 ; i--){
            result += str.substring(i - 1 , i);
            if(i!= 1){
                result += " ";
            }
        }
        System.out.println(result);
    }
}

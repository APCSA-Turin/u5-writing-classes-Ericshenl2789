package Day3;
public class Nums{
    private int int1;
    private int int2;
    private int numOfGenerating;
    private static int totalNum = 0;

    public Nums(int int1, int int2){
        this.int1 = int1;
        this.int2 = int2;
        numOfGenerating = 0;
    }

    public int randBetween(){
        int max;
        int min;
        if(int1 > int2){
            max = int1;
            min = int2;
        } else {
            max = int2;
            min = int1;
        }
        numOfGenerating++;
        totalNum++;
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public int getRandomNumsGenerated(){
        return numOfGenerating;
    }

    public static int getTotalRandomNumsGenerated(){
        return totalNum;
    }
}
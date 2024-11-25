public class Prism {
    private int len;
    private int wid; 
    private int height;

    public Prism(int length, int width, int height){
        len = length;
        wid = width;
        this.height = height;
    }

    public Prism(int side){
        len = side;
        wid = side;
        height = side;
    }

    public Prism(){
        len = (int) (Math.random() * 91) + 10;
        wid = (int) (Math.random() * 91) + 10;
        height = (int) (Math.random() * 91) + 10;
    }

    public void setLength(int newLen){
        len = newLen;
    }

    public void setWidth(int newWid){
        wid = newWid;
    }

    public void setHeight(int newHeight){
        height = newHeight;
    }

    public String dimensions(){
        return "Lenght = " + len + ",\nWidth = " + wid + ",\nHeight = " + height;
    }

    public int volume(){
        return wid * len * height;
    }

    public int surfaceArea(){
        return 2 * (wid * len + height * len + height * wid); //from google, equation for surface area
    }
}
public class AdditionPattern{
  private int current;
  private int prev;
  private int addedNum;
  private int starting;
  
  public AdditionPattern(int starting, int addNum){
    current = starting;
    this.starting = starting;
    addedNum = addNum;
    prev = -1;
  }

  public int currentNumber(){
    return current;
  }

  public void next(){
    prev = current;
    current += addedNum;
  }

  public void prev(){
    if(prev != starting){
      current = prev;
      prev = current -= addedNum;
    }
  }
}




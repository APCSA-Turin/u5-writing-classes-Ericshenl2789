public class StepTracker{
    private int totalSteps;
    private int days;
    private int activeDays;
    private int minStep;
  
    public StepTracker (int minStep){
      this.minStep = minStep;
      totalSteps = 0;
      days = 0;
      activeDays = 0;
    }
  
    public int activeDays(){
      return activeDays;
    }
    
    public void addDailySteps(int steps){
      days++;
      totalSteps += steps;
      if(steps >= minStep){
         activeDays++;
      }
    }
   
    public double averageSteps(){
      if(days ==0 ){
        return 0;
      }
      return (double) totalSteps / days;
    }
  }

public class Student {
    private String name;
    private int gradeLevel;
    private String school;
  
    /* Write the two constructors here, as described above */
    public Student(String name, int gradeLevel, String school){
        this.name = name;
        this.gradeLevel = gradeLevel; 
        this.school = school;
    }

    public Student(String name, int gradeLevel){
        this.name = name;
        this.gradeLevel = gradeLevel;
        if(gradeLevel <= 12 && gradeLevel >= 9){
            school = "high school";
        } else if (gradeLevel <= 8 && gradeLevel >=6){
            school = "middle school";
        } else if (gradeLevel <= 5 && gradeLevel >= 1){
            school = "elementary school";
        } else {
            school = "unknown";
        }
    }

    public String studentInfo() {
      /* implement me, as described above */
      return name + " is in grade " + gradeLevel + " and goes to " + school;
    }
  }
  
  
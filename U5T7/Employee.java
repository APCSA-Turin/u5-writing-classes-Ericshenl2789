public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private static int recentId = 99;
    private static int totalEmployees = 0; 

    public Employee(String fName, String lName){
        firstName = fName;
        lastName = lName;
        employeeID = recentId + 1;
        recentId++;
        totalEmployees++;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
    
    public int getID(){
        return employeeID;
    }

    public static int getMostRecentEmployeeID(){
        return recentId;
    }

    public static int getTotalEmployeesCreated(){
        return totalEmployees;
    }

    public String employeeInfo(){
        String result = "--------------------------";
        result += "\nEmployee full name: " + getFullName();
        result += "\nEmployee ID: " + getID();
        result += "\nMost recent ID assigned: " + getMostRecentEmployeeID();
        result += "\nTotal employees hired: " + getTotalEmployeesCreated();
        result += "\n--------------------------";
        return result;
    }
}

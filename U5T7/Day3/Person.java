package Day3;

public class Person {
    private String name;
    private boolean vaccinationStatus;

    public Person(String name){
        this.name = name;
        vaccinationStatus = false;
    }

    public boolean isVaccinated(){
        return vaccinationStatus;
    }

    public String getName(){
        return name;
    }

    public void updateVaccinationStatus(){
        vaccinationStatus = true;
    }
}

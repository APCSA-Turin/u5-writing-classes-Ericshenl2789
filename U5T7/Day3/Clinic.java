package Day3;
public class Clinic {
    private int vaccinationNum;
    private Person recentPerson;
    private static int totalVaccinationNum = 0;
    private static int totalClinics = 0;

    public Clinic(){
        vaccinationNum = 0;
        totalClinics++;
    }

    public static int getTotalClinics(){
        return totalClinics;
    }

    public static int getTotalVaccineCount(){
        return totalVaccinationNum;
    }

    public int getClinicVaccineCount(){
        return vaccinationNum;
    }


    public Person mostRecentlyVaccinated(){
        return recentPerson;
    }

    public boolean vaccinate(Person person){
        if(person.isVaccinated()){
            return false;
        }
        person.updateVaccinationStatus();
        recentPerson = person;
        vaccinationNum++;
        totalVaccinationNum++;
        return true;
    }
}

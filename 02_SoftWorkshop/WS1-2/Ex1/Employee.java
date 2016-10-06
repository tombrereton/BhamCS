/**
 * This class defines an employee with the
 * parameters:
 * @param firstName Employee's firstname
 * @param surname Employee's last name
 * @param yearOfJoining Employee's start date
 * of the compnay
 * @author Thomas Brereton
 * @version 2016.10.06
 */

public class Employee{
    String firstName;
    String surname;
    int yearOfJoining;

    public Employee(String firstName,
                    String surname,
                    int yearOfJoining){
        this.firstName = firstName;
        this.surname = surname;
        this.yearOfJoining = yearOfJoining;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getYearOfJoining(){
        return this.yearOfJoining;
    }

    public void setSurname(String newSurname){
        this.surname = newSurname;
    }

    public String toString(){
        return this.firstName + " " + this.surname + " " + "joined in the year, " + this.yearOfJoining;
    }
}

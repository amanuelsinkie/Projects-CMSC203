import java.util.Date;
//Defining Patient class
/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Complete File with all classes and instances, each labeled above the starting code of each class
 * Due: 10/02/2024
 * Platform/compiler: VSCode
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Name: Amanuel Sinkie
*/
class Patient {
    //Member variables declarations
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private int phoneNumber;
    private String emergencyContactName;
    private int emergencyContactNumber;
    //The parameterized constructor for Patient class
    public Patient(String firstName, String middleName, String lastName, String address, String city, String state, int zipCode, int phoneNumber, String emergencyContactName, int emergencyContactNumber) 
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactNumber = emergencyContactNumber;
    }
    //Accessor and mutator methods of Patient class
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmergencyContactName() {
        return emergencyContactName;
    }
    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }
    public int getEmergencyContactNumber() {
        return emergencyContactNumber;
    }
    public void setEmergencyContactNumber(int emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }
}
//Defines the Procedure class
class Procedure {
    private String procedureName;
    private Date procedureDate;
    private String practitionerName;
    private double procedureCharge;
    //parameterized constructor for Procedure class
    public Procedure(String procedureName, Date procedureDate, String practitionerName, double procedureCharge) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharge = procedureCharge;
    }
    //accessor and mutator methods of Procedure class
    public String getProcedureName() {
        return procedureName;
    }
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }
    public Date getProcedureDate() {
        return procedureDate;
    }
    public void setProcedureDate(Date procedureDate) {
        this.procedureDate = procedureDate;
    }
    public String getPractitionerName() {
        return practitionerName;
    }
    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }
    public double getProcedureCharge() {
        return procedureCharge;
    }
    public void setProcedureCharge(double procedureCharge) {
        this.procedureCharge = procedureCharge;
    }
}
//The Main class: PatientDriverApp
class PatientDriverApp
{
//The Main function
public static void main(String[] args) {
    //Creating an instance of Patient class
    Patient patient = new Patient("Kevin", "", "Levin", "Car", "Idk", "idk", 11111, 348494944, "Geria Sinkie", 48484844);
    Date d = new Date();
    //Creating three instances of Procedure class
    Procedure procedure1 = new Procedure("Skin Mat Test", d, "Dr. Dad", 4000.00);
    Procedure procedure2 = new Procedure("Strength Test", d, "Dr. Alien", 0.00);
    Procedure procedure3 = new Procedure("Personality Test", d, "Dr. Not Kevin", 40.00);
    
    //Printing the patient information, procedure information and total charge
    System.out.println("_________________________________________________________________________________________________________");
    System.out.println("Patient Information:");
    System.out.println("_________________________________________________________________________________________________________");
    System.out.println("Name: " + patient.getFirstName() + " " + patient.getMiddleName() + " " + patient.getLastName());
    System.out.println("Address: " + patient.getAddress() + " " + patient.getCity() + ", " + patient.getState() + " " + patient.getZipCode());
    System.out.println("Phone Number: " + patient.getPhoneNumber());
    System.out.println("Emergency Contact Name: " + patient.getEmergencyContactName());
    System.out.println("Emergency Contact Number: " + patient.getEmergencyContactNumber());
    System.out.println("_________________________________________________________________________________________________________");
    System.out.println("Procedure Name:\t\t " + "Procedure Date:\t\t\t" + "Practitioner Name:\t" + "Procedure Charge:");
    System.out.println("_________________________________________________________________________________________________________");
    System.out.println(procedure1.getProcedureName() + "\t\t" + procedure1.getProcedureDate() + "\t\t" + procedure1.getPractitionerName() + "\t\t\t" + procedure1.getProcedureCharge());
    System.out.println(procedure2.getProcedureName() + "\t\t" + procedure2.getProcedureDate() + "\t\t" + procedure2.getPractitionerName() + "\t\t" + procedure2.getProcedureCharge());
    System.out.println(procedure3.getProcedureName() + "\t" + procedure3.getProcedureDate() + "\t\t" + procedure3.getPractitionerName() + "\t\t" + procedure3.getProcedureCharge());
    double totalCharge = procedure1.getProcedureCharge() + procedure2.getProcedureCharge() + procedure3.getProcedureCharge();
    String totalCharge2decs = String.format("%.2f", totalCharge);
    System.out.println("_________________________________________________________________________________________________________");
    System.out.println("Total Charge: " + totalCharge2decs);
    System.out.println("_________________________________________________________________________________________________________");
}
}
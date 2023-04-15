import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

class Doctor {
    private String fullName;
    private String contactNumber;

    Doctor(String fullName, String contactNumber) {
        this.fullName = fullName;
        this.contactNumber = contactNumber;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

}

class Patient {
    private String fullName;
    private String contactNumber;

    Patient(String fullName, String contactNumber) {
        this.fullName = fullName;
        this.contactNumber = contactNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

}

class Hospital {

    private String hospitalName;
    private String contactNumber;
    private LinkedHashMap<String, Doctor[]> deptDoctorsDirectory = new LinkedHashMap<String, Doctor[]>();

    Hospital(String hospitalName, String contactNumber) {
        this.hospitalName = hospitalName;
        this.contactNumber = contactNumber;
        setData();
    }

    // Inserting sample data into deptDoctorsDirectory
    public void setData() {
        Doctor[] gastroenterology = new Doctor[2];
        gastroenterology[0] = new Doctor("Aman Shah", "+91-99xxxxxxxx");
        gastroenterology[1] = new Doctor("Tanmay Jain", "+91-99xxxxxxxx");

        Doctor[] orthopedics = new Doctor[2];
        orthopedics[0] = new Doctor("Suman Tyagi", "+91-99xxxxxxxx");
        orthopedics[1] = new Doctor("Viraj Dey", "+91-99xxxxxxxx");

        Doctor[] nephrology = new Doctor[2];
        nephrology[0] = new Doctor("Naman Gandhi", "+91-99xxxxxxxx");
        nephrology[1] = new Doctor("Vinit Rao", "+91-99xxxxxxxx");

        deptDoctorsDirectory.put("Gastroenterology", gastroenterology);
        deptDoctorsDirectory.put("Orthoprdics", orthopedics);
        deptDoctorsDirectory.put("Nephrology", nephrology);
    }

    public String getName() {
        return this.hospitalName;
    }

    public LinkedHashMap getDeptDoctorsDirectory() {
        return this.deptDoctorsDirectory;
    }

}

public class Application {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Lifecare Multispeciality Hospital, Pune",
                "+91-91xxxxxx98");
        System.out.println("\n\n-----------------Welcome to " + hospital.getName() + " ---------------------");
        while (true) {
            System.out.println("\n\nPlease select from menu");
            System.out.println("1. Check Available Departments/Specialities");
            System.out.println("2. Check Doctors Specialitywise");
            System.out.println("3. Book Appointment");
            System.out.println("4. Exit");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {

                // Inquiry of departments/specializations
                case 1: {
                    Iterator itr = hospital.getDeptDoctorsDirectory().keySet().iterator();
                    System.out.println("\n\n--------Available Departments/Specialities----------");
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
                }

                // Inquiry of doctors/specializations
                case 2: {
                    Iterator itr = hospital.getDeptDoctorsDirectory().keySet().iterator();
                    System.out.println("--------Available Doctors/Specialities---------------");
                    System.out.println("\n");
                    while (itr.hasNext()) {
                        String deptName = itr.next().toString();
                        System.out.println("-------------------" + deptName + "----------------");
                        for (Doctor doctor : (Doctor[]) hospital.getDeptDoctorsDirectory().get(deptName)) {
                            System.out
                                    .println("\t" + doctor.getFullName() + "\n\tContact " + doctor.getContactNumber());
                            System.out.println("\t-----------------------");
                        }
                    }
                    break;
                }

                // Appointment booking
                case 3: {
                    System.out.println("Please Enter Your Name : ");
                    String name = new Scanner(System.in).nextLine();

                    System.out.println("\nPlease Enter Your Contact Number : ");
                    String contactNumber = new Scanner(System.in).nextLine();

                    Patient pt = new Patient(name, contactNumber);

                    System.out
                            .println("\nGreat " + pt.getFullName()
                                    + " now please select department from below (number)");

                    Iterator itr = hospital.getDeptDoctorsDirectory().keySet().iterator();

                    System.out.println("--------Available Departments/Specialities----------");
                    int index = 1;
                    while (itr.hasNext()) {
                        System.out.println(index++ + ". " + itr.next());
                    }

                    itr = hospital.getDeptDoctorsDirectory().keySet().iterator();
                    int choosedSpecialityIndex = new Scanner(System.in).nextInt();
                    String choosedSpeciality = "";
                    index = 0;
                    while (itr.hasNext()) {
                        choosedSpeciality = (String) itr.next();
                        if (index == choosedSpecialityIndex - 1) {
                            break;
                        }
                        index++;
                    }

                    System.out.println(
                            "\nGreat " + pt.getFullName() + " now choose doctor you want to consult with (number)");
                    String choosedDoctor = "";
                    index = 0;
                    Doctor doctor[] = (Doctor[]) hospital.getDeptDoctorsDirectory().get(choosedSpeciality);
                    for (int i = 0; i < doctor.length; i++) {
                        System.out.println((i + 1) + ". " + doctor[i].getFullName());
                    }
                    index = new Scanner(System.in).nextInt();
                    try {
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println(
                                "Great " + pt.getFullName() + " Your appointment is scheduled in " + choosedSpeciality
                                        + " with " + doctor[index - 1].getFullName());
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    } catch (Exception e) {
                        System.out.println("Invalid input please try again");
                        continue;
                    }
                    break;
                }

                case 4: {
                    System.exit(0);
                }
            }
        }
    }
}

/*
 * OUTPUT
 * -----------------Welcome to Lifecare Multispeciality Hospital, Pune
 * ---------------------
 * 
 * 
 * Please select from menu
 * 1. Check Available Departments/Specialities
 * 2. Check Doctors Specialitywise
 * 3. Book Appointment
 * 4. Exit
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++
 * 1
 * 
 * 
 * --------Available Departments/Specialities----------
 * Gastroenterology
 * Orthoprdics
 * Nephrology
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++
 * 
 * 
 * Please select from menu
 * 1. Check Available Departments/Specialities
 * 2. Check Doctors Specialitywise
 * 3. Book Appointment
 * 4. Exit
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++
 * 2
 * --------Available Doctors/Specialities---------------
 * 
 * 
 * -------------------Gastroenterology----------------
 * Aman Shah
 * Contact +91-99xxxxxxxx
 * -----------------------
 * Tanmay Jain
 * Contact +91-99xxxxxxxx
 * -----------------------
 * -------------------Orthoprdics----------------
 * Suman Tyagi
 * Contact +91-99xxxxxxxx
 * -----------------------
 * Viraj Dey
 * Contact +91-99xxxxxxxx
 * -----------------------
 * -------------------Nephrology----------------
 * Naman Gandhi
 * Contact +91-99xxxxxxxx
 * -----------------------
 * Vinit Rao
 * Contact +91-99xxxxxxxx
 * -----------------------
 * 
 * 
 * Please select from menu
 * 1. Check Available Departments/Specialities
 * 2. Check Doctors Specialitywise
 * 3. Book Appointment
 * 4. Exit
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++
 * 3
 * Please Enter Your Name :
 * Pravin
 * 
 * Please Enter Your Contact Number :
 * 9876543210
 * 
 * Great Pravin now please select department from below (number)
 * --------Available Departments/Specialities----------
 * 1. Gastroenterology
 * 2. Orthoprdics
 * 3. Nephrology
 * 1
 * 
 * Great Pravin now choose doctor you want to consult with (number)
 * 1. Aman Shah
 * 2. Tanmay Jain
 * 2
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Great Pravin Your appointment is scheduled in Gastroenterology with Tanmay
 * Jain
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
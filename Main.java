//Vighnesh Sivaprakasam, Naomi Osandu, Nirmala Kc
import java.util.Scanner;
import java.util.Date;
import java.util.Random;
public class Main {
    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 65;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age < MIN_AGE || age > MAX_AGE) {
            System.out.println("Sorry, you are not eligible for medical treatment.");
        } else {
            System.out.println("Please enter your symptom from the selection: stomachache fever sadness headache ");
            scanner.nextLine();
            String symptoms = scanner.nextLine();
            int medication = GeneralMed.prescribeMedication(symptoms);
            GeneralMed.printPrescription(medication);
            MedicalTreatment treatment = new MedicalTreatment(name);
            treatment.startTreatment();
            Prescription prescription1 = new Prescription(symptoms);
            System.out.println("Prescribed medication for " + symptoms +": " + prescription1.getMedication());
            System.out.println("Total number of prescriptions: " + Prescription.getNumPrescriptions());
        }
    }
}

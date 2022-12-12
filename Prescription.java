import java.util.Random;
public class Prescription {
    private static int numPrescriptions = 0;
    private final String symptoms;
    private String medication;
    public Prescription(String symptoms) {
        this.symptoms = symptoms;
        generatePrescription();
        numPrescriptions++;
    }
    public static int getNumPrescriptions() {
        return numPrescriptions;
    }
    private void generatePrescription() {
        Random rand = new Random();
        int choice = rand.nextInt(3);
        if (symptoms.equals("headache")) {
            if (choice == 0) {
                medication = "Ibuprofen";
            } else if (choice == 1) {
                medication = "Aspirin";
            } else {
                medication = "Acetaminophen";
            }
        } else if (symptoms.equals("stomachache")) {
            if (choice == 0) {
                medication = "Pepto-Bismol";
            } else if (choice == 1) {
                medication = "Antacid";
            } else {
                medication = "Loperamide";
            }
        } else {
            medication = "Consult a doctor";
        }
    }
    public String getMedication() {
        return medication;
    }
}